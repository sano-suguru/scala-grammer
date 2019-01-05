object Graph {
  // 隣接行列
  val matrix: Array[Array[Int]] = Array(
    Array(0, 1, 1, 0, 0),
    Array(1, 0, 0, 1, 0),
    Array(1, 0, 0, 1, 1),
    Array(0, 1, 1, 0, 1),
    Array(0, 0, 1, 1, 0),
  )

  // 隣接リスト
  val list: Map[Char, Seq[Char]] = Map(
    'A' -> Seq('B', 'C'),
    'A' -> Seq('A', 'D'),
    'A' -> Seq('A', 'D', 'E'),
    'A' -> Seq('B', 'C', 'E'),
    'A' -> Seq('C', 'D'),
  )

  // 隣接する辺
  case class Edge(from: Char, to: Char)
  val edges = Seq(
    Edge('A', 'B'),
    Edge('A', 'C'),
    Edge('B', 'A'),
    Edge('B', 'D'),
    Edge('C', 'A'),
    Edge('C', 'D'),
    Edge('C', 'E'),
    Edge('D', 'B'),
    Edge('D', 'C'),
    Edge('D', 'E'),
    Edge('E', 'C'),
    Edge('E', 'D')
  )
}
