class Point(val x: Double = 0.0, val y: Double = 0.0)

object Point {
  def apply(x: Double, y: Double) : Point = new Point(x, y)
}

class LablePoint(val s: String = "LablePoint", x: Double = 0.0, y: Double = 0.0) extends Point(x, y)

