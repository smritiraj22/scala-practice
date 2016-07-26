

object ValMethod {
  def main(args: Array[String]) {
    val i=addInt(5, 7)
    println("Returned Value : " + i);
  }
  def addInt(a: Int, b: Int): Int={
   var sum=0
   sum =a+b
   return sum
  }
}