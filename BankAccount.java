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
	totalAmountInAllAccounts = totalAmountInAllAccounts + checkingAmount;
}

public void depositSavings(double savingsAmount){
	savingsBalance = savingsBalance + savingsAmount;

}

public boolean withdrawChecking(double checkingAmount) throws Exception{
	if (checkingBalance - checkingAmount >= 0){
    	checkingBalance = checkingBalance - checkingAmount;
    	return true;
	}
    else{
    	throw new Exception("insufficient funds");
    	
    }
	

}

public boolean withdrawSavings(double savingsAmount) throws Exception{
	if (savingsBalance - savingsAmount >= 0){
    	savingsBalance = savingsBalance - savingsAmount;
    	return true;
	}
    else{
    	
    	throw new Exception("insufficient funds");
    }

}

public double total(){
	double totalAmountInAccount = savingsBalance + checkingBalance;
	
	return totalAmountInAccount;

}
}