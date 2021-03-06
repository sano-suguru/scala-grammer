object ControlSyntax {
  // 式はセミコロンで区切る{ exp1; exp2; ... expN; }
  // 式なので最後に評価されたものが戻り値
  def bar(): String = {
    "bar"
  }

  // scalaにおいてifは式
  def printOver18(age: Int): Unit = {
    val message = if (age < 18) {
      "18歳未満です"
    } else {
      "18歳以上です"
    }
    println(message)
  }

  // whileも式
  def printWhileResult(): Unit = {
    var i = 0
    val result = while (i < 10) i = i + 1
    println(result)
  }

  // forも式
  // 多重ループをひとつの for で表現で書ける
  // if でフィルタリングできる( x と y の値が等しくなる場合のループ処理は行われない)
  def doubleLoop(): Unit = {
    for (x <- 1 to 5; y <- 1 until 5 if x != y) {
      println(s"x = ${x} y = ${y}")
    }
  }

  def collectionLoop(): Unit =
    for (e <- Seq("A", "B", "C", "D", "E")) println(e)

  def generateCollection(): Seq[String] =
    for (e <- Seq("A", "B", "C", "D", "E")) yield "Pre" + e

  def printIsBaby(age: Int, isSchoolStarted: Boolean): Unit = {
    val isBaby = (1 to 6).contains(age) && isSchoolStarted
    if (isBaby) {
      println("幼児です")
    } else {
      println("幼児ではありません")
    }
  }

  def loopFrom0To9(): Unit = {
    var i = 0
    do {
      println(i)
      i += 1
    } while (i < 10)
  }

  def printRightTriangles(): Unit =
    for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000 if a * a == b * b + c * c) println((a, b, c))
}
