/**
  * Created by sheikh on 3/10/17.
  */
object Sca {

  def main(args: Array[String]) {
    println("Hello")
    println(5 & 15)
    println(2 << 4) //append 0's to right

    println(90.toBinaryString);

    println(90 >> 5) //shift to left

    println(0x5566a) //Hexadecimal

    val f = (x: Int) => x * x                   /***************** Lambda ************************/
    f(2)
    val g = (_: Double) * 3                       /***************** WildCard ************************/
    g(2)

                               /****Higher Order Function ********/
    def combine(x: Int, y: Int, z: Int, f: (Double, Double) => Double): Double = f(f(x, y),z)

    println(combine(2,2,3,(x,y)=>x*y))
    println(combine(1,2,3,_+_))
    println(combine(1,2,3,_ min _))
    println(combine(1,2,3,_ max _))


    type Automobile = (String,String,String)  //Type Decleration

    def AutomobileFunction(x:Automobile,y:Automobile){}

    AutomobileFunction(("a","b","c"),("d","e","f"))

       /****Recursion*****/
    def sumofSquare(n:Int):Int={

      if(n<2) 1 else n * n + sumofSquare(n - 1)
    }

    println("Enter Number")
    //var n = readInt

    readInt match {
      case 0=> println("0")
      case 1=> println("1")
      case _=> println("None")

    }

    def fizzBuzz(n:Int){
      if (n<20){
        (n%3,n%5) match {
          case (0,0)=>println("FizzBuzz")
          case(0,_)=>println("Fizz")
          case(_,0)=>println("Buzz")
          case(_)=>println("None")
                         }
        fizzBuzz(n+1)
               }
                      }
  }


}
