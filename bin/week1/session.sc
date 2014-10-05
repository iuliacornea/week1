package week1

object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def sqrt(x: Double) ={
  
  def abs(x: Double): Double =  if(x>0) x else -x
    
  def isGoodEnough(guess: Double): Boolean =
  	if(abs(guess*guess - x)<0.001)
   		true else false
  
  def improve(guess: Double): Double =(guess + x/guess)/2
    
  def sqrtIter(guess: Double, x: Double): Double =
  	if(isGoodEnough(guess))
  		guess else sqrtIter(improve(guess),x)
  
	sqrtIter(1,x)
	}                                         //> sqrt: (x: Double)Double
	sqrt(2.0)                                 //> res0: Double = 1.4142156862745097

}