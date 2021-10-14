
public class IRA extends BankAccount{
    private double age;

    private String birthDate;

    private double taxIncomeAmt;

    public IRA(String bDay, double taxIncomeAmt)
    {
        this.birthDate =bDay;
        this.taxIncomeAmt = taxIncomeAmt;
        determineAge();
    }

    public IRA() {}

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
