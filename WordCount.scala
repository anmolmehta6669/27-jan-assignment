

trait WordCount{

  def wordCount(str:String):Map[String,Int]={
    val res=str.split("[ ,!.]+")
    res.groupBy(x=>x).map(x=>(x._1,x._2.size))

  }

}
