package recipes

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class TestQuantityConvertor extends FlatSpec {

  it should "convert tsp to grams" in {
    val origQuantity = Quantity(5, MeasurementUnit.tsp)
    val ingredient = Ingredient(Seq("sugar puffs"), Some(4))
    val convertedQuantity = QuantityConvertor.convertSpoonsToGrams(origQuantity, ingredient)

    convertedQuantity should equal(Quantity(20d, MeasurementUnit.g))
  }

  it should "convert tbsp to grams" in {
    val origQuantity = Quantity(5, MeasurementUnit.tbsp)
    val ingredient = Ingredient(Seq("sugar puffs"), gramsPerTsp = Some(4))
    val convertedQuantity = QuantityConvertor.convertSpoonsToGrams(origQuantity, ingredient)

    convertedQuantity should equal(Quantity(60d, MeasurementUnit.g))
  }
}
