package recipes

case class Freshness(name: String, sortOrder: Int) {}

object Freshness {
  val fresh = Freshness("fresh", 0)
  val refrigerated = Freshness("refrigerated", 2)
  val store_cupboard = Freshness("from store cupboard", 5)
  val canned = Freshness("canned", 7)
  val spice_rack = Freshness("spice rack", 10)
  val drinks = Freshness("drinks", 20)
  val condiments = Freshness("condiments", 30)
  val frozen = Freshness("frozen", 50)
  val breakfast_cereals = Freshness("breakfast cereals", 55)
  val non_food = Freshness("non-food", 60)
  val tap = Freshness("from the tap", 70)
}
