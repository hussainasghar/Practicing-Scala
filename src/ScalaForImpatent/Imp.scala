package ScalaForImpatent

/**
  * Created by sheikh on 7/3/17.
  */

object Imp {
  def main(args: Array[String]) {

//Use when you only need if
  if(1<2) 1
  else ()  //() Unit


    def sum(n:Int*)={

      var result = 0
      for (i <- n) result += i
      result

      lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString

    }

  }
}
