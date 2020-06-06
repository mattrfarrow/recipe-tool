package recipes


object Main {

  def main(args: Array[String]): Unit = {

    println("Recipe Thing 0.1")
    println("----------------")
    println()

    val recipeNames = args
    val recipeNamesAndQuantities = args.map(ArgsParser.parseArgument)

    println("Selected recipes:")
    for(recipeAndQuantity <- recipeNamesAndQuantities) {
      println(recipeAndQuantity.multiples + " x " + recipeAndQuantity.recipeName)
    }
    println()

    val combinedRecipes: Seq[IngredientQuantityWithContributingRecipes] = combineRecipes(recipeNamesAndQuantities)

    val freshnessGroups = combinedRecipes.groupBy(_.sizedIngredient.freshness)

    freshnessGroups.foreach { ingredients =>
      val freshness = ingredients._1
      val ingredientsThisFresh = ingredients._2

      println(freshness.name.capitalize + ":")

      def sort(s1: IngredientQuantityWithContributingRecipes, s2: IngredientQuantityWithContributingRecipes) = {
        s1.usages.map(_.name).mkString(",").compareTo(s2.usages.map(_.name).mkString(",")) < 0
      }
      val mergedIngredientsSorted = ingredientsThisFresh.sortWith(sort)

      mergedIngredientsSorted.sortBy(i => i.sizedIngredient.ingredient.names.head).foreach { ingredientWithRecipes =>
        val ingredientString:String = ingredientWithRecipes.sizedIngredient.toString().padTo(25, ' ')
        println("  □ " + ingredientString + " (" + ingredientWithRecipes.usages.map(_.name).mkString(", ") + ")")
      }
      println()
    }
  }

  private def combineRecipes(recipeNamesAndQuantities: Array[RecipeNameAndMultiples]) = {
    val allRecipesByName = RecipeData.allRecipes
      .map(populateIngredients(_, Ingredients.ingredientsMap))
      .map(recipe => (recipe.name, recipe)).toMap

    val recipesAndQuantities = recipeNamesAndQuantities.map(r => RecipeAndMultiples(allRecipesByName.getOrElse(r.recipeName, throw new Exception("No recipe with name " + r.recipeName)), r.multiples))

    val mergedIngredients = IngredientListMerger.merge(recipesAndQuantities)

    val mergedAndSimplifiedIngredients = mergedIngredients.map(i =>
      IngredientQuantityWithContributingRecipes(QuantityConvertor.convertSpoonsToGrams(i.sizedIngredient), i.usages)
    )
    mergedAndSimplifiedIngredients
  }

  private def populateIngredients(recipe: Recipe, ingredientData: Map[String, Ingredient]): Recipe =
    recipe.copy(ingredients = recipe.ingredients.map(in => in.copy(ingredient = ingredientData.getOrElse(in.ingredient.preferredName, in.ingredient))))

}
