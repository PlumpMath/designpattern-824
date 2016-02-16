package strategypattern;

public class Account {
	//잔고 balance
	private int balance = 0;
	private int clientLevel;
	private Strategy strategy;
	
	Account(Strategy s, int level){
		strategy = s;
		clientLevel = level;
	}
	
	public void calcInterest(){
		balance = strategy.calcInterest(this);
	}
	public void deposit(int i){
		balance += i;
	}
	public void showBalance(){
		System.out.println("# : "+balance);
	}
	public int getBalance(){
		return balance;
	}
	public int getLevel(){
		return clientLevel;
	}
}