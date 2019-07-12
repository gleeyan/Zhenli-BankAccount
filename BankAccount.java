import java.util.Random;

public class BankAccount{
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numberofAccounts;
	private static double totalAmountInAllAccounts;

	public BankAccount(){
	  accountNumber = generateNewAccountNumber();
	  numberofAccounts++;
      
	}

	public String getAccountNumber(){
		return accountNumber;
	}

	private String generateNewAccountNumber(){
	    
	    String newAccountNumber = "";

	    Random rand = new Random();

	    for (int i = 0; i <10; i++){
	    	int num = rand.nextInt(10);
	    	newAccountNumber += num;
	    }

	    accountNumber = newAccountNumber;
	    return newAccountNumber;

}

public double getCheckingBalance(){
	return this.checkingBalance;
}

public double getSavingsBalance(){
	return this.savingsBalance;
}

public void depositChecking(double checkingAmount){
	checkingBalance = checkingBalance + checkingAmount;
}

public void depositSavings(double savingsAmount){
	savingsBalance = savingsBalance + savingsAmount;

}
public double total(){
	double totalAmountInAccount = savingsBalance + checkingBalance;
	
	return totalAmountInAccount;

}
}