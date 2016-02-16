package designpatternbasis;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("날수가 없음");
	}

}
