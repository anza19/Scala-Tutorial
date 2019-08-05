package lectures.part1Basics

object ValuesVariablesTypes extends App {

  //Need extends App to run the application

  //How to create a simple value

  // val NAME_OF_VALUE: TYPE_OF_VALUE = THE_VALUE_ITSELF
  val x = 42

  //printing the value
  println(x)

  //One cannot reassign the value of a val
  // vals are IMMUTABLE
  //So we cannot do this x = 2
  //Vals are constant

  //COMPILER CAN INFER TYPES
  val aString: String = "Hello, this is a string";
  val bString: String = "Another string";
  println(aString)

  //boolean
  val aBoolean: Boolean = true;
  println(aBoolean)

  //characters
  val aChar: Char = 'a';
  val bChar: Char = 'b';
  println(aChar);
  println(bChar);

  //VARIABLES
  //They can be reassigned
  var a: Int = 4;
  a = 5;
  println(a);

}

