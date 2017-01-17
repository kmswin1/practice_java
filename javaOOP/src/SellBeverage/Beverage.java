package SellBeverage;

abstract public class Beverage {
	private String name;
	private int price;
	public Beverage(){
	}
	abstract void calcPrice();
	public void print(){
		System.out.println("음료는 "+name+"이고,가격은 "+price+"입니다.\n");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
