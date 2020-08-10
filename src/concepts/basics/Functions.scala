package concepts.basics

import scala.annotation.tailrec

/**
 * Functions
 */
object Functions extends App {
  // use recursion instead of loops whenever possible

  def aFunction(name: String) : String = {
    "Hello " + name
  }
  println(aFunction("Akshay"))

  // compiler can infer return type of val, variables and functions (except recursive functions)
  // same line doesn't require a block
  def aParameterLessFunction() = 100
  println(aParameterLessFunction())
  // can be called without parenthesis
  println(aParameterLessFunction)

  // return type is required in recursive functions
  def factorial(n: Int): Int = {
    if(n <= 1) 1
    else n * factorial(n-1)
  }
  println("Factorial of 5: ", factorial(5))

  // a function can have nested or auxiliary functions
  def isPrime(n: Int) : Boolean = {
    @tailrec // optional, won't compile if function is not tail recursive
    def isPrimeUntil(t: Int): Boolean = {
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n / 2)
  }
  println(isPrime(5))

  // use tail recursion instead of loops, as scala uses the same allocated stack by overwriting when required
  // instead of allocating new memory stack which helps in no stack overflow error
  // tail recursion = recursive call as the last expression
  var greet = "Hello"
  def concatenate(n: Int, concat: String): String = {
    if(n <= 0) concat
    else concatenate(n-1, concat + greet)
  }
  println(concatenate(3, ""))
}
