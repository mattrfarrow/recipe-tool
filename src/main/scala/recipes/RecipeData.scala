package recipes

import recipes.IngredientQuantity.ingredient
import recipes.Quantity._

object RecipeData {

  val chickpea_curry = Recipe("chickpea_curry",
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
    )
  )

  val breakfast = Recipe("breakfast",
    List(
      ingredient(grams(1), "onion"),
      ingredient(grams(400), "white loaf")
    ))

  val allRecipes = List(chickpea_curry, breakfast)

}
