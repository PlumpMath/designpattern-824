package strategypattern;

public class VariableRateStrategy implements Strategy {

	@Override
	public int calcInterest(Account acc) {
		return (int)(acc.getBalance()*(0.01+0.001*acc.getLevel()));
	}

}
