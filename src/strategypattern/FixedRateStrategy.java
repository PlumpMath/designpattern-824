package strategypattern;

public class FixedRateStrategy implements Strategy {

	@Override
	public int calcInterest(Account acc) {
		return (int) (acc.getBalance()*0.1);
	}

}