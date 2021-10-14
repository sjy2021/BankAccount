public class BankAccount
{
    private String accountHolder;

    private int accountNumber;

    private double balance;

    public BankAccount(){}

    public BankAccount(double amount)
    {

    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withDraw(double amount)
    {

    }
}
