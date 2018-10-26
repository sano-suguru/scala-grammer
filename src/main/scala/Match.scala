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
}
