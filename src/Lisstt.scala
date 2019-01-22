/**
  * Created by sheikh on 4/22/17.
  */
object Lisstt {
  def main(args: Array[String]): Unit = {

    val list = List(2,3,1,7,9,8,12,10,5,0)

  list.endsWith(Array(9))
    list.sorted


    object UserRoles extends Enumeration {
      type UserRole = Value
      val CUSTOMER = Value("Consumer")
      val MERCHANT = Value("Merchant")
      val BANK = Value("Bank")
      val GOVERNMENT = Value("Government")
    }

    val seq = Seq("Student")

   val combine = seq ++ UserRoles.values
   val o= combine.map(_.toString).sorted
    o.foreach(println)
  //map,filter,reduce,fold,zip,flatten,fill,flatmap



  }
}

