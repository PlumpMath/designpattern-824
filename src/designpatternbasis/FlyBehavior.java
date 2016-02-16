package designpatternbasis;
//인터페이스를 써서 변하는 부분(날아다님, 소리를 냄)을  Duck 클래스에서 빼서 추상화 시킴
//실제 행동 구현은 이 인터페이스를 구상한 객체에서 구현시킴.
public interface FlyBehavior {
	public void fly();
}
