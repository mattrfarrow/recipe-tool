package recipes

case class IngredientQuantityWithContributingRecipes(
  sizedIngredient: IngredientQuantity,
  usages: Seq[Recipe]
)


