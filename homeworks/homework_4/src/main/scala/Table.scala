import scala.collection.mutable

class Table (width: Int, height: Int) extends Cell {

  private def cells = new mutable.MutableList[Cell] ++= List.fill(width*height)(new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix >= 0 && iy >= 0 && ix < width && iy < height) {
      return Option(cells(ix + iy))
    }
    return None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    cells(ix + iy) -> cell
  }
}