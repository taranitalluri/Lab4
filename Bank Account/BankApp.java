package DAY5;

public class BankApp {
	public static void main(String[] args) {
		Person p1=new Person();
		BankAccount b1=new BankAccount();
		p1.setName("smith");
		b1.setBalance(2000);
		b1.doDeposit(2000);
		System.out.println(p1.getName()+" balance is "+b1.getBalance());
		
		Person p2=new Person();
		BankAccount b2=new BankAccount();
		p2.setName("Kathy");
		b2.setBalance(3000);
		b2.doWithdrawal(2000);
		if(b2.getStatus()) {
			System.out.println(p2.getName()+" balance is "+b2.getBalance());
		}else {
			System.out.print(p2.getName()+" cannot withdraw. ");
			System.out.println("Balance is "+b2.getBalance());
		}
		
		System.out.println("---------------");
		SavingsAccount s1=new SavingsAccount();
		s1.setBalance(1500);
		s1.doDeposit(10000);
		s1.doWithdrawal(50000);
		if(s1.getStatus()) {
			System.out.println(s1.getAccNum()+" has balance "+s1.getBalance());
		}else {
			System.out.println(s1.getAccNum()+" cannot withdraw.\nBalance is "+s1.getBalance());
		}

		
		System.out.println("-------------------");
		
		CurrentAccount c1 = new CurrentAccount();
		c1.setBalance(3000);
		c1.setOverDraftLimit(1500);
		c1.doDeposit(2000);
		c1.doWithdrawal(2500);
		if(c1.getStatus()) {
			System.out.println(c1.getAccNum()+" has balance "+c1.getBalance());
		}else {
			System.out.println(c1.getAccNum() + " cannot withdraw.\nBalance is "+c1.getBalance());
		}
		
		
	}
}
