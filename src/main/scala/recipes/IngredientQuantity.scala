package recipes

case class IngredientQuantity(ingredient: Ingredient, quantity: Quantity, freshness: Freshness) {

  override def toString: String =
    if(true || freshness==Freshness.fresh) {
      ingredient.name.capitalize + ", " + quantity
    } else {
      ingredient.name.capitalize + ", " + freshness.name + ", " + quantity
    }


}

object IngredientQuantity {

  def ingredient(quantity: Quantity, name: String) = IngredientQuantity(Ingredient(name), quantity, Freshness.fresh)
  def ingredient(quantity: Quantity, name: String, freshness: Freshness) = IngredientQuantity(Ingredient(name), quantity, freshness)
}