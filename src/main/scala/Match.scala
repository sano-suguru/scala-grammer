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

  def patternMatchWithIf(): Unit = {
    val seq = ('A' to 'E').map(_.toString)
    seq match {
        // ガード句をかける
      case Seq("A", b, c, d, e) if b != "B" =>
        println("b = " + b)
        println("c = " + c)
        println("d = " + d)
        println("e = " + e)
      case _ =>
        println("nothing")
    }
    println(seq)
  }

  def patternMatchNest(): Unit = {
    val seq = Seq(Seq("A"), Seq("B", "C", "D", "E"))
    seq match {
      case Seq(a@Seq("A"), x) =>
        println(a)
        println(x)
      case _ =>
        println("nothing")
    }
  }
}
