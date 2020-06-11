package recipes

import recipes.IngredientQuantity.ingredient
import recipes.Quantity._
import Freshness._

object RecipeData {

  val lentil_bolognese: Recipe = Recipe("lentil_bolognese",
    List(
      ingredient(number(1), "onion"),
      ingredient(cloves(2), "garlic"),
      ingredient(slosh(),   "vegetable oil", store_cupboard),
      ingredient(grams(320), "red lentils", dried),
      ingredient(tins(2), "tomatoes (chopped)", store_cupboard),
      ingredient(grams(400), "brown pasta", dried)
      //optional additional veg like fresh tomatoes, red peppers, carrots, celery or mushrooms
    )
  )

  val chilli: Recipe = Recipe("chilli",
    List(
      ingredient(number(1), "onion"),
      ingredient(number(1), "bell pepper"),
      ingredient(cloves(2), "garlic"),
      ingredient(tsp(3), "vegetable oil", store_cupboard),
      ingredient(number(1), "chilli or jalapeno"),
      ingredient(number(5), "sun dried tomatoes", dried),
      ingredient(some(), "stock powder", store_cupboard),
      ingredient(tins(0.5), "sweetcorn", store_cupboard),
      ingredient(tins(1), "tomatoes (chopped)", store_cupboard),
      ingredient(tins(1), "green lentils", store_cupboard),
      ingredient(tbsp(1), "tomato puree", store_cupboard),
      ingredient(tsp(1), "cumin", dried),
      ingredient(tsp(1), "paprika", dried),
      ingredient(tsp(1), "oregano", dried),
      ingredient(some(), "salt and pepper", store_cupboard)
    )
  )

