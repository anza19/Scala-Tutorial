package oop

object MethodNotations extends App {

  class Person(val name: String, val favouriteMovie: String) {

    //simple class method
    def likes(movie: String): Boolean = {
      movie == this.favouriteMovie
    }

    def hangOutWith(person: Person): String = {
      s"${this.name} is hanging out with ${person.name}"
    }

    //CPP style method can turn +,- etc into methods
    def + (person: Person): String = {
      s"${this.name} is hanging out with ${person.name}"
    }


  }
  val bradPitt = new Person("Brad Pitt", "Ocean's 11");
  println(bradPitt.likes("7seven"));

  //we could have done the above using infix notation, shown below
  println(bradPitt likes "Ocean's 11");

  val tom = new Person("Tom", "Fight Club")
  println(bradPitt hangOutWith tom);

  val mary = new Person("Mary", "Once Upon A Time In Hollywood");
  println(mary + bradPitt);
}