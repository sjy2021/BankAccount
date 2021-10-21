public class Checking extends BankAccount {
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

	public String toString() {
		return "AccountNumber: " + "\n" //GET ACCOUNT NUMBER FROM BANK ACCOUNT
				+ "Interest Percent: " + interestPercent + "\n"
				+ "Monthly Fee: " + getMonthlyFee()+ "\n"
				+ "Withdrawal Limit: " + getWithdrawalLimit();
	}

}