package templatemethod;
//ConCreteClass
//상위클래스에서 정의한 메소드를 구체적으로 구현
public class StringDisplay extends AbstractDisplay{

	private String str;
	private int width;
	
	
	public StringDisplay(String str) {
		this.str = str;
		this.width = str.getBytes().length;
		this.width = str.length();
	}

	@Override
	protected void open() {
		printLine();
	}

	@Override
	protected void print() {
		System.out.println("l" + this.str + "l");
	}

	@Override
	protected void close() {
		printLine();
	}
	
	public void printLine(){
		System.out.print("+");
		for(int i=0; i<width; i++){
			System.out.print("-");
		}
		System.out.println("+");
	}

}
