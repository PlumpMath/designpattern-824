package factorymethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory{
	
	private List<String> owners = new ArrayList<String>();
	private Map<Integer, String> serialOwnerMap = new HashMap<Integer,String>();
	private int serial = 100;

	//IDCard 인스턴스 생성
	@Override
	protected Product createProduct(String owner) {
		//return new IDCard(owner);
		return new IDCard(owner, serial++);
	}

	@Override
	protected void registerProudct(Product p) {
		IDCard card = (IDCard) p;
		owners.add(card.getOwner());
		serialOwnerMap.put(card.getSerial(), card.getOwner());
	}
	
	public List<String> getOwner(){
		return owners;
	}

	public Map<Integer, String> getSerialOwner(){
		return serialOwnerMap;
	}
}
