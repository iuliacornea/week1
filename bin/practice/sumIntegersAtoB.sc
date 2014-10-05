package practice

object sumIntegersAtoB {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def sumIntegers(a: Int, b: Int): Int = {
    if(a > b) 0 else a+sumIntegers(a+1, b)
  }                                               //> sumIntegers: (a: Int, b: Int)Int
  
  sumIntegers(1,9)                                //> res0: Int = 45
}