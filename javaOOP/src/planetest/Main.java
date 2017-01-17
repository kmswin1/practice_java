package planetest;

public class Main {
	public static void main(String[] args){
		AirPlane air = new AirPlane("csl",1000);
		CargoPlane cargo = new CargoPlane("asl",1000);
		air.flight(100);
		cargo.flight(100);
		System.out.println(air.getFuelSize());
		System.out.println(cargo.getFuelSize());
		air.refuel(200);
		cargo.refuel(200);
		System.out.println(air.getFuelSize());
		System.out.println(cargo.getFuelSize());
	}

}
