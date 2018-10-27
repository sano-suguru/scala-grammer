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

  def patternMatchType(): Unit = {
    val obj: AnyRef = "String Literal"
    obj match {
      case v: java.lang.Integer => println("Integer!")
      case v: String => println(s"String! length is ${v.length}")
    }
  }

  def patternMatchGenerics(): Unit = {
    val obj: AnyRef = Seq("a", "b", "c")
    //実行時は型消去でgenericsの型が消えてるからSeq[int]にマッチしてしまう。
    // C# は IL でもgenericsの型が残っているからSwitchで正しくパターンマッチする
    obj match {
      case v: Seq[Int] => println("Seq[Int]")
      case v: Seq[String] => println("Seq[String]")
    }
  }

  def printRandomChars(): Unit = {
    for (_ <- 1 to 1000) {
      val chars: Seq[Char] = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
      val result = chars match {
        case Seq(a, b, c, d, _) => Seq(a, b, c, d, a)
      }
      println(result)
    }
  }
}
