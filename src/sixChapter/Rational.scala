package sixChapter

/**
  * Created by sheikh on 4/22/17.
  */
class Rational(n:Int, d:Int) {


  val numerator:Int   = n
  val denominator:Int = d

  require(d!=0)

  def this(n: Int) = this(n,1) // auxiliary constructor

  override def toString = n +"/"+ d
  //println("Created "+ n +"/"+ d)

  def add(that: Rational): Rational =
    new Rational(numerator * that.denominator + that.numerator * denominator, denominator * that.denominator)

  implicit def intToRational(x: Int) = new Rational(x)

  val switch:String = readLine()
    switch match {
      case "salt" => println("pepper")
      case "chips" => println("salsa")
      case "eggs" => println("bacon")
      case _ => println("huh?")  //if nothing matches
  }
}
