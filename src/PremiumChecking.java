/*
Premium Checking accounts have the same $35 Overdraft Fee, $500 Withdrawal Limit, 
and No Transaction Fees.
*/
class PremiumChecking extends Checking {

	private static final int OVERDRAFT_FEE = 35;
	private static final int withdrawalLimit = 500;
	private static final int transactionFee = 0;

	public PremiumChecking() {
		super();
	}

	public PremiumChecking(double initialDeposit) {
		super(initialDeposit);
	}

	public int getTransactionFee() {
		return transactionFee;
	}

	public int getWithdrawalLimit() {
		return withdrawalLimit;
	}

	public int getOverdraftFee() {
		return OVERDRAFT_FEE;
	}

	/*
	Checks to ensure positive deposit amount, if the amount is >0, deposit amount but deduct
	transaction fee from balance.
	*/
    public void deposit(double amount) {
		if (amount > 0) {
			balance = (balance + amount) - transactionFee;
			System.out.printf("You've deposited: $%.2f%n", amount);
			System.out.printf("Your new balance is: $%.2f%n", balance);
		}
		else {
			System.out.println("Invalid amount. You cannot deposit negative amount!");
		}
    }

	/*
	Checks to ensure positive withdraw amount and is below daily Withdrawal limit. If withdrawal amount is greater than account 
	balance, it will result in $35 Overdraft Fee. It will also deduct $1 for the Transaction Fee.
	*/
    public void withdraw(double amount) {
		if (amount > 0) {
			if (amount > withdrawalLimit) {
				System.out.printf("Declined. This is above your daily withdrawal limit of: $%.2f%n", withdrawalLimit);
			} else {
				if((amount + transactionFee) >= balance) {
					System.out.printf("NOTE: This transaction will result in an overdraft fee of: $%.2f%n" + OVERDRAFT_FEE);
					balance -= amount;
					balance -= OVERDRAFT_FEE;
					balance -= transactionFee;
	
					System.out.printf("Withdrawal Amount: $%.2f%n", amount);
					System.out.printf("Transaction Fee: %.2f%n", transactionFee);
					System.out.printf("Your Account balance: $%.2f%n", balance);
				} else {
					System.out.printf("Withdrawal Amount: $%.2f%n", amount);
					System.out.printf("Transaction Fee: %.2f%n", transactionFee);
					System.out.printf("Your Account balance: $%.2f%n", balance);			
				}
			}
		}
		else {
			System.out.println("Invalid amount. You cannot withdraw negative amount(s)!");
		}		
    }

	public String toString() {
		return super.toString();
	}

}

