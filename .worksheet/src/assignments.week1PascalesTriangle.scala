package assignments

object week1PascalesTriangle {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(95); 
  println("Welcome to the Scala worksheet");$skip(117); 
  
  def pascal(c: Int, r: Int): Int = {
    if(c == 0 || c == r) 1
      else pascal(c-1, r-1) + pascal(c, r-1)
  };System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(17); val res$0 = 
  
  pascal(0,2);System.out.println("""res0: Int = """ + $show(res$0));$skip(14); val res$1 = 
  pascal(1,2);System.out.println("""res1: Int = """ + $show(res$1));$skip(14); val res$2 = 
  pascal(1,3);System.out.println("""res2: Int = """ + $show(res$2));$skip(14); val res$3 = 
  pascal(2,4);System.out.println("""res3: Int = """ + $show(res$3))}
}
