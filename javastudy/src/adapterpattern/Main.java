package adapterpattern;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<TerranInterface> unit = 
				new ArrayList<TerranInterface>();
		unit.add(new Marine());
		unit.add(new Marine());
		unit.add(new Marine());
		unit.add(new Tank());
		unit.add(new MedicAdapter(new Medic()));
		for(TerranInterface e : unit){
			e.move();
		}
		for(TerranInterface e : unit){
			e.attack();
			System.out.println("수정할꺼에요");
		}
	}

}