

object CurringFunction {
  def main(args: Array[String]) {
      val str1:String = "Hello, "
      val str2:String = "Scala!"
      val str3:String = "Currying "
      val str4:String = "Function "
      println( "The output is = " +  strcat(str1)(str2)(str3)(str4) )
   }

   def strcat(s1: String)(s2: String) (s3: String) (s4: String) = {
      s1 + s2+s3+s4
   }
}