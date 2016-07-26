

object DivisorsOfThree {
  def main(args: Array[String] ){
    var threelist = for{i<-3 to 21  if(i % 3) == 0
  } yield i
    print("Multiples of three")
    for(i<-threelist)
       println(i)
  }
}