

object RecursiveFunction {
  def main(args: Array[String]){
     println( "Factorial of " + 5 + ": = " + factorial(5) )
  }
   def factorial(n: BigInt): BigInt = {  
      if (n <= 0 || n<=1)
         1  
      else    
      n * factorial(n - 1)
   }
}