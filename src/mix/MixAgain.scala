package mix

object MixAgain extends App {

  /*System.out.print("Hello")

  val a = 9

  for(i<- 1 to 10) {
    println(i)
  }

  case class Person(name:String, age: Int, gender: String)

  val s = Seq(1,2,3,4)

  //Case Class
  val ss = Seq(Person("Hussain",22,"male"))

  //Swapping
  var x = 100
  var y = 200

  var temp = x
  x=y
  y = temp

  //Factorial
  def factorial(n:Int) {
    var fact = 1
    for (i <- 1 to n) fact = fact * i
    fact
  }


  val factorialFunction = factorial(4)
  print(factorialFunction)

  val array = Array(1,2.2,4,"hu")

  val list = List(1,1,1,1,1,1)

  val map = Map("Name"-> "Hussain","Age"->22,"Gender"->"male")

  sealed trait Employee {

    def empName(name: String)

    def empage(age: Int)

    def gender(gender: String)

    // val getDetails = empName("Hussain");empage(22);gender("male")

  }

  class CsEmployee extends Employee{

    def empName(name: String): Unit ={
      print(name)
    }

    def empage(age: Int) = print(age)
    def gender(gender: String) = print(gender)



  }

  val solutions = List[(Int, Int, Int) => Int](
    findSumOfMultiplies
  )

  def findSumOfMultiplies: (Int, Int, Int) => Int = (a: Int, b: Int, limit: Int) => ???




  val mix = 8*8*9-4+5

  1.toString

  1.to(5)

  BigInt.probablePrime(100, scala.util.Random)


  "Hello"(4)

  //Method having function as argument
  def count(p: (Char) => Boolean) : Int
  count(_.isDigit)


  def sum(n:(Int)=>String):Boolean

  "Harry".patch(1, "ung", 2)

  3.toChar

  var sqrt = math.sqrt(3)
  var square = sqrt * sqrt


  "crazy" * 3

  10 max 2


  //BigInt(2**1024)

  math.pow(2,1024)

  "Hello".head
  "Crazy".last

  val input = readLine("Enter Name: ")

  var sum = 0
  for (ch <- "Hello") sum += ch

  for(c <- "Hussain") print(c)


  for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")

  for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")

  for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")

  /*for {
    i <- 1 to 3
       from = 4 - i
       j <- from to 3
    print(10 * i + j)+" "
  }*/

  //for comprehension loop
  for (i <- 1 to 10) yield i % 3

  for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar
  // Yields "HIeflmlmop"

  for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar
  // Yields Vector('H', 'e', 'l', 'l', 'o', 'I', 'f', 'm', 'm', 'p')



  //factorial Function
  def fact(n:Int):Int= if(n<=1) 1 else n*fact(n-1)

  def decorate(str:String,left:String="<< ",righht:String=" >>")=left+str+righht



  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  def mul(args:Int*)={
    var result = 1
    for(a<-args) result*=a
    result
  }

  //1 Squence of Numbers
  val su = sum(1,2,3,4,5,6,7)
  // Differentitate with : _*
  val m = mul(1 to 7: _*)

  def box(str:String){

    val border = "-"*s.length + "--\n"
    val box = border+"|"+str+"|\n"+border
    print(box)
  }

  //lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString

  val xx=1 ; val yy=1

  for(i <- 1 to 10){
    print(i)
  }

  def countdown(n:Int)={
    for (i <- n to 1 by -1) {
      print(i)
    }
  }

  def countDown(n: Int): Unit= if(n == 0) println(0) else if(n>0)
  {
    println(n)
    countDown(n-1)
  }

  var l = 1
  val strr:String = "Hello"
  strr.foreach(l*=_.toInt)

  for(i<- (10 to 1).reverse){
    print(i)
  }

  for(i<-10 to (0,-11)){
    print(i)
  }

  def unicodeproduct(str:String)={

    var x = 1
    for(c <- str) x*=c.toInt
    x
  }

  print(unicodeproduct("Hello"))

  val str = "Hello"
  str.foldLeft(1L)(_ * _.toInt)

  str.map(_.toInt).product


  def fun(str:String)={

    str.foldLeft(1L)(_ * _.toInt)
  }

  //Tail Recursive
  def product(str:String): Unit ={

    def pro(n:Long,array: Array[Char]): Long ={
      if(array.isEmpty) n else pro(n* array.head,array.tail)
    }
    print(pro(1L,str.toCharArray))
  }

  var q@w=1

  def prodR(s:String):Int = {
    if(s.length() == 1) s.head.toInt
    else s.head.toInt * prodR(s.drop(1))
  }

  val listl = 2 :: 3 :: 4 ::5 :: 6 :: Nil

  0 max 5
  "bob".capitalize


  */





}
