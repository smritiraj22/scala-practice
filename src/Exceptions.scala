import java.io.IOException
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.File


object Exceptions {
  def main(args: Array[String]) {
      try {
         val file =new File("test.txt")
         file.createNewFile()
         if(file.exists()){
           println(" file created")
         }
         val files = new FileReader("test.txt")
      } catch {
         case ex: FileNotFoundException => {
            println("FileNotFoundException")
         }
         case ex: IOException => {
            println("IOException")
         }
      } finally {
         println("Finally block")
      }
   }
}