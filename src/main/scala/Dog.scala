class Dog(name: String) {
  def greet(): Unit = print(s"${name}だワン")
}

object Taro extends Dog(name = "タロウ")

object Dog {
  def apply(name: String) = new Dog(name)
  def apply(id: Int) = new Dog(s"番号付き犬${id}番")
}
