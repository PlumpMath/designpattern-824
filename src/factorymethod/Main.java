package factorymethod;

public class Main {

	public static void main(String[] args){
		
		Factory factory = new IDCardFactory();
		Product p1 = factory.create("ksh");
		Product p2 = factory.create("cjh");
		Product p3 = factory.create("kwh");
		
		p1.use();
		p2.use();
		p3.use();
		
	}
}
