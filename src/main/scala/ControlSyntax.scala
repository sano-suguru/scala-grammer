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
  def doubleLoop(): Unit = {
    for (x <- 1 to 5; y <- 1 until 5) {
      println(s"x = ${x} y = ${y}")
    }
  }
}
