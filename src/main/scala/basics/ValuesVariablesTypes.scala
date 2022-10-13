package basics

object ValuesVariablesTypes extends App {

  // COMPILER CAN INFER TYPES
  //  val x: Int = 42
  // VALS ARE IMMUTABLE
  val x = 42
  println(x)

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 34567890456789L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // VARIABLES
  var aVariable: Int = 4
  aVariable = 5 // side effects
}
