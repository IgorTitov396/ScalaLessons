class Square(x: Int, y: Int, width: Int) extends java.awt.Rectangle(x, y, width, width) {
  def this() = this(0, 0, 0)
}

val a = new Square()

