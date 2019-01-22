///**
//  * Created by sheikh on 3/12/17.
//  */
//object HigherOrderFunctions {
//
//  def main(args: Array[String]){
//
//    /******High Order Functions  (Map & Filter) are (Mostly Used) *******************/
//
//    val array = Array(1,2,3,4,5,6)
//
//    val array1 = Array.tabulate(10)(_*5)
//
//
//    array.map(i=> i*i)
//    array.map(i=>i.+("hi"))
//    array.map(i=>"hi"*i)
//    array.map(_/2)
//
//
//    array.filter(i=>i%2==0)
//    array.filter(_%2==0).map(_*2)
//
//    array.count(_%2==0)
//
//    array.dropWhile(_<9)
//
//    array.map(n=>Array.fill(n)(n))  //gives Arrays
//
//    array.flatMap(n=>Array.fill(n)(n))  //single array
//
//
//    val (even,odd) = array.partition(_%2==0)
//
//
//
//
//    /**************Reduce & Fold *********************/
//
//    //both the arguments have to be of same datatype
//    array.reduceLeft(_+_)   //move to left step by step and do whatever we specify
//    array.sum
//
//    array.reduceLeft(_- _)
//
//    array.reduceLeft((a,b)=>{println(a+ "  " +b); a+b})
//
//
//    //both the arguments don't need to be of same datatype
//    array.foldLeft(0)(_+_)
//    array.foldLeft("")(_+_ +",")
//
//      ///make combinations of 3
//    array.combinations(3).foreach(n=>println(n.mkString(",")))
//*/
//
//    array.inits.foreach(a=>println(a.mkString(" ")))
//    println("Here")
//    array.tails.foreach(a=>println(a.mkString(" ")))
//
//    println("NOW")
//    array.permutations.foreach(a=>println(a.mkString(" ")))
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//  }
//}
