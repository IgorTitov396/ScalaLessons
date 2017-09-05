class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance}
  def withdraw(amount: Double) = { balance -= amount; balance}
}

class SavingsAccount(initialBalance: Double = 0) extends BankAccount(initialBalance) {
  override def deposit(amount: Double): Double = { super.withdraw(1); super.deposit(amount) }
  override def withdraw(amount: Double): Double = { super.withdraw(1); super.withdraw(amount)}
}

val a = new SavingsAccount(10)

a.deposit(8)
a.withdraw(8)

