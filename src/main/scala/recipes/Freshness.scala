package recipes

case class Freshness(name: String) {}

object Freshness {
  val frozen = Freshness("frozen")
  val store_cupboard = Freshness("from store cupboard")
  val fresh = Freshness("fresh")
  val dried = Freshness("dried")
  val tap = Freshness("from the tap")
}
