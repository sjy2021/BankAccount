public class Checking extends BankAccount {
	private static final int OVERDRAFT_FEE = 35;
	private int withdrawalLimit;
	private int monthlyFee;
	private double interestPercent;

	
	public Checking() {
		//Return Account Number and information below. 
		System.out.println("Congratulations on your new Account." + "\n" + this.toString());
	}

	public Checking(double initialDeposit) {
		this.balance = super.getBalance() + initialDeposit;
		System.out.println("Congratulations on your new Account." + "\n" + this.toString());
	}

	public void setMonthlyFee(int fee) {
		this.monthlyFee = fee;
	}

	public int getMonthlyFee() {
		return monthlyFee;
	}

	public void setInterestPercent(double interest) {
		this.interestPercent = interest;
	}

	public double getInterestPercent() {
		return interestPercent;
	}

	public int getWithdrawalLimit() {
		return withdrawalLimit;
	}

	@Override
	public double getBalance() {
        return super.getBalance();
	}

	@Override
    public void deposit(double amount) {
		double depositedAmount = amount;
        super.deposit(amount);
		System.out.println("You've deposited " + depositedAmount + ". Your new balance is: " + super.getBalance());
    }

	@Override
    public void withDraw(double amount) {
		double chkBalance = super.getBalance() - amount;
		if (chkBalance < 0) {
			System.out.println("NOTE: This transaction will result in an overdraft fee of: " + OVERDRAFT_FEE);
			super.withDraw(amount);
			System.out.println("Your Checking account now has a balance of: " + super.getBalance());
		}
		else {
			super.withDraw(amount);
			System.out.println("Your Checking account now has a balance of: " + super.getBalance());
		}		
    }

	public String toString() {
		return "AccountNumber: " + "\n" //GET ACCOUNT NUMBER FROM BANK ACCOUNT
				+ "Balance: " + getBalance() + "\n"
				+ "Interest Percent: " + getInterestPercent() + "\n"
				+ "Monthly Fee: " + getMonthlyFee()+ "\n"
				+ "Withdrawal Limit: " + getWithdrawalLimit();
	}

}