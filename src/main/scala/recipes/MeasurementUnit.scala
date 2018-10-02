package recipes

case class MeasurementUnit(name: String, gramsEquivalent: Option[Int])

object MeasurementUnit {
  val tsp = new MeasurementUnit("tsp", None)
  val slosh = new MeasurementUnit("slosh", None)
  val tins = new MeasurementUnit("tins", None)

  val g = new MeasurementUnit("g", Some(1))
  val kg = new MeasurementUnit("kg",  Some(1000))
  val clove = new MeasurementUnit("clove", None)
  val number = new MeasurementUnit( "number", None)

}
