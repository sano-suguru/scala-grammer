object Match {
  def intToName(num: Int): String = {
    num match  {
      case 1 => "one"
      case 2 => "two"
      case _ => "other" // 全てマッチする
    }
  }

  def message(message: String): String = {
    message match {
      case "good" | "bad" => "game" // | を利用して複数のパターンをまとめる
    }
  }

  def patternMatch(): Unit = {
    val seq = ('A' to 'E').map(_.toString)
    seq match {
      case Seq("A", b, c, d, e) =>
        println("b = " + b)
        println("c = " + c)
        println("d = " + d)
        println("e = " + e)
      case _ =>
        println("nothing")
    }
    println(seq)
  }
}
