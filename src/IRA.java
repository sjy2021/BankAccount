
public class IRA extends BankAccount {
    private double age;

    private String birthDate;

    private double taxIncomeAmt;

    public IRA() {}

    public IRA(String birthDate, double taxIncomeAmt, double balance, String accountHolder)
    {
        super(balance,accountHolder);
        this.birthDate = birthDate;
        this.taxIncomeAmt = taxIncomeAmt;
    }

    private void determineAge()
    {

    }

    public void contributionCheck()
    {

    }

    public String toString()
    {
        return "";
    }
}
