package recipes

case class Quantity(numberOfUnits: Double, measurementUnit: MeasurementUnit) {

  override def toString: String =  measurementUnit match {
    case MeasurementUnit.number => numberOfUnits.toString.replaceAllLiterally(".0", "")
    case MeasurementUnit.some   => ""
    case _      => numberOfUnits.toString.replaceAllLiterally(".0", "") + " " + measurementUnit.name
  }

}


object Quantity {

  def grams(g: Int): Quantity = Quantity(g, MeasurementUnit.g)
  def ml(m: Int): Quantity = Quantity(m, MeasurementUnit.ml)
  def number(g: Int): Quantity = Quantity(g, MeasurementUnit.number)

  def tsp(g: Double): Quantity = Quantity(g, MeasurementUnit.tsp)
  def tbsp(g: Double): Quantity = Quantity(g, MeasurementUnit.tbsp)

  def slosh(): Quantity = Quantity(1, MeasurementUnit.slosh)
  def some(): Quantity = Quantity(1, MeasurementUnit.some)
  def tins(g: Double): Quantity = Quantity(g, MeasurementUnit.tins)
  def cups(g: Double): Quantity = Quantity(g, MeasurementUnit.cups)
  def packs(g: Double): Quantity = Quantity(g, MeasurementUnit.packs)

  def cloves(n: Int): Quantity = Quantity(n, MeasurementUnit.clove)
}