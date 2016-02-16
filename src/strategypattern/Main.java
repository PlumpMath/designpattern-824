package strategypattern;

public class Main {
	public static void main(String[] args){
		Account acc1 = new Account(new FixedRateStrategy(), 5);
		acc1.deposit(1000000);
		acc1.calcInterest();
		acc1.showBalance();
		Account acc2 = new Account(new VariableRateStrategy(), 5);
		acc2.deposit(1000000);
		acc2.calcInterest();
		acc2.showBalance();
	}
}
