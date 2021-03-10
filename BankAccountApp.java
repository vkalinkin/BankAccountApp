import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		// Read a CSV file then create new accounts based on that data
		String file = "C:\\Users\\vakal\\Desktop\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			System.out.println("NEW ACCOUNT");
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);		
//			System.out.println(accountHolder[0]);
//			System.out.println(accountHolder[1]);
//			System.out.println(accountHolder[2]);
//			System.out.println(accountHolder[3]);
			if (accountType.equals("Savings")) {
				//System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				//System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println ("ERROR READING ACCOUNT TYPE");
			}
		}

		for (Account acc : accounts) {
			System.out.println("\n**********************");
			acc.showInfo();
		}
		
//		Checking chkacc1 = new Checking("Tom Wilson", "321456789", 1500);
//		Savings savacc1 = new Savings("Rich Lowe", "987654321", 2500);
//		
//		;
//		savacc1.showInfo();
//		System.out.println("----------------");
//		chkacc1.showInfo();
		
//		savacc1.depsoit(5000);
//		savacc1.printBalance();
//		savacc1.withdraw(200);
//		savacc1.printBalance();
//		savacc1.transfer("Brokerage", 3000);
//		savacc1.printBalance();
		
		//savacc1.compound();
	}
}
