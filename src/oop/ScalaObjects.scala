package oop

object ScalaObjects extends App {

  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person {
    val N_EYES = 2;
    def canFly: Boolean = true
  }

  println(Person.N_EYES)
  println(Person.canFly)

  //Scala object is a singleton instance
  //this means that if we make multiple instances of the object
  //they will be equal
  val mary = Person
  val john = Person
  println(mary == john)
}
