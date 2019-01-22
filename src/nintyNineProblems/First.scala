package nintyNineProblems

/**
  * Created by sheikh on 4/22/17.
  */
object First {

  def main(args: Array[String]): Unit = {

    val list = List(2, 3, 6, 7, 90, 67, 45, 999)

    //   println(lastBuiltIn(list))

    //  println(lastRecursive(list))

    //   print(kthElement(6,list))

    /*print(totalElements(list))
    println
    print(totalElementsLoop(list))*/
  }

  /** **********************************1st ********************************/
  def lastBuiltIn[G](ls: List[G]): G = ls.last


  def lastRecursive[A](ls: List[A]): A = ls match {
    case list :: Nil => list
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }

  /** **********************************2nd ********************************/

  def secondLast[G](ls: List[G]): G = ls.init.last

  def secondLastRecursive[G](ls: List[G]): G = ls match {

    case e :: _ :: Nil => e
    case _ :: tail => secondLastRecursive(tail)
    case _ => throw new NoSuchElementException

  }

  /** **********************************3rd ********************************/

  def kthElement[G](k: Int, ls: List[G]): G = {
    if (k > 0) ls(k)
    else throw new NoSuchElementException
  }

  /** **********************************4th ********************************/
  def totalElements[G](ls: List[G]): Int = ls.length // ls.size

  def totalElementsLoop[G](ls: List[G]): Int = {
    var count = 0
    for (i <- 0 to ls.size - 1) {
      count += 1
    }
    return count
  }

  def totalElementsRecursive[G](ls: List[G]): Int = ls match {

    case Nil => 0
    case _ :: tail => 1 + totalElementsRecursive(tail)
  }

  def totalElementsUsingFold[G](ls: List[G]): Int = {

    ls.foldLeft(0) { (c, _) => c + 1 }
  }

  /** **********************************5th ********************************/

  def reverseBuiltIn[G](ls: List[G]): List[G] = ls.reverse

  def reverseRecursive[G](ls: List[G]): List[G] = ls match {

    case Nil => Nil
    case h :: tail => reverseRecursive(tail) ::: List(h)
  }

  // Pure functional
  def reverseFunctional[G](ls: List[G]): List[G] = {
    ls.foldLeft(List[G]()) { (r, h) => h :: r }
  }

      /************************************ 6th ********************************/

  def palindrome[G](ls: List[G]): Boolean = ls == ls.reverse

  /************************************ 7th ********************************/


}