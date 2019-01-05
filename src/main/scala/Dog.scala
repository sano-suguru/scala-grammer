class Dog(name: String) {
  def greet(): Unit = print(s"${name}だワン")
}

object Taro extends Dog(name = "タロウ")
