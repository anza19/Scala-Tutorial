package lectures.part1Basics

object Functions extends App {

  //Function definition in Scala
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3));

  //Function implementation in Scala
  //def FUNCTION_NAME(PARAM_NAME: PARAM_TYPE): TYPE_RETURN = {IMPLEMENTATION}

  //Akin to an arrow function
  def aParameterlessFunction(): Int = 42;
  println(aParameterlessFunction())

  //Looping in a functional language
  //Most times we use recursion to loop in FP
  //WHEN YOU NEED LOOPS IN FUNCTIONAL PROGRAMMING
  //USE RECURSION
  //NEVER, EVER USE LOOPS IN FUNCTIONAL PROGRAMMING
  //ALWAYS USE RECURSION
  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1)aString
    else aString + aRepeatedFunction(aString, n-1);
  }

  def aGreeting(name: String, age: Int): String = {
    "Hi my name is " + name + " I am " + age;
  }

  println(aGreeting("Anza", 24));

  def factorial(n: Int): Int = {
    if(n == 1)1
    else n*factorial(n-1);
  }
  println(factorial(6))

  def fib(n: Int): Int = {
    if(n <= 1)1
    else fib(n-1) + fib(n-2);
  }

  println(fib(10))

}

