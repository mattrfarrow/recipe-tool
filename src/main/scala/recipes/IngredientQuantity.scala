package recipes

case class IngredientQuantity(ingredient: Ingredient, quantity: Quantity, freshness: Freshness) {

  override def toString: String =
    if(quantity.toString.length()>0) {
      ingredient.preferredName.capitalize + ", " + quantity
    } else {
      ingredient.preferredName.capitalize
    }


}

object IngredientQuantity {

  def ingredient(quantity: Quantity, name: String) = IngredientQuantity(Ingredient(Seq(name)), quantity, Freshness.fresh)
  def ingredient(quantity: Quantity, name: String, freshness: Freshness) = IngredientQuantity(Ingredient(Seq(name)), quantity, freshness)
}