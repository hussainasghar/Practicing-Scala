package mix

object StringInterpolation {
  def main(args: Array[String]): Unit = {

    def greet(name: String): String = s"Hello, $name!"

    greet("Scala")
    greet("Functional Programming")

    def greet1(name: String): String =
      s"Hello, ${name.toUpperCase}!"


  }
}
