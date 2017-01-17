package university;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human a = new Human();
		Student b = new Student();
		Human c = new Student();
		b.setMajority("컴퓨터");
		b.setName("김민상");
		System.out.println(b.getName());
		b.print();
		System.out.println(b.age);
	}
}