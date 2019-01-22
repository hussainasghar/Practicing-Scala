package mix

/**
  * Created by sheikh on 7/2/17.
  */
object Mxxx {

  def main(args: Array[String]){


    print(pattern(2))

  }

  def pattern(x:Int):String = x match {

    case 1 => "One"
    case 2 => "Two"
    case _ => "Default"

  }


}
