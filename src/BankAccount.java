public class BankAccount {
	private double balance;
	
	// Static variable, just one for all instances of BankAccount.
	private static int lastAccountNum;	

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}	
	
	//withdraws
	public void withdraw(double amountWithdraw) throws NegativeBalanceException {
		if (amountWithdraw > balance) {
			throws new NegativeBalanceException();
		}
		else {
			balance -= amountWithdraw;
		}
	}
	
	//quick withdraws
	public void quickWithdraw(double amountWithdraw) throws NegativeBalanceException {
		if (amountWithdraw > balance) {
			throws new NegativeBalanceException();
		}
		else {
			balance = balance - amountWithdraw;
		}
	}

	
}
