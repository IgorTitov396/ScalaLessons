class Point(val x: Double = 0.0, val y: Double = 0.0) {
  override def toString: String = { x.toString + " " + y.toString}
}

object Point {
  def apply(x: Double = 0.0, y: Double = 0.0) : Point = new Point(x, y)
}

abstract class Shape {
  def centerPoint: Point
}

class Rectangle(val pointTop: Point = Point(), val pointBot: Point = Point()) extends Shape {
  override def centerPoint = { Point(0.5 * (pointBot.x + pointBot.x), 0.5 * (pointTop.y + pointBot.y))}
}

class Circle(val centerPoint: Point = Point(), val radius: Int = 0) extends Shape

val a: Shape = new Circle(Point(2,2), 1)

println(a.centerPoint)
