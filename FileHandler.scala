
import java.io._
import scala.io.Source

class FileHandler(src:String,dest:String) extends ETLProcess[java.io.File] with Capitalize with WordCount{
  val contentSource=new java.io.File(src).listFiles.filter(_.getName.endsWith(".txt")).toList
  val contentDestination=dest

  override def readSource():List[(String,String)] ={
    contentSource.map(src=>(src.toString,Source.fromFile(src).getLines.mkString))
  }

  override def writeDestination(source:String,result: String):Unit={
    val destination=new BufferedWriter(new PrintWriter(contentDestination + source))
    destination.write(result)
    destination.close()

  }
}



