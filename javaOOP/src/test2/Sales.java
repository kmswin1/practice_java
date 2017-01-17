package test2;

public class Sales extends Employee implements Bonus {
	

	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}

	public double tax() {
		return getSalary()*0.13;
	}
	
	public void incentive(int pay) {
		setSalary(getSalary()+(int)(pay*1.2));

	}

}
