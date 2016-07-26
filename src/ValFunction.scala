

object ValFunction {
  def main(args: Array[String]) {
    val i=addInt(5, 7)
    println("Returned Value : " + i);
  }
  val addInt= {(a: Int, b: Int)=>a + b
   
  }
}