package DAY5;


public class SavingsAccount extends BankAccount{


	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}


	final float minBalance = 1000;


	public float getMinBalance() {
		return minBalance;
	}


	public double doWithdrawal(int amount){
		if(balance-amount < minBalance) {
			setStatus(false);
		} else {
			setStatus(true);
			balance-=amount;
		}
		return balance; // new balance
	}

}
