package recipes


object Main {

  def main(args: Array[String]): Unit = {

    println("Recipe Thing 0.1")
    println("----------------")
    println()

    val allRecipesByName = RecipeData.allRecipes.map(recipe => (recipe.name, recipe)).toMap

    val recipeNames = args
    val recipeNamesAndQuantities = args.map(ArgsParser.parseArgument)

    println("Selected recipes:")
    for(recipeAndQuantity <- recipeNamesAndQuantities) {
      println(recipeAndQuantity.multiples + " x " + recipeAndQuantity.recipeName)
    }
    println()


    val recipesAndQuantities = recipeNamesAndQuantities.map(r => RecipeAndMultiples(allRecipesByName.getOrElse(r.recipeName, throw new Exception("No recipe with name "+r.recipeName)), r.multiples))

    val mergedIngredients = IngredientListMerger.merge(recipesAndQuantities)

    printIngredientsWithMissingWeightInfo(RecipeData.allRecipes)
    println()

    val freshnessGroups = mergedIngredients.groupBy(_.sizedIngredient.freshness)

    freshnessGroups.foreach { ingredients =>
      val freshness = ingredients._1
      val ingredientsThisFresh = ingredients._2

      println(freshness.name.capitalize + ":")

      def sort(s1: IngredientQuantityWithContributingRecipes, s2: IngredientQuantityWithContributingRecipes) = {
        s1.usages.map(_.name).mkString(",").compareTo(s2.usages.map(_.name).mkString(",")) < 0
      }
      val mergedIngredientsSorted = ingredientsThisFresh.sortWith(sort)

      mergedIngredientsSorted.foreach { ingredientWithRecipes =>
        println(ingredientWithRecipes.sizedIngredient + "   (for " + ingredientWithRecipes.usages.map(_.name).mkString(", ") + ")")

      }
      println()
    }
  }

  private def printIngredientsWithMissingWeightInfo(recipes: List[Recipe]) {
    val ingredientsInTspOrTbsp: Set[IngredientQuantity] = recipes.flatMap(
      _.ingredients
        .filter(i => i.quantity.measurementUnit==MeasurementUnit.tbsp || i.quantity.measurementUnit==MeasurementUnit.tsp)
    ).toSet

    ingredientsInTspOrTbsp.foreach(i => println(i.ingredient.names + " is in "+i.quantity.measurementUnit.name))
  }

}
