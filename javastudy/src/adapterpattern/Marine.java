package adapterpattern;

public class Marine implements TerranInterface{

	@Override
	public void attack() {
		System.out.println("총을 쏜다!! 따당따당..!!");
	}

	@Override
	public void move() {
		System.out.println("열심히 뛰어갑니다.");
		
	}
	
}
