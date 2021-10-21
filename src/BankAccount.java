public class BankAccount
{
    private String accountHolder;

    private static int lastAccountNum = 0;

    private int accountNumber;

    private double balance;

    public BankAccount()
    { lastAccountNum++;
        accountNumber = lastAccountNum;}

    public BankAccount(double balance, String accountHolder)
    {
        lastAccountNum++;
        accountNumber = lastAccountNum;
        this.balance = balance;
        this.accountHolder = accountHolder;

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
        balance-=amount;
    }


}
