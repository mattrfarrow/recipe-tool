package recipes


object Main {

  def main(args: Array[String]): Unit = {

    println("Recipe Thing 0.1")
    println("----------------")
    println()

    val allRecipesByName = RecipeData.allRecipes.map(recipe => (recipe.name, recipe)).toMap

    val recipeNames = args
    val recipeNamesAndQuantities = args.map(ArgsParser.parseArgument)
    val recipesAndQuantities = recipeNamesAndQuantities.map(r => RecipeAndMultiples(allRecipesByName.getOrElse(r.recipeName, throw new Exception("No recipe with name "+r.recipeName)), r.multiples))

    val merged = IngredientListMerger.merge(recipesAndQuantities)

    merged.foreach { ingredientWithRecipes =>
      println(ingredientWithRecipes.sizedIngredient + "   (for " + ingredientWithRecipes.usages.map(_.name).mkString(", ") + ")")
    }
  }

}
