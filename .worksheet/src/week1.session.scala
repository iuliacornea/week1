package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(393); 
  
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
	};System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$0 = 
	sqrt(2.0);System.out.println("""res0: Double = """ + $show(res$0))}

}
