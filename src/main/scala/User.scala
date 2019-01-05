class User(private val name: String, private val age: Int) {
  override def toString: String = s"User($name $age)"
}

object User {
  def printAge(user: User) = println(user.age)

  def apply(name: String, age: Int): User = new User(name, age)
}

object Cache {
  val map: Map[Int, String] = Map(0 -> "")
}