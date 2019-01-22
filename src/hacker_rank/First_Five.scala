package hacker_rank

/**
  * Created by sheikh on 3/15/17.
  */
object First_Five {

  def main(args:Array[String]){

   // fun
   //   display
  //  printNtime(3)

   // println(f2(3,List(3,5,8,0)))

  //  println(f3(7,List(5,1,6,8,0,10,11,12)))
    // println(f4(List(5,1,6,8,0,10,11,12)))

   /* for(i<- 0 until 9){
      print(f5(i)+",")
    }*/



  }

                /******HackerRank ******/
  def fun = println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)

  /***********ME ***************/
 // val fun1 =  println(readInt+readInt)


    def display() = println("Hello World!")

  def printNtime(n:Int)=for (i <- 1 to n)
      println("Hello World!!")

  def f(num:Int,arr:List[Int]):List[Int] = arr.map(i => (1 to num).map(_=> i)).flatMap(j => j)
        //Returns each list element having number of times specified in argument
  def f1(num:Int,arr:List[Int]):List[Int] = arr.flatMap(List.fill(3)(_))

   def f2(n:Int,list: List[Int]){
     for(i <- 1 to n){
        println()
       for(j <- 0 until list.size)
         print(list(j)+" ")
     }
   }
    //List having elements less than input argument
  def f3(delimeter:Int,list: List[Int]):List[Int] = list.filter(_< delimeter)

  //List elemenmts on even position
  def f4(list: List[Int]):List[Int] =  list.zipWithIndex.filter(_._2 % 2 != 0).map(_._1)

  def f5= Array.tabulate(10)(_+1)







}
