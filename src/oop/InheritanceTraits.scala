package oop

object InheritanceTraits extends App {

  class Animal {
    def eat = println("nomnom");
  }

  class Cat extends Animal{
    def crunch = {
      eat
      println("crunch crunch");
    }
  }
  val cat = new Cat
  cat.eat
  cat.crunch

  //constructors
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  class Dog extends Animal{
    override def eat = println("crunch, crunch")
  }
  val dog = new Dog
  dog.eat
  println(dog.crea)
}
