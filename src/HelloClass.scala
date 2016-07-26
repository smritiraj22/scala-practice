

class HelloClass (val firstName: String, val lastName: String){
 
 
   def this(firstName: String) {
    this(firstName,firstName);
    println("\nNo last name or age given.")
  }
  
 
  def inClass() {
    println("In class "+firstName+lastName)
  }
  
  def inClass(a:Int) {
    println("In class "+a+firstName)
  }
}

object HelloObjectPlusClass {
  println("In object")

  def main(args: Array[String]) {
    println("In main")
    val c = new HelloClass("Smriti","Raj")
    c.inClass()
    def apply =new HelloClass("Smriti")
    apply.inClass(10)
  }
}