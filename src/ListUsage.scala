

object ListUsage {
  def main(args: Array[String]) {
      val names = "smriti" :: ("raj"::Nil)//end of list
     

      println( "Head " + names.head )
      println( "Tail  " + names.tail )
      println(names.isEmpty )
   
      
      val name1 = "smriti" :: ("raj"::Nil)
      val company = "here" :: ("places" :: Nil)

      
      var l1 = name1 ::: company
      println(  l1 )
      
     
      var l2 = name1.:::(company)
      println(  l2 )

      
      var l3 = List.concat(name1, company)
      println(  l3  )
   }
}