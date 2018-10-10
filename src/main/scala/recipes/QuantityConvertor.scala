package recipes

object QuantityConvertor {

  private val TSP_PER_TBSP = 3

  def convertSpoonsToGrams(ingredientQuantity: IngredientQuantity): IngredientQuantity =
    IngredientQuantity(ingredientQuantity.ingredient, convertSpoonsToGrams(ingredientQuantity.quantity, ingredientQuantity.ingredient), ingredientQuantity.freshness)

  def convertSpoonsToGrams(quantity: Quantity, ingredient: Ingredient): Quantity = {
    val unit = quantity.measurementUnit

    if(Set(MeasurementUnit.tsp, MeasurementUnit.tbsp).contains(quantity.measurementUnit) && ingredient.gramsPerTsp.isEmpty) {
      println("No gramsPerTsp for "+ingredient.preferredName)
      return quantity
    }

    unit match {
      case MeasurementUnit.tsp =>
        Quantity (quantity.numberOfUnits * ingredient.gramsPerTsp.get, MeasurementUnit.g)
      case MeasurementUnit.tbsp =>
        Quantity (quantity.numberOfUnits * ingredient.gramsPerTsp.get * TSP_PER_TBSP, MeasurementUnit.g)
      case other => quantity
    }

  }

}
