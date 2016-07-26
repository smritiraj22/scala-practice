

object OptionsObject {
  def main(args: Array[String]) {
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

    println("show(capitals.get( \"Japan\")) : " +
      show(capitals.get("Japan")))
    println("show(capitals.get( \"India\")) : " +
      show(capitals.get("India")))
  }

  val a: Option[Int] = Some(5)
  val b: Option[Int] = None

  println("a.getOrElse(0): " + a.getOrElse(0))
  println("b.getOrElse(10): " + b.getOrElse(10))

  println("a.isEmpty: " + a.isEmpty)
  println("b.isEmpty: " + b.isEmpty)

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None    => "Key does not exist in collection"
  }
}