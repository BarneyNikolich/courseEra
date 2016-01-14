package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

  }
  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if( (c == r) || (c == 0)) 1
    else pascal(c-1, r-1) + pascal(c, r-1)

  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def balanceIterator(open: Int, currentChar: List[Char]): Boolean = {
      if(open < 0) false
      else if(currentChar.isEmpty) open == 0     //If open == 0 then number of brackets has evened out
      else currentChar.head match {
        case '(' =>  balanceIterator(open+1, currentChar.tail)
        case ')' => balanceIterator(open-1, currentChar.tail)
        case _  => balanceIterator(open, currentChar.tail)  //Case for all other char values

      }
    }
    balanceIterator(0, chars)
  }



  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0) 1 //Base case money == 0 return a 1
    else if(coins.isEmpty || money < 0) 0
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)


    /**
     * If reading this and not making sense trace the recursion out! Its deep recursion
     * Problem is O(N^2) complexity
     */


  }




}
