class ReferenceCell(ix: Int, iy: Int, val table: Table) extends Cell {
  override def toString: String = {
      val referenceCell = getCell
      referenceCell match {
          case None => "outOfRange"
          case Some (cell: ReferenceCell) => if (this == cell.getCell.get) "cyclic"
                                             else cell.getCell.get.toString
          case Some (cell: Cell) => cell.toString
      }
  }

  def getCell: Option[Cell] = table.getCell(ix, iy)
}