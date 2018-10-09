package recipes

case class Freshness(name: String) {}

object Freshness {
  val frozen = Freshness("frozen")
  val tinned = Freshness("tinned")
  val fresh = Freshness("fresh")
  val dried = Freshness("dried")
}
