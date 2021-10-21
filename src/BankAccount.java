public abstract class BankAccount
{
    protected String accountHolder;

    protected static int lastAccountNum = 0;

    protected int accountNumber;

    protected double balance;


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
        balance-=amount;
    }


}
