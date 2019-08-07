package lectures.part1Basics

object Expressions2 extends App {

  //Right handed side are called EXPRESSIONS
  val x = 1+2;
  println(x);

  println(1 == x);

  var aVariable = 2;
  aVariable += 3;
  println(aVariable)

  //Instructions v/s Expressions
  //Instruction is something you tell a computer to do!
  //Expression has a value AND/OR type
  //Every single line of code computes a value

  //An if-else block returns a value in Scala
  //It does not perform an instruction
  val aCondition = true;
  val aConditionedValue = if(aCondition) 5 else 3;
  println(aConditionedValue)

  //Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
  }
}
