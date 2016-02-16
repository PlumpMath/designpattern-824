package templatemethod;
//AbstractClass
//상위클래스에서 처리 뼈대 결정
//중요 알고리즘을 상위클래스에서 정의, 알고리즘이 잘못되면 상위클래스만 수정
public abstract class AbstractDisplay {
	
	protected abstract void open();
	protected abstract void print();
	protected abstract void close();
	public final void display(){
		open();
		for(int i =0; i<5; i++){
			print();
		}
		close();
	}
	

}
