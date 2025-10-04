public class BankAccount extends NegativeBalanceException {
	private double balance;
	
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}	
	
	//withdraws
	public void withdraw(double amountWithdraw) throws NegativeBalanceException {
		if (amountWithdraw > balance) {
			//
			throw new NegativeBalanceException(amountWithdraw);
		}
		else {
			balance -= amountWithdraw;
		}
	}
	
	//quick withdraws
	public void quickWithdraw(double amountWithdraw) throws NegativeBalanceException {
		if (amountWithdraw > balance) {
			throw new NegativeBalanceException();
		}
		else {
			balance = balance - amountWithdraw;
		}
	}

	
}
