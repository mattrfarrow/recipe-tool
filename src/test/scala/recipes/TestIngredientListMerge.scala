package recipes

import org.scalatest.FlatSpec
import org.scalatest.Matchers._


class TestIngredientListMerge extends FlatSpec {

  "The merger" should "merge quantities of the same ingredient" in {
    val recipe1 = Recipe("chickpea curry",
      List(IngredientQuantity(Ingredient("cheese"), Quantity(20, MeasurementUnit.g))))
    val recipe2 = Recipe("cheese sandwich",
      List(IngredientQuantity(Ingredient("cheese"), Quantity(5, MeasurementUnit.g))))

    val actual = IngredientListMerger.merge(List(RecipeAndMultiples(recipe1, 1), RecipeAndMultiples(recipe2, 1)))
    val expected = ""

    actual should contain only IngredientQuantityWithContributingRecipes(
      IngredientQuantity(Ingredient("cheese"), Quantity(25, MeasurementUnit.g)),
      List(recipe1, recipe2))
  }

  "The merger" should "not merge different ingredients" in {
    val recipe1 = Recipe("chickpea-curry",
      List(IngredientQuantity(Ingredient("cheese"), Quantity(20, MeasurementUnit.g))))
    val recipe2 = Recipe("cheese-sandwich",
      List(IngredientQuantity(Ingredient("bread"), Quantity(5, MeasurementUnit.g))))

    val actual = IngredientListMerger.merge(List(RecipeAndMultiples(recipe1, 1), RecipeAndMultiples(recipe2, 1)))

    actual.size should equal(2)

    actual should contain
      IngredientQuantityWithContributingRecipes(
        IngredientQuantity(Ingredient("cheese"), Quantity(20, MeasurementUnit.g)),
        List(recipe1, recipe2))

    actual should contain
      IngredientQuantityWithContributingRecipes(
        IngredientQuantity(Ingredient("bread"), Quantity(5, MeasurementUnit.g)),
        List(recipe1, recipe2))

  }

  "The merger " should "convert to grams where possible"

}