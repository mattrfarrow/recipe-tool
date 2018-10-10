package recipes

case class IngredientQuantity(ingredient: Ingredient, quantity: Quantity, freshness: Freshness) {

  override def toString: String =
    if(true || freshness==Freshness.fresh) {
      ingredient.preferredName.capitalize + ", " + quantity
    } else {
      ingredient.preferredName.capitalize + ", " + freshness.name + ", " + quantity
    }


}

object IngredientQuantity {

  def ingredient(quantity: Quantity, name: String) = IngredientQuantity(Ingredient(Seq(name)), quantity, Freshness.fresh)
  def ingredient(quantity: Quantity, name: String, freshness: Freshness) = IngredientQuantity(Ingredient(Seq(name)), quantity, freshness)
}