package oop

object OOBasics extends App {

  val person = new Person("Muhammad Anza Khan", 24);
  println(person.age)
  println(person.x)
  person.greet("SOME_NAME");

}

//This is a class
//This is how we pass parameters to a class
//It is a constructor
class Person(val name: String, val age: Int){
    //body
  //implementation of class
  //the stuff in the body is also a field
  val x = 2;
  println(1+3);

  //Function
  def greet(name: String): Unit = {
    println(s"${this.name} says: Hi, $name")
  }
}

//To make class members, we have to do something else
//Not the same as member