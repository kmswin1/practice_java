package test;

public class Car {
	//field
	private String owner;
	private int fuel;
	private int speed;
	
	//constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//method
	
	public String toString(){
		return "Car Instance 입니다.";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car)
		{
			Car tmp = (Car)obj;
			if(this.owner.equals(tmp.owner))
				return true;
			else
				return false;
		}
		else
		{
			return false;
		}
	}
	
}
