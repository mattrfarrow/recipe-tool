package recipes

case class IngredientQuantity(ingredient: Ingredient, quantity: Quantity) {

  override def toString: String = ingredient.name + ", " + quantity

}

object IngredientQuantity {

  def ingredient(quantity: Quantity, name: String) = IngredientQuantity(Ingredient(name), quantity)
}