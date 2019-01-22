package mix

object OOP {

  def main(args: Array[String]): Unit = {

    def square = (n: Int)=> n*n
    val x = square(2)
    assert(x >= 0,"Error") // is used as to check the code of the function itself

    println(x)

       def divide(a:Int,b:Int)= {
         require(b != 0) //Precondition, it is used to enforce a precondition on the caller of a function.
         a / b
       }

    //Primary  Constructor
    class Rational(x: Int, y: Int) {
      //Auxlary Constructor
      def this(x: Int) = this(x, 1)

    }

    abstract class Person{

      def name(str:String)= s"Person's Name $str"
      def age(a:Int)  = s"Person's Agr $a"
    }

    trait Planar {
      def height: Int
      def width: Int
      def surface = height * width
    }

    class Student extends Person with Planar {
      override def name(str: String): String = super.name(str)

      override def age(a: Int): String = super.age(a)

      override def height: Int = 5

      override def width: Int = 2

      override def surface: Int = super.surface

    }


  }
}
