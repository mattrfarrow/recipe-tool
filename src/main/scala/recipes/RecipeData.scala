package recipes

import recipes.IngredientQuantity.ingredient
import recipes.Quantity._
import Freshness._

object RecipeData {

  val lentil_bolognese: Recipe = Recipe("lentil_bolognese",
    List(
      ingredient(1, "onion"),
      ingredient(cloves(2), "garlic"),
      ingredient(slosh(),   "vegetable oil", store_cupboard),
      ingredient(grams(320), "red lentils", store_cupboard),
      ingredient(tins(2), "tomatoes (chopped)", canned),
      ingredient(grams(400), "brown pasta", store_cupboard)
      //optional additional veg like fresh tomatoes, red peppers, carrots, celery or mushrooms
    )
  )

  val chilli: Recipe = Recipe("chilli",
    List(
      ingredient(1, "onion"),
      ingredient(1, "bell pepper"),
      ingredient(cloves(2), "garlic"),
      ingredient(tsp(3), "vegetable oil", store_cupboard),
      ingredient(1, "chilli or jalapeno"),
      ingredient(number(5), "sun dried tomatoes", store_cupboard),
      ingredient(some, "stock powder", store_cupboard),
      ingredient(tins(0.5), "sweetcorn", store_cupboard),
      ingredient(tin, "tomatoes (chopped)", canned),
      ingredient(tin, "green lentils", store_cupboard),
      ingredient(tbsp(1), "tomato puree", store_cupboard),
      ingredient(tsp(1), "cumin", spice_rack),
      ingredient(tsp(1), "paprika", spice_rack),
      ingredient(tsp(1), "oregano", spice_rack),
      ingredient(some, "salt and pepper", store_cupboard)
    )
  )

  val chickpea_curry: Recipe = Recipe("chickpea_curry",
    List(
      ingredient(1, "onion"),
      ingredient(slosh(), "vegetable oil", store_cupboard),
      ingredient(grams(70), "sesame seeds", store_cupboard),
      ingredient(tsp(4), "garam masala", spice_rack),
      ingredient(tsp(2), "curry powder", spice_rack),
      ingredient(tsp(0.25), "cayenne pepper", spice_rack),
      ingredient(tsp(0.25), "chilli powder", spice_rack),
      ingredient(grams(300), "brown rice", store_cupboard),
      ingredient(tins(2), "chickpeas", canned)
    )
  )

  val aubergine_casserole: Recipe = Recipe("aubergine_casserole",
    List(
      ingredient(1, "aubergine"),
      ingredient(tin, "cannelini beans", canned),
      ingredient(tin, "chick peas", canned),
      ingredient(tsp(1), "chilli powder", spice_rack),
      ingredient(tsp(1.5), "smoked paprika", spice_rack),
      ingredient(tbsp(1), "tahini", store_cupboard)
    ))

  val tofu_noodle_soup: Recipe = Recipe("tofu_noodle_soup",
    List(
      ingredient(packs(2), "tofu", refrigerated),
      ingredient(2, "wholewheat noodles", store_cupboard),
      ingredient(packs(2), "pak choi"),
      ingredient(some, "stock powder", store_cupboard)
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
      ingredient(some, "whole_milk", refrigerated),
      ingredient(some, "apples", fresh),
      ingredient(some, "margarine", refrigerated),
      ingredient(some, "pesto (vegan)", store_cupboard),
      ingredient(some, "jam", condiments),
      ingredient(some, "weetabix", breakfast_cereals),
      ingredient(some, "Tea", drinks),
      ingredient(some, "Hippy Tea", drinks),
      ingredient(some, "Nappies", non_food),
      ingredient(some, "Baby wipes", non_food),
      ingredient(some, "Fruit squash", drinks),
      ingredient(some, "Porridge", breakfast_cereals)
    )
  )

