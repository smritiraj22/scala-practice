

object Mod {
  def main(args: Array[String]) {
    var evenList = for { i <- 1 to 20 if (i % 2) == 0
    } yield i
 
    println("Even List")
    for(i <- evenList)
      println(i)

  }
}