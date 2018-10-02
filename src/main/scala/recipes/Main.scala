package recipes

import recipes.IngredientQuantity.ingredient
import recipes.Quantity._

object Main {

  def main(args: Array[String]): Unit = {

    println("Recipe Thing 0.1")
    println()

    val recipe1 = Recipe("chickpea-curry",
      List(
        ingredient(number(1), "onion"),
        ingredient(slosh(), "vegetable oil"),
        ingredient(grams(70), "sesame seeds"),
        ingredient(tsp(4), "garam masala"),
        ingredient(tsp(2), "curry powder"),
        ingredient(tsp(0.25), "cayenne pepper"),
        ingredient(tsp(0.25), "chilli powder"),
        ingredient(grams(300), "brown rice"),
        ingredient(tins(2), "chickpeas")
      ) //2 x 400g tins of chickpeas

    )
    val recipe2 = Recipe("breakfast",
      List(
        ingredient(grams(1), "onion"),
        ingredient(grams(400), "white loaf")
      ))

    val allRecipes = List(recipe1, recipe2)
    val allRecipesByName = allRecipes.map(recipe => (recipe.name, recipe)).toMap

    val recipeNames = args
    val recipesAndQuantities = args.map(ArgsParser.parseArgument)
    //val recipes = recipesAndQuantities.map(recipeAndQuantity => allRecipesByName.getOrElse(recipeAndQuantity.recipeName, throw new Exception("No recipe with name "+/recipeName)))

    val merged = IngredientListMerger.merge(allRecipes)

    merged.foreach { ingredientWithRecipes =>
      println(ingredientWithRecipes.sizedIngredient + "   (for " + ingredientWithRecipes.usages.map(_.name).mkString(", ") + ")")
    }
  }

}
