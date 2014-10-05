package practice

object sumSquaresOfIntegersAtoB {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(95); 
  println("Welcome to the Scala worksheet");$skip(35); 
  
  def square(x: Int): Int = x*x;System.out.println("""square: (x: Int)Int""");$skip(124); 
  
  def sumSquareOfIntegers(a: Int, b: Int): Int ={
    if(a > b) 0
      else square(a) + sumSquareOfIntegers(a+1, b)
  };System.out.println("""sumSquareOfIntegers: (a: Int, b: Int)Int""");$skip(31); val res$0 = 
  
  sumSquareOfIntegers(1, 5);System.out.println("""res0: Int = """ + $show(res$0))}
  
}
