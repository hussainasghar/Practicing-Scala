package ThirdChapter

import scala.collection.mutable

/**
  * Created by sheikh on 4/19/17.
  */
object Mix {

  def main(args: Array[String]): Unit = {

      /******Arrays in Scala are Mutable(there values can be changed) ****************************/

   // val array1:Array[String] = new Array[String](4);
    val array = new Array[Int](4)
    array(0)=20
    array(1)=40
    array(2)=60
    array(3)=80

    for (i <- 0 to array.length-1){
  //    println(i+" index---> " + array(i))

    }
  }

  val animals = Array("Lion","Monkey","Bear","Horse")


  /******List in Scala are IMMutable(there values cannot be changed) ****************************/

  val list = List("Hussain","Four","Islamabad","Karachi")

  /*list.count(s => s.length == 4)

  list.exists(x => x=="Four")

  list.filter(x => x.length==3) */

 // println(list.forall(x => x.endsWith("n")))

 // print(list.map(x=>x+"y"))

 // list.foreach(x => println(x+" "))
  //println()
 //list.foreach(println)


 // println(list.mkString(" * "))

//  list.sort((s, t) => s.charAt(0).toLower < t.charAt(0).toLower) /**********/


  /******Tuples can hold different datatype values ****************************/

  val tuple1 = ("Hussain",21,'m',"Islamabad")

 // print(tuple1)

  //println(tuple1._1)
  //println(tuple1._2)

  /****** SET & MAP (Alternatives for Array & List) ****************************/

  var set = Set(1,2,4,5)
  var set1 = Set("Hussain",1,'c')

  var hashSet = mutable.HashSet("Hussain","Sheikh")

              /******************MAP *************************/

  val mapp = mutable.Map[Int,String]()
  mapp+=(1 -> "Go to Beach")
  mapp+=(2 -> "Find a Beautiful Girl")
  mapp+=(3 -> "Marry her")
  println(mapp(2))

  val romanNumeral = Map(1 -> "I" ,2 -> "II" ,3 -> "III" ,4 -> "IV" , 5 -> "V" )

  println(romanNumeral(4))


}
