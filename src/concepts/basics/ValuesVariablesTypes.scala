package concepts.basics

/**
 * Values, Variables and Types
 */
object ValuesVariablesTypes extends App {
  // semicolons are optional in scala
  // unless we write more than one statements in same line

  // val are immutable like constants
  val x: Int = 23
  println(x)

  // specifying types of val are optional
  // compiler can infer types
  val y = 43
  println(y)

  // data types
  val aString: String = "Hello Scala"
  val aChar: Char = 'A'

  val aBoolean: Boolean = true

  val aInt: Int = 5 // default integer type
  val aShort: Short = 2
  val aLong: Long = 12345L

  val aFloat: Float = 2.5f
  val aDouble: Double = 2500.55 // default floating point type

  // variables - values can be reassigned
  var aVariable: Int = 55
  aVariable = 100
}
