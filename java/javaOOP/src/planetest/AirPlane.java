package planetest;

public class AirPlane extends Plane {
	public AirPlane(){
		
	}
	public AirPlane(String planeName, int fuelSize){
		super(planeName, fuelSize);
	}
	public void flight(int distance){
		int currentFuel = getFuelSize();
		setFuelSize(currentFuel - (distance*3));
	}
}
