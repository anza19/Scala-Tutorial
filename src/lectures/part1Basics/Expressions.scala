package lectures.part1Basics

object Expressions extends App {

  //Expressions are simply a right hand side expression evaluated to something
  val x = 1 + 2
  println(x)

  //Relational operations
  println(1 == x)

  var aVariable = 4;
  aVariable += 10;
  println(aVariable)

  //Instructions v/s Expressions
  //An instruction is something you tell the computer to do
  //They do
  //Expression has a value AND/OR a type
  //We think in terms of expressions in Scala
  //This means in Scala each line of our code computes a value

  //if statement
  val aCondition = true;
  val aConditionedValue = if(aCondition) 5 else 3;
  println(aConditionedValue)

  //EVERYTHING IN SCALA IS AN EXPRESSION
  val aWeirdValue = (aVariable = 3)

  //side effects: return a unit

  //Code blocks are expressions
  //All things in Scala are expressions
  //The value of the expression is the last code block
  //So in this case aCodeBlock will equal "Hello"
  val aCodeBlock = {
    //define some more values
    val y = 2
    val z = y + 1
    if(z > 2) "Hello" else "goodbye"
  }

  //the value of a codeblock is the last value
  val anotherCodeBlock = {
    val w = 10;
    val aCondition = true;
    if(aCondition) 42 else 0;
    if(1+1 == 3) "true" else "False"
  }
  println(anotherCodeBlock)
}
