public class NegativeBalanceException extends Exception{
	private double negativeBalance;

	public NegativeBalanceException(String message) {
		super("Error: negative balance");
	}

	public NegativeBalanceException(double negativeBalance) {
		super("Amount exceeds balance by " + negativeBalance);
		this.negativeBalance = negativeBalance;
	}

	@Override
	public String toString() {
		return "Balance of " + negativeBalance + " not allowed";
	}	
	
}
