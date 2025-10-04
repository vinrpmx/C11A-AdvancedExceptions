import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class NegativeBalanceException extends Exception{
	private double negativeBalance;

	public NegativeBalanceException(String message) {
		super("Error: negative balance");
	}

	public NegativeBalanceException(double negativeBalance) {
		super("Amount exceeds balance by " + negativeBalance);
		try {
			FileWriter logfile = new FileWriter("logfile.txt", true);
			PrintWriter out = new PrintWriter(logfile);
			this.negativeBalance = negativeBalance;
			out.println("Amount exceeds balance by " + negativeBalance);
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("Invalid File");
		}
	}

	@Override
	public String toString() {
		return "Balance of " + negativeBalance + " not allowed";
	}	
	
}
