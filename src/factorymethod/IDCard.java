package factorymethod;

public class IDCard extends Product{
	
	private String owner;
	private int serial = 0;
	
	IDCard(String owner, int serial){
		System.out.println(owner +"s "+serial + "card created");
		this.owner = owner;
		this.serial = serial;
	}
	
	IDCard(String owner){
		System.out.println(owner +"s card created.");
	}
	
	@Override
	public void use() {
		System.out.println(owner + "s "+serial + "used");
	}
	
	public String getOwner(){
		return owner;
	}
	
	public int getSerial(){
		return serial;
	}

}
