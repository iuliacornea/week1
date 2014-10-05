package week1assignments

object paranthesisBalancing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(99); 
  println("Welcome to the Scala worksheet");$skip(558); 
  
  def balance(chars: List[Char]): Boolean ={
    def balanceItr(unpaired: Int, chars: List[Char]): Boolean ={
      if(unpaired < 0) false
        else {
          if(chars.isEmpty) if(unpaired == 0) true else false
            else{
              if(chars.head == '(') balanceItr(unpaired+1, chars.tail)
                else {
                  if(chars.head == ')') balanceItr(unpaired-1, chars.tail)
                    else  balanceItr(unpaired, chars.tail)
                }
            }
          
        }
    }
    
    balanceItr(0, chars)
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(41); val res$0 = 

	balance("a( jhhjh()(())fsfsf)".toList);System.out.println("""res0: Boolean = """ + $show(res$0))}

}
