class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance}
  def withdraw(amount: Double) = { balance -= amount; balance}
}

class SavingsAccount(initialBalance: Double = 0, procents: Double = 0, countFree: Int = 3) extends BankAccount(initialBalance) {
  private var numberOfOperations = 0

  override def deposit(amount: Double): Double = {
    numberOfOperations += 1
    if (numberOfOperations <= countFree) super.deposit(amount) else super.deposit(amount - 1)
  }

  override def withdraw(amount: Double): Double = {
    numberOfOperations += 1
    if (numberOfOperations <= countFree) super.withdraw(amount) else super.withdraw(amount - 1)
  }

  def earnMonthlyInterest = {
    numberOfOperations = 0
    super.deposit(super.deposit(0) * procents)
  }
}

val a = new SavingsAccount(10, 0.2)

a.withdraw(10)
a.deposit(10)
a.deposit(15)
a.deposit(0)
a.earnMonthlyInterest
a.withdraw(10)
a.deposit(10)
a.deposit(15)