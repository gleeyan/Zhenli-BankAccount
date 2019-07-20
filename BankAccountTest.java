public class BankAccountTest{
	public static void main(String[] args){
         BankAccount account1 = new BankAccount();
         BankAccount account2 = new BankAccount();

         account1.depositChecking(100);
         account1.depositSavings(100);
         try {
         boolean sucesss = account1.withdrawChecking(100);
         if (sucesss){
         	account2.depositChecking(100);
         }
         }
         catch(Exception e){
            System.out.println(e.getMessage());
         }
         try {
            account1.withdrawChecking(100);
         } catch(Exception e){
            System.out.println(e.getMessage());
         }
         System.out.println(account1.getCheckingBalance());
         System.out.println(account1.total());
         System.out.println(account1.getAccountNumber());
         try {
         	account1.withdrawSavings(5000);
         	account2.depositSavings(50);
         } catch(Exception e){
            System.out.println(e.getMessage());
         }

	}

}