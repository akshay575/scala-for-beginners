package concepts.basics

/**
 * Call by name vs Call by value
 */
object CBNvsCBV extends App {
  // in call by value, arguments passed are pre-evaluated before passing to actual function
  // value of System.nanoTime() is passed here
  def callByValue(x: Long): Unit = {
    println("Call by value: " + x)
    println("Call by value: " + x)
  }

  // in call by value, arguments are passed as it is, and are evaluated when required or used
  // System.nanoTime() is passed as it is here and x calls it every time
  // it essentially delays the evaluation until it is required
  def callByName(x: => Long): Unit = {
    println("Call by name: " + x)
    println("Call by name: " + x)
  }
  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  // another example
  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  // stack overflow error, as it tries to calculate infinite() value
  // printFirst(infinite(), 5)

  // works fine, as infinite() is never evaluated
  printFirst(5, infinite())
}

