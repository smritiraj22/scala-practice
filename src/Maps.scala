import scala.collection.mutable.{
  Map,
  SynchronizedMap,
  HashMap
}

object Maps {
  def main(args: Array[String]) {
    var testMap: Map[Char, Int] = Map('S' -> 10, 'M' -> 10, 'R' -> 10, 'I' -> 10)
    var testMapVal = Map[Char, Int]()
    testMapVal += ('I' -> 10)
    testMapVal += ('J' -> 10)
    testMapVal += ('J' -> 15)
    testMapVal += ('k' -> 15)
    testMapVal += ('L' -> 100)

    println("Keys  " + testMapVal.keys)
    println("Values " + testMapVal.values)
    println(" is empty : " + testMapVal.isEmpty)

    /*val testMapVal=Map[Char,Int]() immutable collection by default immutable
     testMapVal+=('I' -> 1)*/

    var cc = testMap ++ testMapVal
    println("concatednated map " + cc)

    cc = testMap.++(testMapVal)
    println("concatednated map " + cc)

    if (cc.contains('S')) {
      println("S exits" + cc('S'))
    } else {
      println("S does not exist")
    }

    val cache = collection.mutable.Map[String, String]()
    cache += ("Smriti" -> "Raj")
    cache += ("Here" -> "Intern")

    println("Keys  " + cache.keys)
    println("Values " + cache.values)
    println(" is empty : " + cache.isEmpty)

    var makeMap: Map[String, String] = {
      new HashMap[String, String] with SynchronizedMap[String, String] {
        override def default(key: String) =
          "Why do you want to know?"
      }
    }
    makeMap += ("Smriti" -> "Raj")
    makeMap += ("Here" -> "Intern")

    println("Keys  " + makeMap.keys)
    println("Values " + makeMap.values)
    println(" is empty : " + makeMap.isEmpty)
    
    var it=makeMap.iterator
     while (it.hasNext){
         println(it.next())
      }
  }
}