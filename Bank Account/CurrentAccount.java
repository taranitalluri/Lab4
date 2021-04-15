package DAY5;

public class CurrentAccount extends BankAccount{

	private float overDraftLimit;
	private boolean status;
	
	
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(float overDraftLimit, boolean status) {
		super();
		this.overDraftLimit = overDraftLimit;
		this.status = status;
	}

	public float getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(float overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	
	public double doWithdrawal(int amount){
		if(balance-amount < overDraftLimit) {
			setStatus(false);
		} else {
			setStatus(true);
			balance-=amount;
		}
		return balance; // new balance
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
