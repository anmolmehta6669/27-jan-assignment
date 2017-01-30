
trait ETLProcess[T] {
  def contentSource: List[T]              //List of files or tables to be used
  def contentDestination:String           //destination directory name or table name
  def readSource():List[(String,String)]         //Returns the source fileName and content.... Or source tableName and content
  def writeDestination(src:String,content: String):Unit   //Writing to the destination described above.
 }
