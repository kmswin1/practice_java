package problem1;

public class Vehicle{
	private Owner owner;
	private int price;
	public Vehicle(){
		
	}
	public Vehicle(String string,String string2, int i){
		owner = new Owner(string,string2);
		price = i;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Vehicle)
		{
			Vehicle tmp = (Vehicle)obj;
			if(this.owner.equals(tmp.owner))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	public String toString()
	{
		return owner.toString()+"차량 가격은 "+this.price+" 입니다.";
	}
}
