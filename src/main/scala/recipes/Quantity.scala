package recipes

case class Quantity(numberOfUnits: Double, measurementUnit: MeasurementUnit) {

  override def toString: String = "" + numberOfUnits + " "+measurementUnit.name

}


object Quantity {

  def grams(g: Int): Quantity = Quantity(g, MeasurementUnit.g)
  def number(g: Int): Quantity = Quantity(g, MeasurementUnit.number)
  def tsp(g: Double): Quantity = Quantity(g, MeasurementUnit.tsp)
  def slosh(): Quantity = Quantity(1, MeasurementUnit.slosh)
  def tins(g: Int): Quantity = Quantity(g, MeasurementUnit.tins)
}