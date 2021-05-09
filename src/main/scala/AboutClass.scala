object AboutClass extends App {
  case class Animal (id: Int, name: String){
    def print(voice: String): Unit = {
      println(id, name, voice)
    }
  }

  val usi = Animal(1, "Usi")
  usi.print("Moh!")
}
