package practice

object sumIntegersAtoB {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 
  println("Welcome to the Scala worksheet");$skip(93); 
  
  def sumIntegers(a: Int, b: Int): Int = {
    if(a > b) 0 else a+sumIntegers(a+1, b)
  };System.out.println("""sumIntegers: (a: Int, b: Int)Int""");$skip(22); val res$0 = 
  
  sumIntegers(1,9);System.out.println("""res0: Int = """ + $show(res$0))}
}
