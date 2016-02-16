package designpatternbasis;

public class MadDuck extends Duck{
	//상속받은 인터페이스 변수에 원하는 구현 클래스(해당 인터페이스를 구현한) 할당
	public MadDuck(){
		flyBehavior = new FlywithWings();
	}
}
