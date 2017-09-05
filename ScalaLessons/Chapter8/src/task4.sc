abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(val price: Double = 0.0, val description: String = "Simple item") extends Item

class Bundle(val a:List[Item] = List[Item](), val description: String = "Bundle") extends Item {
  def price = { a.foldLeft(0D){_+_.price} }
  def add(newItem: Item) { a :+ newItem }
}

val a = new SimpleItem(5)
val b = new SimpleItem(10)
val bund = new Bundle(List(a, b))
val bund2 = new Bundle()

bund2.price
bund.price
