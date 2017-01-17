package university;

public class Student extends Human{
	private String majority;
	
	// 기본생성자는 사용하던 사용하지 않던 반드시 작성해주세요.
	
	public Student(int k){
		this(); // 클래스내 다른 생성자 호출
	}
	// 생성자도 overloading 이 가능하다.
	public Student(){
		
		// 상위 클래스가 존재한다.
		// 상위 클래스의 instance를 먼저 만들어야 한다.
		super(); //상위 클래스 생성자 호출 keyword
		// super keyword 가 존재하지 않으면 javac compiler가 자동으로 추가.
	}
    // method overriding
	// overriding 된 method는 상위클래스를 호출해도 무조건 overriding 된 method 가 호출된다.
	// Dynamic binding(동적 바인딩)
	public void print(){
    	System.out.println("여기는 Student 에요");
    	super.print(); // 상위 클래스를 가리키는 keyword
    	this.age = 20; // 현재 클래스를 가리키는 keyword
    }
	public String getMajority() {
		return majority;
	}

	public void setMajority(String majority) {
		this.majority = majority;
	}
	
	
}
