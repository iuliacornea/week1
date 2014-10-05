package practice

object sumSquaresOfIntegersAtoB {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def square(x: Int): Int = x*x                   //> square: (x: Int)Int
  
  def sumSquareOfIntegers(a: Int, b: Int): Int ={
    if(a > b) 0
      else square(a) + sumSquareOfIntegers(a+1, b)
  }                                               //> sumSquareOfIntegers: (a: Int, b: Int)Int
  
  sumSquareOfIntegers(1, 5)                       //> res0: Int = 55
  
}