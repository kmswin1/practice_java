package planetest;

public class CargoPlane extends Plane{
	public CargoPlane(){
		
	}
	public CargoPlane(String planeName, int fuelSize){
		super(planeName,fuelSize);
	}
	public void flight(int distance){
		int currentFuel = getFuelSize();
		setFuelSize(currentFuel - (distance*5));
	}

}
