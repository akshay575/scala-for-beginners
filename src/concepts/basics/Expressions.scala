package concepts.basics

/**
 * Expressions
 */
object Expressions extends App {

  // instruction (do something) vs expressions (give me value of something)
  // instructions are executed and don't return anything
  // expressions are evaluated and return a value

  // side effects are expressions returning Unit (void)

  // if is an expression in scala, it returns a value
  val aCondition = true
  val result = if(aCondition) "Success" else "Failure"
  println(result)

  // code blocks
  // type/value of a code block is the value/type of last expression
  val aCodeBlock = {
    val x = 2
    val y = x + 3

    if(y > 2) "Greater than 2" else "Less than 2"
  }
  println(aCodeBlock)
}
