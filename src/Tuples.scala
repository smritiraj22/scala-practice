

object Tuples {

  def main(args: Array[String]) {
    val t1 = (4, 3, 2, 1)
    val t2 = ("Smriti", 6, 2, 1)
    val t3 = combine(t1, t2)
    t1.productIterator.foreach { i => println(i) }
    println("---------------")
    t2.productIterator.foreach { i => println(i) }
    println("---------------")
    t3.productIterator.foreach { i => println(i) }

  }
  def combine(xss: Product*) = xss.toList.flatten(_.productIterator)
}