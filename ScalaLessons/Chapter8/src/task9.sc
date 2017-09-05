class Creature {
  def range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends {
  override val range = 5
} with Creature

val a = new Ant

a.env.length
