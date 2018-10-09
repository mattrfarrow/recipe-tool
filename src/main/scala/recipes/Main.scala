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

    def sort(s1: IngredientQuantityWithContributingRecipes, s2: IngredientQuantityWithContributingRecipes) = {
      s1.usages.map(_.name).mkString(",").compareTo(s2.usages.map(_.name).mkString(",")) < 0
    }

    val mergedIngredientsSorted = mergedIngredients.sortWith(sort)

    mergedIngredientsSorted.foreach { ingredientWithRecipes =>
      println(ingredientWithRecipes.sizedIngredient + "   (for " + ingredientWithRecipes.usages.map(_.name).mkString(", ") + ")")
    }
  }

}
