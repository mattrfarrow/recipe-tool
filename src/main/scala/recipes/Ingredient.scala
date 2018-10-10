package recipes

case class Ingredient(names: Seq[String], gramsPerTsp: Option[Int]=None) {
  def preferredName: String = names.head
}
