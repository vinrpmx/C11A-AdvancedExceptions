import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class NegativeBalanceException extends Exception{
	private double negativeBalance;

	public NegativeBalanceException() {
		super("Error: negative balance");
	}

	public NegativeBalanceException(double amountWithdraw) {
		super("Amount exceeds balance by " + amountWithdraw);
		negativeBalance = amountWithdraw;
		try {
			PrintWriter out = new PrintWriter("logfile.txt");
			out.println("Amount exceeds balance by " + negativeBalance);
			out.close();
		} catch (FileNotFoundException e) { //Used IOException as it is the parent of FileNotFoundException
			System.out.println("Invalid File");
		}
	}

	@Override
	public String toString() {
		return "Balance of " + negativeBalance + " not allowed";
	}	
	
}
