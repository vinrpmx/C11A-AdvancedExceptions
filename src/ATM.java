public class ATM {
	private static BankAccount account;

	public ATM() {
		super();
		account = new BankAccount(500);
	}
	
	public void handleTransactions() {
		try {
			//tries to withdraw $600 through withdraw
			account.withdraw(600);
		} catch (NegativeBalanceException e) {
			// throws NegativeException error
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		try {
			//tries to withdraw $600 through quickWithdraw
			account.quickWithdraw(600);
		} catch (NegativeBalanceException e) {
			// throws NegativeException error
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String args []) {
		ATM officalAccount = new ATM();
		officalAccount.handleTransactions();
	}
	
}
