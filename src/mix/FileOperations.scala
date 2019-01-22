package mix

import java.io.{File, FileInputStream, PrintWriter}

import scala.io.Source

object FileOperations {
  def main(args: Array[String]): Unit = {

     lazy val source = Source.fromFile("src/main/resources/data","UTF-8")//.mkString



    //Reading white space tokens
    /*val tokens = source.mkString.split("\\s+")

    val numbers = for (w <- tokens) yield w.toDouble

    val numbers1 = tokens.map(_.toDouble)*/


  //  for (t <- tokens) print(s"$t ")
   // print(s"$tokens ")

    //Read Individual Character
  //  for (c <- source) print(s"$c ")


   // println(source)

  //  val lineIterator = source.getLines

    // println(lineIterator)

  //  for (l <- lineIterator) println(l)

    /*
    /*************** Reading Binary Files *****************/
   lazy val file = new File("src/main/resources/data")
    val in = new FileInputStream(file)
    val bytes = new Array[Byte](file.length.toInt)
    in.read(bytes)
    in.close()

    /*************** Writing  Files *****************/
    val out = new PrintWriter("numbers.txt")
    for (i <- 1 to 100) out.println(i)
    out.close()

    out.print("%6d %10.2f".format(quantity, price))
      printf()

*/

   /*
    //A method to read all sub directories
    def subdirs(dir: File): Iterator[File] = {
      val children = dir.listFiles.filter(_.isDirectory)
      children.toIterator ++ children.toIterator.flatMap(subdirs _)
    }

      // Access it like this
    lazy val file = new File("src/main/resources/data")
    for (d <- subdirs(file)) println(d)
    */

    /****************** PROCESS CONTROL *****************/

    import sys.process._
    "ls -al .." !

    //retured as string
    val result = "ls -al .." !!
    //  You can pipe the output

    val result1 =  "ls -al .." #| "grep sec" !

    // redirect output to file
   val outFile =  "ls -al .." #> new File("output.txt") !

    // append in file
    "ls -al .." #>> new File("output.txt") !

    //redirect input from file
    "grep sec" #< new File("output.txt") !


    /********* Regular Expressions **************/
   /* val numPattern = "[0-9]+".r

    val wsnumwsPattern = """\s+[0-9]+\s+""".r
    // A bit easier to read than "\\s+[0-9]+\\s+".r

    for (matchString <- numPattern.findAllIn("99 bottles, 98 bottles"))
    //  process matchString

    val matches = numPattern.findAllIn("99 bottles, 98 bottles").toArray
    // Array(99, 98)*/



  }
}
