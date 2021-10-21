class Checking extends BankAccount {
	private static final int OVERDRAFT_FEE;
	private int withdrawalLimit;
	private int monthlyFee;
	private double interestPercent;

	
	public Checking(){
		//Return Account Number and information below. 
		System.out.println("Congratulations on your new Account " + "ACCOUNTHOLDER" + "!"); //Place Account Holder Name here. 	
	}


	public void setMonthlyFee(int fee) {
		this.monthlyFee = fee;
	}

	public getMonthlyFee() {
		return monthlyFee;
	}

	public void setInterestPercent(double interest) {
		this.interestPercent = interest;
	}

	public getInterestPercent() {
		return interestPercent;
	}

	public getWithdrawalLimit() {
		return withdrawalLimit;
	}

	public toString() {
		return "AccountNumber: " + "\n" + //GET ACCOUNT NUMBER FROM BANK ACCOUNT
				+ "Interest Percent: " + interestPercent + "\n"
				+ "Monthly Fee: " + monthlyFee + "\n" + 
				+ "Withdrawal Limit: " + withdrawalLimit;
	}

}