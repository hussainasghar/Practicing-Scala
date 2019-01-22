package scala_excercise

/**
  * Created by sheikh on 3/14/17.
  */
object Mx {

  def main(args: Array[String]){

    println(1.to(10))
    println(1 to 10)

    println("bar".take(2))
    println(16.toHexString)


    val array = Array(1,2,3,4,5,6,7,8,9,10)

    array.foreach(print)
    println

    for(i <- 0  until array.length){
      print(array(i)+" ")
    }

    println(array.map(_+2))









  }
}
