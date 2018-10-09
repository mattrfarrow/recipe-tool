package recipes

import recipes.IngredientQuantity.ingredient
import recipes.Quantity._

object RecipeData {

  val lentil_bolognese = Recipe("lentil_bolognese",
    List(
      ingredient(number(1), "onion"),
      ingredient(some(), "garlic"),
      ingredient(slosh(),   "vegetable oil"),
      ingredient(grams(320), "red lentils"),
      ingredient(tins(2), "chopped tomatoes"),
      ingredient(grams(400), "brown pasta")
      //optional additional veg like fresh tomatoes, red peppers, carrots, celery or mushrooms
    )
  )

  val chilli = Recipe("chilli",
    List(
      ingredient(number(1), "onion"),
      ingredient(number(1), "bell pepper"),
      ingredient(cloves(2), "garlic"),
      ingredient(tsp(3), "vegetable oil"),
      ingredient(number(1), "chilli or jalapeno"),
      ingredient(number(5), "sun dried tomatoes"),
      ingredient(cups(0.5), "vegetable stock"),
      ingredient(tins(0.5), "sweetcorn"),
      ingredient(tins(1), "chopped tomatoes"),
      ingredient(tins(1), "green lentils"),
      ingredient(tbsp(1), "tomato puree"),
      ingredient(tsp(1), "cumin"),
      ingredient(tsp(1), "paprika"),
      ingredient(tsp(1), "oregano"),
      ingredient(some(), "salt and pepper")
    )
  )

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


  val aubergine_casserole = Recipe("aubergine_casserole",
    List(
      ingredient(number(1), "aubergine"),
      ingredient(tins(1), "cannelini beans"),
      ingredient(tins(1), "chick peas"),
      ingredient(tsp(1), "chilli powder"),
      ingredient(tsp(1.5), "smoked paprika"),
      ingredient(tbsp(1), "tahini")
    ))

  //1 Teaspoon dried Chilli Powder,
  //1.5 Teaspoons Smoked Paprika,
  //1 Tablespoon Tomato Paste,
  //2 Cans Chopped Tomatoes,
  //1 Tablespoon Tahini,
  //Salt and Pepper to taste.

  val tofu_noodle_soup = Recipe("tofu_noodle_soup",
    List(
      ingredient(number(2), "pack tofu"),
      ingredient(number(2), "wholewheat noodles"),
      ingredient(number(2), "pack pak choi"),
      ingredient(number(2), "pack tofu"),
      ingredient(number(2), "stock")

    ))

  // 2 portions
  val breakfast = Recipe("breakfast",
    List(
      ingredient(grams(160), "porridge"),
      ingredient(ml(600), "oat milk"),
      ingredient(grams(30), "nuts"),
      ingredient(tbsp(1), "flaxseeds"),
      ingredient(grams(150), "frozen fruit with lots of cherries")
    ))

  val regular_items = Recipe("regular_items",
    List(
      ingredient(number(1), "whole_milk"),
      ingredient(number(1), "apple"),
      ingredient(number(1), "banana"),
      ingredient(number(1), "easy peeler"),
      ingredient(number(1), "weetabix")
      //Tea,
      //hippy tea
    )
  )

  val seeded_wholemeal_bread = Recipe("seeded_wholemeal_bread", List(
    ingredient(tsp(1), "yeast"),
    ingredient(grams(475), "strong wholemeal bread flour"),
    ingredient(tsp(1.5), "sugar"),
    ingredient(grams(25), "butter"),
    ingredient(tsp(1.25), "salt"),
    ingredient(tbsp(1.5), "sesame seeds"),
    ingredient(tbsp(1.5), "poppy seeds"),
    ingredient(ml(350), "water"),
    ingredient(tbsp(1.5), "linseeds"),
    ingredient(tbsp(1.5), "pumpkin seeds"),
    ingredient(tbsp(1.5), "sunflower seeds")
  ))

  lazy val saag_tofu = Recipe("saag_tofu",
    List(
      ingredient(number(2), "pack tofu"),
      ingredient(number(1), "onion"),
      ingredient(grams(400), "spinach"), // quantity?
      ingredient(tsp(1), "fresh ginger"),// quantity?
      ingredient(tsp(1), "garam masala"),// quantity?
      ingredient(tsp(5), "vegan yoghurt")// quantity?
    )
  )

  lazy val blackbean_burritos = ???

  val allRecipes = List(
    breakfast,
    chickpea_curry, chilli, aubergine_casserole, tofu_noodle_soup,
    lentil_bolognese,// saag_tofu, blackbean_burritos,
    seeded_wholemeal_bread,
    regular_items)

  // add carbs
  // side veg?
  // rest of the recipes
  // convert tsp and tbsp into grams
  // convert ml into litres?
  // add regular items
  // fresh, dried, frozen, tinned

}
