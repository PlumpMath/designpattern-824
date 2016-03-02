package strategypattern;
/**
 * 디자인 패턴중 가장 많이 사용되는 패턴 중 하나
 * 예금 계좌 존재. 예금해서 이자가 늘어나는 방법이 고객의 수준에 따라 달라질 수가 있다.
 * 그래서 클래스별로 나눠서 방법을 다르게 해준다. 그런데 만약 다른 개발자가 와서 새로운 이자방법을 추가하려한다.
 * 이때 모든코드를 다 살펴보지 않고, 조금만 추가해 주기위해 Strategy Pattern을 사용한다.
 * 
 * 컨텍스트(UserDao)를 사용하는 클라이언트(UserDaoTest)는 컨테스트가 사용할 전략(ConnectionMaker 를 구현한 클래스, 예를 들어 DConnectionMaker)을
 * 컨텍스트의 생성자 등을 통해 제공해주는 게 일반적
 */
public interface Strategy {
	public int calcInterest(Account acc);
}
