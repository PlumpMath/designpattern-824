package factorymethod;
/**
 * 인스턴스의 생성을 템플릿 메소드 패턴으로 구성
 *  
 */
public abstract class Factory {
	
	//template metohd pattern 과 동일
	public final Product create(String owner){
		Product p = createProduct(owner);
		registerProudct(p);
		return p;
	}
	
	protected abstract Product createProduct(String owner);
	protected abstract void registerProudct(Product p);
}
