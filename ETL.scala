object ETL {

    def main(args: Array[String]): Unit = {
      val obj= new FileHandler("C:\\Users\\Anil Mehta\\IdeaProjects\\AnmolKip\\src\\Assignment3","C:\\Users\\Anil Mehta\\IdeaProjects\\AnmolKip\\src\\Assignment4\\")
      val option=2
      option match {
        case 1=> obj.readSource().foreach {res =>
          obj.writeDestination (res._1.split ("\\\\").last, obj.capitalString (res._2) )
          }
        case 2=>obj.readSource().foreach {res =>
          obj.writeDestination (res._1.split ("\\\\").last, obj.wordCount (res._2).toString )
        }
      }
    }


}
