package templatemethod;
//ConCreteClass
//상위클래스에서 정의한 메소드를 구체적으로 구현
public class CharDisplay extends AbstractDisplay{
	private char ch;
	
	public CharDisplay(char ch) {
		this.ch = ch;
	}
	
	@Override
	protected void open() {
		System.out.print("<<");
	}

	@Override
	protected void print() {
		System.out.print(ch);
	}

	@Override
	protected void close() {
		System.out.println(">>");
	}

}
