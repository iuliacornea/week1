package week1assignments

object paranthesisBalancing {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
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
  }                                               //> balance: (chars: List[Char])Boolean

	balance("a( jhhjh()(())fsfsf)".toList)    //> res0: Boolean = true

}