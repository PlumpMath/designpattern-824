package designpatternbasis;

public class Main {
	public static void main(String[] args){
		Duck testDuck = new MadDuck();
		testDuck.performFly();
		
		//동적으로 행동지정
		testDuck.setFlyBehavior(new FlyNoWay());
		testDuck.performFly();
	}
}
