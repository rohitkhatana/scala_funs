
object last {

  def findLastElement(list: List[Int]): Option[Int] = {
    if(list.isEmpty) {
      None
    } else if (list.tail.isEmpty) {
      Some(list.head)
    } else {
      findLastElement(list.tail)
    }
  }

  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(2, 1)
    findLastElement(list) match {
      case Some(i) => println(i)
      case None => println("Empty list is given")
    }
  }
}

