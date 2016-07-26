

object RandomLetters {
  def main(args: Array[String]) {
    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for (i <- 0 until randLetters.length) {

      // Get the letter in the index of the String
      println(randLetters(i))
    }
  }

}