  val seeded_wholemeal_bread: Recipe = Recipe("seeded_wholemeal_bread", List(
    ingredient(tsp(1), "yeast", store_cupboard),
    ingredient(grams(475), "strong wholemeal bread flour", store_cupboard),
    ingredient(tsp(1.5), "sugar", store_cupboard),
    ingredient(grams(25), "vegetable oil", store_cupboard),
    ingredient(tsp(1.25), "salt", store_cupboard),
    ingredient(tbsp(1.5), "sesame seeds", store_cupboard),
    ingredient(tbsp(1.5), "poppy seeds", store_cupboard),
    ingredient(ml(350), "water", tap),
    ingredient(tbsp(1.5), "linseeds", store_cupboard),
    ingredient(tbsp(1.5), "pumpkin seeds", store_cupboard),
    ingredient(tbsp(1.5), "sunflower seeds", store_cupboard)
  ))

  lazy val saag_tofu: Recipe = Recipe("saag_tofu",
    List(
      ingredient(packs(2), "tofu", refrigerated),
      ingredient(1, "onion"),
      ingredient(grams(400), "spinach"), // quantity?
      ingredient(tsp(1), "fresh ginger"),// quantity?
      ingredient(tsp(1), "garam masala", spice_rack),// quantity?
      ingredient(tsp(5), "vegan yoghurt", refrigerated)// quantity?
    )
  )

  val stir_fry: Recipe = Recipe("stir_fry",
    List(
      ingredient(packs(1), "noodles", store_cupboard),
      ingredient(packs(2), "tofu", refrigerated),
      ingredient(some, "spring onions"),
      ingredient(some, "garlic"),
      ingredient(tsp(1), "fresh ginger"),
      ingredient(2, "peppers", fresh),
      ingredient(packs(1), "pak choi")
    )
  )

  val burgers: Recipe = Recipe("burgers",
    List(
      ingredient(4, "veggie burgers", refrigerated),
      ingredient(4, "burger buns", store_cupboard),
      ingredient(some, "leaves"),
      ingredient(some, "cucumber"),
      ingredient(some, "tomatoes", fresh),
      ingredient(some, "sweet potato")
    )
  )

  val simple_pinto_wraps: Recipe = Recipe("simple_pinto_wraps",
    List(
      ingredient(packs(1), "wraps", store_cupboard),
      ingredient(2, "courgettes"),
      ingredient(3, "peppers"),
      ingredient(some, "coriander", fresh),
      ingredient(tins(2), "tomatoes (chopped)", canned),
      ingredient(tins(2), "pinto beans", canned),
      ingredient(2, "avocado")
    )
  )

  val beetroot_soup: Recipe = Recipe("beetroot_soup",
    List(
      ingredient(packs(2), "beetroot"),
      ingredient(1, "fennel", fresh),
      ingredient(tin, "cannelini beans", canned),
      ingredient(some, "stock powder", store_cupboard)
    )
  )

  val jackets_with_beans: Recipe = Recipe("jackets_with_beans",
    List(
      ingredient(1, "jacket potatoes"),
      ingredient(tin, "haricot beans", canned),
      ingredient(tin, "passata", store_cupboard)
    ))

  val pancakes_with_lentils: Recipe = Recipe("pancakes_with_lentils",
    List(
      ingredient(ml(350), "soya milk", refrigerated),
      ingredient(grams(350), "plain flour", store_cupboard),
      ingredient(tbsp(4), "chickpea/gram flour", store_cupboard),
      ingredient(tsp(2), "baking powder", store_cupboard),
      ingredient(grams(200), "red lentils", store_cupboard),
      ingredient(some, "carrots"),
      ingredient(some, "celery"),
      ingredient(tins(2), "passata", store_cupboard)
    ))

  val butternut_soup: Recipe = Recipe("butternut_squash_soup",
    List(
      ingredient(1, "butternut squash"),
      ingredient(tin, "cannelini beans", canned),
      ingredient(some, "stock powder", store_cupboard)
    ))

  val fishcakes_chips: Recipe = Recipe("fishcakes_chips",
    List(
      ingredient(packs(1), "chips", frozen),
      ingredient(4, "fishcakes", frozen),
      ingredient(some, "sweetcorn", frozen),
      ingredient(some, "peas", frozen)
    ))

  val leek_potato_soup: Recipe = Recipe("leek_potato_soup",
    List(
      ingredient(grams(500), "leeks"),
      ingredient(grams(500), "potatoes"),
      ingredient(some, "stock powder", store_cupboard)
    ))

