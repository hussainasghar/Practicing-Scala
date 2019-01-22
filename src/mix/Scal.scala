/**
  * Created by sheikh on 3/11/17.
  */
object Scal {

  def main(args: Array[String]) {

    val a = Array.tabulate(10)(i=>i*2)

    for(i<- 0 until(a.length)){
      println(a(i))
    }
    val b =Array.tabulate(10)(_*2)


    val array = new Array[String](5)
    val list = List(2,3,5)

  }
  //  tryCatch()
  def tryCatch() {
    try {
      println("Enter Number")
      println(readInt())

    }
    catch {
      case e: NumberFormatException => println("Wrong input is Entered")
        tryCatch()

    }
  }


}
