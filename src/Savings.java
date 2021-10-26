public class Savings extends BankAccount {
  private double standardInterestRate;

  private int withDrawLimit;

  private double withDrawFee;

  public Savings(double balance, String accountHolder) {
    this.balance = balance;
    this.accountHolder = accountHolder;
    this.withDrawFee = 5.00;
    this.withDrawLimit = 9;
    this.standardInterestRate = 0.15;
  }

  private boolean checkWithDrawLimit() {
    if (withDrawLimit == 0)
      return false;
    else
      return true;
  }

  public String monthlyStatement() {
    return "";
  }

  public void deposit(double amount)
  {

  }
  public void withdraw(double amount) {

    if (!checkWithDrawLimit()) {

    } else {
      System.out.println("You have used all your withdraws!");
    }
  }
}

