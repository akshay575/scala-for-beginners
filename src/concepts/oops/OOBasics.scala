package concepts.oops

object OOBasics extends App {
  val person = new Person("John", 20)
  println(person.age)
  // println(person.name)
  // above doesn't work as name is not a field in Person class

  person.greet("Akshay")
}

class Person(name: String, val age: Int) { // constructor
  // class parameters are not fields
  // we add val before parameter name to make it a field
  // we can access fields with a class object

  val x = 5 // another class field
  println(x)

  // we can do anything inside a class block what we can do in a code block

  def greet(name: String): Unit = println(s"${this.name} says, Hi $name!")
  // we can refer to class fields with this keyword

  // multiple constructors
  // they can only call primary or other secondary constructor
  def this(name: String) = this(name, 0)
  def this() = this("John")
}