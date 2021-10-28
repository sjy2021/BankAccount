public class Traditional extends IRA{
    private static double PENTALY = 0.10;
    private double requiredAge;
    private double minDistributuion;

    public Traditional(String birthDate, double taxIncomeAmt, String accountHolder)
    {
        super(birthDate,taxIncomeAmt,accountHolder);
    }

    public void deposit(double amount)
    {
        if(!contributionCheck(amount))
            balance += amount;
        else
            System.out.println("You have contributed your max contributions for the year!");
    }

    public void withdraw(double amount)
    {
        if(balance > 0)
        {
            if(checkPentaly())
                balance = balance - ((amount * PENTALY)+amount);
        }
        else
            System.out.println("Insufficent funds!");
    }

    private boolean checkPentaly()
    {
        return determineAge() < 70.0;
    }

    private boolean checkRequiredAge()
    {
        if(determineAge() >= 70.0)
        {
            // min distrubution forumlua
            return true;
        }
        else
            return false;
    }
}
