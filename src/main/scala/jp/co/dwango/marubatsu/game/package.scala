package jp.co.dwango.marubatsu

import jp.co.dwango.marubatsu.board.{
  CellState,
  Maru => MaruState,
  Batsu => BatsuState
}

package object game {
  def toWinner(cellState: CellState): Winner = cellState match {
    case MaruState => game.Maru
    case BatsuState => game.Batsu
    case board.Empty => game.NoWinner
  }
}
