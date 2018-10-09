package recipes

case class MeasurementUnit(name: String, gramsEquivalent: Option[Int])

object MeasurementUnit {
  val tsp = new MeasurementUnit("tsp", None)
  val tbsp = new MeasurementUnit("tbsp", None)
  val slosh = new MeasurementUnit("slosh", None)
  val some = new MeasurementUnit("some", None)
  val tins = new MeasurementUnit("tins", None)
  val cups = new MeasurementUnit("cups", None)

  val g = new MeasurementUnit("g", None)
  val ml = new MeasurementUnit("ml", None)
  val litres = new MeasurementUnit("litres", None)
  val kg = new MeasurementUnit("kg",  Some(1000))
  val clove = new MeasurementUnit("clove", None)
  val number = new MeasurementUnit( "number", None)

}
