package designpatternbasis;
//Duck 클래스 날으는 행동을 직접 처리 안하고 flyBehavior 를 참조하는 객체(인터페이스를 구현한 클래스)에 그 행동을 위임
public abstract class Duck {
	//변하는 부분 인터페이스 이용하여 빼서 추상화
	FlyBehavior flyBehavior;
	
	public void performFly(){
		flyBehavior.fly();                           
	}
	
	//동적으로 행동 지정할수 있게(구현된 객체에 따라 나는 행동이 달라짐)
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
}
