public abstract class Account implements IBaseRate{
	//generate 11 digit account number
	//if it has a savings account generate a safety deposit box
	//if it has a checking account, assign a debit card with 12 digit number and 4 digit PIN
	//List common properties for savings and checking accounts
	private String name;
	private String sSN;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	//Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
//		System.out.println("NAME: " + name);
//		System.out.println("NEW ACCOUNT: " );
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		System.out.println("NAME: " + name + " SSN: " + sSN + " Balance: $" + balance);
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		//System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		setRate();
		
	}
	public abstract void setRate();
	
	
	// List common methods
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
		
	}
	//List common methods - transactions
	public void depsoit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
	}
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transferring $" + amount + " to " + toWhere);
	}
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	public void showInfo() {
		System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber + "\nBALANCE: " + balance);
	}
}