  val chickpea_curry: Recipe = Recipe("chickpea_curry",
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

  val tofu_noodle_soup: Recipe = Recipe("tofu_noodle_soup",
    List(
      ingredient(packs(2), "tofu", refrigerated),
      ingredient(number(2), "wholewheat noodles", store_cupboard),
      ingredient(packs(2), "pak choi"),
      ingredient(some(), "stock powder", store_cupboard)

    ))

  val breakfast: Recipe = Recipe("breakfast",
    List(
      ingredient(grams(160), "porridge oats", store_cupboard),
      ingredient(ml(600), "UHT oat milk", store_cupboard),
      ingredient(grams(30), "nuts", store_cupboard),
      ingredient(tbsp(1), "flaxseeds", store_cupboard),
      ingredient(grams(150), "frozen fruit with lots of cherries", frozen)
    ))

  val regular_items: Recipe = Recipe("regular_items",
    List(
      ingredient(some(), "whole_milk", refrigerated),
      ingredient(some(), "apples", fresh),
      ingredient(some(), "margarine", fresh),
      ingredient(some(), "pesto (vegan)", store_cupboard),
      ingredient(some(), "jam", store_cupboard),
      ingredient(some(), "weetabix", store_cupboard),
      ingredient(some(), "Tea", store_cupboard),
      ingredient(some(), "Hippy Tea", store_cupboard),
      ingredient(some(), "Nappies", non_food),
      ingredient(some(), "Baby wipes", non_food),
      ingredient(some(), "sultanas", store_cupboard),
      ingredient(some(), "porridge", store_cupboard),
      ingredient(some(), "squash", store_cupboard)
    )
  )

  val seeded_wholemeal_bread: Recipe = Recipe("seeded_wholemeal_bread", List(
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

  lazy val saag_tofu: Recipe = Recipe("saag_tofu",
    List(
      ingredient(packs(2), "tofu", refrigerated),
      ingredient(number(1), "onion"),
      ingredient(grams(400), "spinach"), // quantity?
      ingredient(tsp(1), "fresh ginger"),// quantity?
      ingredient(tsp(1), "garam masala", dried),// quantity?
      ingredient(tsp(5), "vegan yoghurt", refrigerated)// quantity?
    )
  )

  lazy val stir_fry: Recipe = Recipe("stir_fry",
    List(
      ingredient(packs(1), "noodles", store_cupboard),
      ingredient(packs(2), "tofu", refrigerated),
      ingredient(some(), "spring onions"),
      ingredient(some(), "garlic"),
      ingredient(tsp(1), "fresh ginger"),
      ingredient(number(2), "peppers", fresh),
      ingredient(packs(1), "pak choi")
    )
  )

  lazy val burgers: Recipe = Recipe("burgers",
    List(
      ingredient(number(4), "veggie burgers", refrigerated),
      ingredient(number(4), "burger buns", store_cupboard),
      ingredient(some(), "leaves"),
      ingredient(some(), "cucumber"),
      ingredient(some(), "tomatoes", fresh),
      ingredient(some(), "sweet potato")
    )
  )

  lazy val simple_pinto_wraps: Recipe = Recipe("simple_pinto_wraps",
    List(
      ingredient(packs(1), "wraps", store_cupboard),
      ingredient(number(2), "courgettes"),
      ingredient(number(3), "peppers"),
      ingredient(some(), "coriander"),
      ingredient(tins(2), "tomatoes (chopped)", store_cupboard),
      ingredient(tins(2), "pinto beans", store_cupboard),
      ingredient(number(2), "avocado")
    )
  )

  lazy val beetroot_soup: Recipe = Recipe("beetroot_soup",
    List(
      ingredient(packs(2), "beetroot"),
      ingredient(number(1), "fennel"),
      ingredient(tins(1), "cannelini beans", store_cupboard),
      ingredient(some(), "stock powder", store_cupboard)
    )
  )

  lazy val jackets_with_beans: Recipe = Recipe("jackets_with_beans",
    List(
      ingredient(number(1), "jacket potatoes"),
      ingredient(tins(1), "haricot beans", store_cupboard),
      ingredient(tins(1), "passata", store_cupboard)
    ))

  lazy val pancakes_with_lentils: Recipe = Recipe("pancakes_with_lentils",
    List(
      ingredient(ml(350), "soya milk", refrigerated),
      ingredient(grams(350), "plain flour", store_cupboard),
      ingredient(tbsp(4), "chickpea/gram flour", store_cupboard),
      ingredient(tsp(2), "baking powder", store_cupboard),
      ingredient(grams(200), "red lentils", store_cupboard),
      ingredient(some(), "carrots"),
      ingredient(some(), "celery"),
      ingredient(tins(2), "passata", store_cupboard)
    ))

  lazy val butternut_soup: Recipe = Recipe("butternut_squash_soup",
    List(
      ingredient(number(1), "butternut squash"),
      ingredient(tins(1), "cannelini beans", store_cupboard),
      ingredient(some(), "stock powder", store_cupboard)
    ))

  lazy val fishcakes_chips: Recipe = Recipe("fishcakes_chips",
    List(
      ingredient(packs(1), "chips", frozen),
      ingredient(number(4), "fishcakes", frozen),
      ingredient(some(), "sweetcorn", frozen),
      ingredient(some(), "peas", frozen)
    ))

  val leek_potato_soup: Recipe = Recipe("leek_potato_soup",
    List(
      ingredient(grams(500), "leeks"),
      ingredient(grams(500), "potatoes"),
      ingredient(some(), "stock powder", store_cupboard)
    ))

  val quiche: Recipe = Recipe("quiche",
    List(
      ingredient(number(2), "leeks", fresh),
      ingredient(some(), "mushrooms", fresh),
      ingredient(some(), "shortcut pastry", refrigerated),
      ingredient(some(), "soya milk", refrigerated),
      ingredient(some(), "silken tofu", store_cupboard)
    ))

  val black_bean_burritos: Recipe = Recipe("black_bean_burritos",
    List(
      ingredient(number(1), "onions", fresh),
      ingredient(cloves(2), "garlic", fresh),
      ingredient(grams(500), "mushrooms", fresh),
      ingredient(some(), "spinach", frozen),
      ingredient(tins(2), "black beans", store_cupboard),
      ingredient(packs(1), "wholemeal tortilla", store_cupboard),
      ingredient(some(), "cherry tomatoes", fresh),
      ingredient(tins(2), "parsley", fresh),
      ingredient(packs(1), "coriander", fresh)
    ))

  val allRecipes = List(
    breakfast,
    chickpea_curry, chilli, aubergine_casserole,
    lentil_bolognese, saag_tofu,
    seeded_wholemeal_bread,
    regular_items,
    tofu_noodle_soup,
    burgers, stir_fry, simple_pinto_wraps, beetroot_soup, leek_potato_soup, fishcakes_chips, jackets_with_beans, pancakes_with_lentils, quiche, black_bean_burritos)

  // convert tsp and tbsp into grams
  // blackbean burritos
  // account for how some of these recipes get doubled
  // side veg?
  // add carbs
  // convert ml into litres?
  // make regular items make sense

}
