class Checking extends BankAccount {
	private static final int OVERDRAFT_FEE = 0;
	private int withdrawalLimit;
	private int monthlyFee;
	private double interestPercent;

	
	public Checking(String accountHolder){
		this.accountHolder = accountHolder;
		//Return Account Number and information below. 
		System.out.println("Congratulations on your new Account " + accountHolder + "!"); //Place Account Holder Name here.
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

	public double getWithdrawalLimit() {
		return withdrawalLimit;
	}

	public String toString() {
		return "AccountNumber: " + "\n" + accountNumber
				+ "Interest Percent: " + interestPercent + "\n"
				+ "Monthly Fee: " + monthlyFee + "\n" + 
				"Withdrawal Limit: " + withdrawalLimit;
	}

}