public class BankAccountTest{
	public static void main(String[] args){
         BankAccount account1 = new BankAccount();

         account1.depositChecking(100);
         account1.depositSavings(100);
         System.out.println(account1.getCheckingBalance());
         System.out.println(account1.total());
         System.out.println(account1.getAccountNumber());
	}

}