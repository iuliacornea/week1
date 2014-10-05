package practice

object sumExponentialOf2AtoB {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  println("Welcome to the Scala worksheet");$skip(94); 
  
  def exponentialOf2(n: Int): Int ={
    if(n == 0) 1
      else 2*exponentialOf2(n-1)
  };System.out.println("""exponentialOf2: (n: Int)Int""");$skip(128); 
  
  def sumExponentialOf2(a: Int, b: Int): Int ={
    if(a > b) 0
      else exponentialOf2(a) + sumExponentialOf2(a+1, b)
  };System.out.println("""sumExponentialOf2: (a: Int, b: Int)Int""");$skip(29); val res$0 = 
  
  sumExponentialOf2(0, 3);System.out.println("""res0: Int = """ + $show(res$0))}
}
