package university;

public class Human {
	private String name;
	public int age;
	
public Human() {
	
	}
public void print(){
	System.out.println("여기는 Human 이에요");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

}
