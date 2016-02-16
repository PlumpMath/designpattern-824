package templatemethod;

public class Main {
	public static void main(String[] args){
		AbstractDisplay a1 = new CharDisplay('H');
		AbstractDisplay a2 = new StringDisplay("Hello World!");
		AbstractDisplay a3 = new StringDisplay("안녕하세요!");
		
		a1.display();
		a2.display();
		a3.display();
	}
}
