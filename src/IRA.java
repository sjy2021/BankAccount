
public class IRA extends BankAccount {

    private double totalContributuons;

    private String birthDate;

    private double taxIncomeAmt;

    public IRA() {}

    public IRA(String birthDate, double taxIncomeAmt, String accountHolder)
    {
        this.accountHolder = accountHolder;
        this.birthDate = birthDate;
        this.taxIncomeAmt = taxIncomeAmt;
    }

    @Override
    public void deposit(double amount) {
        if(contributionCheck(amount))
            super.deposit(amount);
        else
            System.out.println("You can contributed your max contributions for the year!");
    }

    @Override
    public void withDraw(double amount) {
        super.withDraw(amount);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    private double determineAge()
    {
        return 59.5;
    }

    private boolean contributionCheck(double amount)
    {
        if(determineAge() == 59.5 && totalContributuons == 6000 )
        {
            return false;
        }
        else if(determineAge() > 59.5 && totalContributuons == 7000)
        {
            return false;
        }
        else
            return true;
    }

    public String toString()
    {
        return "";
    }
}
