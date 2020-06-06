package recipes

case class Freshness(name: String, sortOrder: Int) {}

object Freshness {
  val fresh = Freshness("fresh", 0)
  val store_cupboard = Freshness("from store cupboard", 5)
  val dried = Freshness("dried", 9)
  val frozen = Freshness("frozen", 10)
  val tap = Freshness("from the tap", 11)
}