  val quiche: Recipe = Recipe("quiche",
    List(
      ingredient(2, "leeks", fresh),
      ingredient(some, "mushrooms", fresh),
      ingredient(some, "shortcut pastry", refrigerated),
      ingredient(some, "soya milk", refrigerated),
      ingredient(some, "silken tofu", store_cupboard)
    ))

  val black_bean_burritos: Recipe = Recipe("black_bean_burritos",
    List(
      ingredient(1, "onions", fresh),
      ingredient(cloves(2), "garlic", fresh),
      ingredient(grams(500), "mushrooms", fresh),
      ingredient(some, "spinach", frozen),
      ingredient(tins(2), "black beans", canned),
      ingredient(packs(1), "wholemeal tortilla", store_cupboard),
      ingredient(some, "cherry tomatoes", fresh),
      ingredient(tins(2), "parsley", fresh),
      ingredient(packs(1), "coriander", fresh)
    ))

  // BBC Good Food June 2020
  val vegan_burger: Recipe = Recipe("Vegan burger",
    List(
      ingredient(1, "onion", fresh),
      ingredient(cloves(2), "garlic", fresh),
      ingredient(grams(200), "chestnut mushrooms", fresh),
      ingredient(grams(250), "tofu", fresh),
      ingredient(2, "beetroots", fresh),
      ingredient(tin, "black beans", canned),
      ingredient(tbsp(1), "tomato puree", fresh),
      ingredient(tbsp(2), "vegan mayonnaise", fresh),
      ingredient(tbsp(1), "miso paste", fresh),
      ingredient(grams(100), "oat flour", store_cupboard),
      ingredient(tbsp(2), "ground flaxseed", store_cupboard),
      ingredient(grams(50), "pecans", store_cupboard),
      ingredient(1, "pouch 200g microwavebrown rice", fresh),
      ingredient(number(8), "cheese slices", fresh),
      ingredient(number(8), "burger buns", fresh),
      ingredient(some, "tomato chilli jam", store_cupboard),
      ingredient(1, "avocado", fresh),
      ingredient(1, "lime", fresh)
    )
  )

  val broccoli_and_pea_soup: Recipe = Recipe("broccoli and pea soup",
    List(
      ingredient(1, "onion"),
      ingredient(2, "celery sticks"),
      ingredient(cloves(2), "garlic"),
      ingredient(grams(200), "broccoli"),
      ingredient(grams(150), "peas", frozen),
      ingredient(ml(500), "stock", store_cupboard),
      ingredient(1, "lemon", fresh),
      ingredient(tbsp(1), "mint", fresh),
      ingredient(tbsp(1), "pine nuts", store_cupboard)
    ))

  // BBCGF July p44, good with greens and new potatoes
  val sausage_cassoulet: Recipe = Recipe("sausage_cassoulet",
    List(
      ingredient(number(12), "veggie sausages", frozen),
      ingredient(2, "onions", fresh),
      ingredient(2, "celery sticks", fresh),
      ingredient(cloves(2), "garlic", fresh),
      ingredient(tbsp, "smoked paprika", spice_rack),
      ingredient(some, "thyme", spice_rack),
      ingredient(ml(200), "white wine", drinks),
      ingredient(tin, "chopped tomatoes", canned),
      ingredient(tin, "butter beans", canned),
      ingredient(tin, "haricot beans", canned),
      ingredient(ml(200), "stock", store_cupboard),
      ingredient(tbsp, "caster sugar", store_cupboard),
      ingredient(tbsp, "red wine vinegar", store_cupboard)
    )
  )

  //  BBCGF July p61
  val puff_pastry_pizzas: Recipe = Recipe("puff_pastry_pizzas",
    List(
      ingredient(1, "320g pack of pre-rolled puff pastry", refrigerated),
      ingredient(tbsp(6), "tomato puree", store_cupboard),
      ingredient(tbsp, "tomato ketchup", store_cupboard),
      ingredient(tsp, "oregano", spice_rack),
      ingredient(some, "olives", store_cupboard),
      ingredient(some, "cherry tomatoes", fresh),
      ingredient(some, "red peppers", fresh),
      ingredient(some, "basil", fresh)
    ))

