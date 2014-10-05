package practice

object sumExponentialOf2AtoB {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def exponentialOf2(n: Int): Int ={
    if(n == 0) 1
      else 2*exponentialOf2(n-1)
  }                                               //> exponentialOf2: (n: Int)Int
  
  def sumExponentialOf2(a: Int, b: Int): Int ={
    if(a > b) 0
      else exponentialOf2(a) + sumExponentialOf2(a+1, b)
  }                                               //> sumExponentialOf2: (a: Int, b: Int)Int
  
  sumExponentialOf2(0, 3)                         //> res0: Int = 15
}