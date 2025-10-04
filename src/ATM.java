public class ATM {
	private static BankAccount amount;

	public ATM(BankAccount amount) {
		super();
		this.amount = amount;
	}
	
	public void handleTransactions() {
		BankAccount account = new BankAccount(500);
		try {
			//tries to withdraw $600
			account.withdraw(600);
		} catch (NegativeBalanceException e) {
			// throws NegativeException error
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		try {
			//tries to withdraw $600
			account.quickWithdraw(600);
		} catch (NegativeBalanceException e) {
			// throws NegativeException error
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String args []) {
		ATM officalAccount = new ATM(amount);
		
		officalAccount.handleTransactions();
	}
	
}
