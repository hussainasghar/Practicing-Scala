package mix


object Methods extends Application {



  println(sumOfsquare(2, 2))


  def square(a: Int): Int = a * a

  def sumOfsquare(n: Int, m: Int): Int = square(n) + square(m)

  println(sumOfsquare(2, 2))

  def sumOfsquareAnyArguments(nums: Int*): Int = {
    var sum = 0
    for (n <- nums) sum += square(n)
    sum
  }

  println(sumOfsquareAnyArguments(2, 4, 5, 6, 7, 8, 9, 19))

  def simpleMethod(n:Int,m:Int):Int = m + n

  def curryingMethod(n:Int)(m:Int) = n + m



  def doSomething() ={
    println("Do Something")
    5

  }
  def callByValue(n: Int)= {

    println(n)
    println(n)

  }

  def callByName(n: => Int) = {
    println(n)
    println(n)
  }


  callByName(doSomething())

  callByValue(doSomething())

  var x:Int = 0
  var y:Int = 0

  def add(x:Int,y:Int)= x+y
  def subb(x:Int,y:Int) = x-y
  def mull(x:Int,y:Int) = x*y
  def divv(x:Int,y:Int) = x/y


  def calculator(n:Int,m:Int)={

    x = n
    y = m

    println("Addition "+add(x,y))
    println("Subtraction "+subb(x,y))
    println("Multiplication "+mull(x,y))
    println("Division "+divv(x,y))
  }

  //Package
  object Foo {
    val x = 1
  }
  object Bar {
    val z = 2
  }
  object Baz {
    import Bar.z
    val y = z + Foo.x
  }

  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def fact(n:Int):Int= if(n==0) 1 else n*fact(n-1)


  /*def insertionSort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, insertionSort(ys))
  }*/



  /*
  def sqrt(x: Double) = {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double, x: Double) =
      math.abs(square(guess) - x) < 0.001

    sqrtIter(1.0, x)
  }*/

}