  //  BBCGF July p60
  val tomato_soup: Recipe = Recipe("tomato_soup",
    List(
      ingredient(tbsp(2), "olive oil", store_cupboard),
      ingredient(2, "onions"),
      ingredient(2, "carrots"),
      ingredient(cloves(2), "garlic"),
      ingredient(2, "red peppers"),
      ingredient(1, "sweet potatoes"),
      ingredient(tins(2), "tomatoes", canned),
      ingredient(some, "stock", spice_rack),
      ingredient(tsp, "oregano", spice_rack),
      ingredient(some, "rosemary", spice_rack)
    ))

  // BBCGF July p89  NOT VEGAN
  val courgette_fritters: Recipe = Recipe("courgette_fritters",
    List(
      ingredient(2, "courgettes"),
      ingredient(grams(30), "self-raising flour", store_cupboard),
      ingredient(grams(20), "cornflour", store_cupboard),
      ingredient(tbsp(2), "sesame seeds", store_cupboard),
      ingredient(tsp(2), "mint", fresh),
      ingredient(grams(80), "halloumi", refrigerated),
      ingredient(2, "large eggs", refrigerated),
      ingredient(2, "spring onions"),
      ingredient(tbsp(2), "honey", condiments),
      ingredient(tbsp(0.5), "chilli flakes", spice_rack),
      ingredient(1, "lemon")
    ))

  // BBCGF July p73, with gremolata
  val chickpea_soup: Recipe = Recipe("chickpea_soup",
  List(
    ingredient(tbsp(2), "oil", store_cupboard),
    ingredient(3, "onions"),
    ingredient(tins(3), "chickpeas", canned),
    ingredient(cloves(3), "garlic"),
    ingredient(tsp(2), "ground coriander", spice_rack),
    ingredient(tsp, "cumin seeds", spice_rack),
    ingredient(tsp(4), "bouillon powder", store_cupboard),
    ingredient(1, "aubergine"),
    ingredient(tbsp(2), "tahini", store_cupboard),
    ingredient(tin, "chickpeas", canned),
    ingredient(grams(100), "cherry tomatoes"),
    ingredient(1, "lemon"),
    ingredient(grams(15), "parsley", fresh),
    ingredient(tbsp(3), "mint"),
    ingredient(some, "smoked paprika")
  ))

  // BBCGF July p90
  val broad_bean_risotto: Recipe = Recipe("broad_bean_risotto",
    List(
      ingredient(tbsp(3), "olive oil", store_cupboard),
      ingredient(2, "courgettes"),
      ingredient(some, "chilli flakes", spice_rack),
      ingredient(some, "nutmeg", spice_rack),
      ingredient(2, "spring onions"),
      ingredient(1, "lemons"),
      ingredient(grams(150), "risotto rice", store_cupboard),
      ingredient(ml(75), "dry white wine", drinks),
      ingredient(ml(750), "stock", store_cupboard),
      ingredient(grams(80), "broad beans"),
      ingredient(grams(20), "parmesan", refrigerated),
      ingredient(clove, "garlic"),
      ingredient(tbsp, "pine nuts", store_cupboard),
      ingredient(some, "basil leaves"),
      ingredient(some, "mint leaves")
    )
  )

  val allRecipes = List(
    breakfast,
    chickpea_curry, chilli, aubergine_casserole,
    lentil_bolognese, saag_tofu,
    seeded_wholemeal_bread,
    regular_items,
    tofu_noodle_soup,
    burgers, stir_fry, simple_pinto_wraps, beetroot_soup, leek_potato_soup, fishcakes_chips, jackets_with_beans, pancakes_with_lentils, quiche, black_bean_burritos,
    vegan_burger, broccoli_and_pea_soup,
    sausage_cassoulet, courgette_fritters, puff_pastry_pizzas, tomato_soup, chickpea_soup, broad_bean_risotto)

  // be able to specify ingredients on the command line too so the list can add veg as sides to meals for example

  // convert tsp and tbsp into grams
  // account for how some of these recipes get doubled (incorrectly?)
  // convert ml into litres?

}
