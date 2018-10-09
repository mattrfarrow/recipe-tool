package recipes

import recipes.IngredientQuantity.ingredient
import recipes.Quantity._
import Freshness._

object RecipeData {

  val lentil_bolognese = Recipe("lentil_bolognese",
    List(
      ingredient(number(1), "onion"),
      ingredient(cloves(2), "garlic"),
      ingredient(slosh(),   "vegetable oil", store_cupboard),
      ingredient(grams(320), "red lentils", dried),
      ingredient(tins(2), "chopped tomatoes", store_cupboard),
      ingredient(grams(400), "brown pasta", dried)
      //optional additional veg like fresh tomatoes, red peppers, carrots, celery or mushrooms
    )
  )

  val chilli = Recipe("chilli",
    List(
      ingredient(number(1), "onion"),
      ingredient(number(1), "bell pepper"),
      ingredient(cloves(2), "garlic"),
      ingredient(tsp(3), "vegetable oil", store_cupboard),
      ingredient(number(1), "chilli or jalapeno"),
      ingredient(number(5), "sun dried tomatoes", dried),
      ingredient(cups(0.5), "vegetable stock", store_cupboard),
      ingredient(tins(0.5), "sweetcorn", store_cupboard),
      ingredient(tins(1), "chopped tomatoes", store_cupboard),
      ingredient(tins(1), "green lentils", store_cupboard),
      ingredient(tbsp(1), "tomato puree", store_cupboard),
      ingredient(tsp(1), "cumin", dried),
      ingredient(tsp(1), "paprika", dried),
      ingredient(tsp(1), "oregano", dried),
      ingredient(some(), "salt and pepper", store_cupboard)
    )
  )

  val chickpea_curry = Recipe("chickpea_curry",
    List(
      ingredient(number(1), "onion"),
      ingredient(slosh(), "vegetable oil", store_cupboard),
      ingredient(grams(70), "sesame seeds", dried),
      ingredient(tsp(4), "garam masala", dried),
      ingredient(tsp(2), "curry powder", dried),
      ingredient(tsp(0.25), "cayenne pepper", dried),
      ingredient(tsp(0.25), "chilli powder", dried),
      ingredient(grams(300), "brown rice", store_cupboard),
      ingredient(tins(2), "chickpeas", store_cupboard)
    )
  )


  val aubergine_casserole = Recipe("aubergine_casserole",
    List(
      ingredient(number(1), "aubergine"),
      ingredient(tins(1), "cannelini beans", store_cupboard),
      ingredient(tins(1), "chick peas", store_cupboard),
      ingredient(tsp(1), "chilli powder", dried),
      ingredient(tsp(1.5), "smoked paprika", dried),
      ingredient(tbsp(1), "tahini", store_cupboard)
    ))

  val tofu_noodle_soup = Recipe("tofu_noodle_soup",
    List(
      ingredient(number(2), "pack tofu"),
      ingredient(number(2), "wholewheat noodles", store_cupboard),
      ingredient(number(2), "pack pak choi"),
      ingredient(number(2), "pack tofu"),
      ingredient(number(2), "stock", store_cupboard)

    ))

  // 2 portions
  val breakfast = Recipe("breakfast",
    List(
      ingredient(grams(160), "porridge oats", store_cupboard),
      ingredient(ml(600), "UHT oat milk", store_cupboard),
      ingredient(grams(30), "nuts", store_cupboard),
      ingredient(tbsp(1), "flaxseeds", store_cupboard),
      ingredient(grams(150), "frozen fruit with lots of cherries", frozen)
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
    ingredient(tsp(1), "yeast", store_cupboard),
    ingredient(grams(475), "strong wholemeal bread flour", store_cupboard),
    ingredient(tsp(1.5), "sugar", store_cupboard),
    ingredient(grams(25), "vegetable oil", store_cupboard),
    ingredient(tsp(1.25), "salt", store_cupboard),
    ingredient(tbsp(1.5), "sesame seeds", dried),
    ingredient(tbsp(1.5), "poppy seeds", dried),
    ingredient(ml(350), "water", tap),
    ingredient(tbsp(1.5), "linseeds", dried),
    ingredient(tbsp(1.5), "pumpkin seeds", dried),
    ingredient(tbsp(1.5), "sunflower seeds", dried)
  ))

  lazy val saag_tofu = Recipe("saag_tofu",
    List(
      ingredient(number(2), "pack tofu"),
      ingredient(number(1), "onion"),
      ingredient(grams(400), "spinach"), // quantity?
      ingredient(tsp(1), "fresh ginger"),// quantity?
      ingredient(tsp(1), "garam masala", dried),// quantity?
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
  // convert tsp and tbsp into grams
  // convert ml into litres?
  // make regular items make sense

}
