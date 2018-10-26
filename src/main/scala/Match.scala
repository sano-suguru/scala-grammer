object Match {
  def intToName(num: Int): String = {
    num match  {
      case 1 => "one"
      case 2 => "two"
      case _ => "other" // 全てマッチする
    }
  }
}
