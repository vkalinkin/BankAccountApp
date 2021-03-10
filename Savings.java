public class Savings extends Account{
	//has deposit(), withdraw(), transfer(), and showInfo()
	// List properties specific to the Savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	// Constructor to initialize settings for the Savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
//		System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
//		System.out.println("NEW SAVINGS ACCOUNT");
		//System.out.println("NAME: " + name);
		
	}
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
		//System.out.println(safetyDepositBoxID);
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Savings Account Features" +
							"\n Safety Deposit Box ID: " + safetyDepositBoxID +
							"\n Safety Depsoit Box Key: " + safetyDepositBoxKey);
	}
	// List any methods specific to savings account

}
