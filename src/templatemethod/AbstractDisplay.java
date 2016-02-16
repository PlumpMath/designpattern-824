package templatemethod;
//AbstractClass
//상위클래스에서 처리 뼈대 결정
public abstract class AbstractDisplay {
	
	protected abstract void open();
	protected abstract void print();
	protected abstract void close();
	public final void display(){
		open();
		for(int i =0; i<5; i++){
			print();
			close();
		}
	}
	

}
