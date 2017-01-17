package javaOOP;

public abstract class MyTest {
	//field
	//constructor
	//method
	
	//method 의 정의
	public void print2(){
		System.out.println("안녕하세요!!");
	}
	
	//method 의 선언
	//abstract method
	//이런 추상 메소드는 반드시 abstract keyword 명시
	//이런 메소드가 1개라도 존재하면 class는 abstract class 이다.
	public abstract void print();
}

class A extends MyTest{
	public void print()
	{
		System.out.println("오버라이딩 하여 사용하여야한다!!!");
	}
}
