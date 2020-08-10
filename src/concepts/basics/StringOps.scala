package concepts.basics

/**
 * String Operations
 */
object StringOps extends App {

  val str: String = "Hello, I am learning Scala!"

  // similar to java
  println(str.charAt(2))
  println(str.substring(0, 5))
  // split returns a string array
  println(str.split(" ").toList)
  println(str.replace(" ", " _"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "5"
  println(aNumberString.toInt)

  println(str.reverse)
  // take first 5 chars
  println(str.take(5))

  // Scala specific - interpolated strings

  // S-interpolators
  val name = "John"
  val age = 14
  val greeting = s"Hi, my name is $name and I'm $age years old."
  val anotherGreeting = s"Hi, my name is $name and I'm ${age + 2} years old."
  println(greeting)
  println(anotherGreeting)

  // F-interpolators
  val speed = 1.4f
  // %2.2f means minimum 2 characters (for formatting) and 2 decimals precision
  // similar to printf
  val myth = f"$name%s can eat $speed%2.2f burgers per minute."
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline.")
  val text = "This is a \n newline."
  println(raw"$text")
  // raw ignores escaped characters in raw"string"
  // injecting a non-raw string in raw will be escaped
}
