/*
package mix

object Mixx {

  def main(args: Array[String]): Unit = {


  }

  /** * Structuring Information *******/

  // the purpose of case classes is to aggregate values

  //Has-a relationship
  case class Note(name: String, duration: String, octave: Int)

  val c3 = Note("C", "Quarter", 3)

  c3.name
  c3.duration
  c3.octave

  // IS-a relationship
  sealed trait Symbol

  case class Note1(name: String, duration: String, octave: Int) extends Symbol

  case class Rest(duration: String) extends Symbol

  val symbol1: Symbol = Note1("C", "Quarter", 3)
  val symbol2: Symbol = Rest("Whole")

  //Pattern-Matching
  // (A way to differentiate b/w symbols)
  def symbolDuration(symbol: Symbol): String =
    symbol match {
      case Note(name, duration, octave) => duration
      case Rest(duration) => duration
    }

  sealed trait NoteName

  case object A extends NoteName

  case object B extends NoteName

  case object C extends NoteName


  /*EXERCISE
  Consider the following algebraic data type that models note durations.
   Complete the implementation of the function fractionOfWhole,
   which takes as parameter a duration and returns the corresponding
  fraction of the Whole duration. */

  sealed trait Duration

  case object Whole extends Duration

  case object Half extends Duration

  case object Quarter extends Duration

  def fractionOfWhole(duration: Duration): Double =
    duration match {
      case Whole => 1.0
      case Half =>
        0.5

      case Quarter =>
        0.25

    }

  //Sum of Integers
  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b)

  //Sum of cubes
  def cube(x: Int): Int = x * x * x

  def sumCubes(a: Int, b: Int): Int =
    if (a > b) 0 else cube(a) + sumCubes(a + 1, b)

  def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)

  def sumFactorials(a: Int, b: Int): Int =
    if (a > b) 0 else factorial(a) + sumFactorials(a + 1, b)

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  // Anonymous Functions
  val fun = (x: Int) => x * x * x
  val fun1 = (x: Int, y: Int) => x * y + x / y


  println(fun(5))

  (x: String, y: Int, z: Char) => "String" + x + "Int" + y + "Char" + z

  (x: Int, y: Int) => x + y

  def sumIntss(a: Int, b: Int) = sum(x => x, a, b)

  def sumCubess(a: Int, b: Int) = sum(x => fun(x), a, b)

  def sumCubess1(a: Int, b: Int) = sum(x => cube(x), a, b)

  val fun2 = (x: Int) => x * x * x

  println(fun(5))

  val fun3 = (x: Int, y: Int) => x + y * y + x * x

  println(fun1(2, 3))

  val diag3 = List(List(1, 0, 9), List(0, 1, 0), List(0, 0, 1))

  val list: List[Int] = List(1, 2, 1, 45, 6)

  val nums = 1 :: (2 :: (3 :: (4 :: Nil)))

  val nums1 = 1 :: 2 :: 3 :: 4 :: Nil
  // nums 1 and nums 2 are equaivalent
  val nums2 = Nil.::(4).::(3).::(2).::(1)

  nums2 match {
    // Lists of `Int` that starts with `1` and then `2`
    case 1 :: 2 :: xs =>
    // Lists of length 1
    case x :: Nil =>
    // Same as `x :: Nil`
    case List(x) =>
    // The empty list, same as `Nil`
    case List() =>
    // A list that contains as only element another list that starts with `2`
    // case List(2 ::xs) =>


    /*def id(x: Int): Int = x
  def sumInts(a: Int, b: Int) = sum(id, a, b)
  def sumCubes(a: Int, b: Int) = sum(cube, a, b)
  def sumFactorials(a: Int, b: Int) = sum(factorial, a, b)*/

  }
}*/
