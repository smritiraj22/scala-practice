

object PrimeNumbers {
  def main(args: Array[String]) {

    def primeNumbers() {
      val primes = List(1, 2, 3, 5, 7, 11)
      for (i <- primes) {
        if (i == 11)
          return
        else if(i!=1)
          println(i)
      }
    }
    primeNumbers();
  }
}