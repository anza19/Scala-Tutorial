package lectures.part1Basics

object Recursion extends App {

  def factorial(n: Int): Int = {
    if(n <= 1)1
    else n*factorial(n-1);
  }
}
