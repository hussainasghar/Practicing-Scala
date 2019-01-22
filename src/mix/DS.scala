package mix

object DS extends Application {

  val fruit = List("apples", "oranges", "pears")
  val nums = List(1, 2, 3, 4)
  val diag3 = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
  val empty = List()

  val list = 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: Nil


  //Tuple
  def pair(i: Int, s: String): (Int, String) = (i, s)

  val tuple = (2,"3")
  val t1 = tuple._1
  val t2 = tuple._2

  pair(2,"Two")


  def xss(xs:Int*) {
    for (x <- xs) yield x + 1
  }

  def xss1(xs:Int*) {
    xs.map(x => x + 1)
  }

  val wordcount = "Hello World,This is test string".split(" ").map(x => (x, 1))

  val xs = List(1,2,3,4,5)
  val ys = List(6,7,8,9,10)

  xs.filter(x=>x%2==0)
  //Equivalent
  for (x <- xs if x % 2 == 0) yield x

  xs.flatMap(x => ys.map(y => (x, y)))

 // You can read it as “for every value ‘x’ in ‘xs’, and then for every value ‘y’ in ‘ys’, return ‘(x, y)’”.
  for (x <- xs; y <- ys) yield (x, y)






}
