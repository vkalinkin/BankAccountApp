public class Checking extends Account{
	private int debitCardNumber;
	private int debitCardPIN;
	
	public Checking(String name, String sSN, double initDeposit) {
		//has deposit(), withdraw(), transfer(), and showInfo()
		//List properties specific to a Checking account
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
//		System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
//		System.out.println("NEW CHECKING ACCOUNT");
		//System.out.println("NAME: " + name);
		//Constructor to initialize checking account properties
		
		//List any methods specific to the checking account
	}
	@Override
	public void setRate() {
		//System.out.println("Implement rate for Checking");
		rate = getBaseRate() * .15;
	}
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features" + 
						"\n Debit Card Number: " + debitCardNumber +
						"\n Debit Card PIN " + debitCardPIN);
	}
}
