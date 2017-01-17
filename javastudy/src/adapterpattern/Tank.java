package adapterpattern;

public class Tank implements TerranInterface{

	@Override
	public void attack() {
		System.out.println("퉁퉁포를쏜다!");
		
	}

	@Override
	public void move() {
		System.out.println("탱크가 움직인다.. 느리다!!");
		
	}
	

}
