
printf("Hello,I'm %s and I'm %d years old  ","Hussain",21)



for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")

def decorate (str:String,left:String,right: String): String = left+str+right

decorate("Hussain","<<<< "," >>>>")

def decorateDefault(str:String,left:String="[",right:String="]"):String = left+str+right

decorateDefault("Hussain")

def sum(n:Int*)={

  var result = 0
  for (i <- n) result += i
  result

}

