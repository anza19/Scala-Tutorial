package lectures.part1Basics

object Functions2 extends App {

  //(PARAMS): RETURN TYPE =
  //BODY
  def aFunction(a: String, b: Int): String = {
        a + " " + b;
  }
  println(aFunction("Muhammad Anza Khan", 24))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())

  //Don't loop, do recursion instead
  //WHEN YOU NEED LOOPS USE RECURSION
  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n==1)aString;
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Muhammad", 3))

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1);
  }

  println(aBigFunction(5))

  def anotherBigFunction(n: Int): Int = {
    def anotherSmallerFunction(a: Int, b: Int): Int = {
      a+b
    }
    anotherSmallerFunction(n, n-1);
  }
  println(anotherBigFunction(10))

  //A greeting function
  def greetingFunction(name: String, age: Int): String = {
    "Hi my name is, " + name + " and I am " + age + " years old."
  }
  println(greetingFunction("Muhammad Anza Khan", 24));

  //Factorial function
  def factorialFunction(n: Int): Int = {
    if(n==1)1
    else n*factorialFunction(n-1);
  }
  println(factorialFunction(6));

  //Fibonacci function
  def fibonacciFunction(n: Int): Int = {
    if(n <= 1)1
    else fibonacciFunction(n-1) + fibonacciFunction(n-2);
  }
  println(fibonacciFunction(5))
}
