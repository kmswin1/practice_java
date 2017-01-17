package javaOOP;

public class Car {
    // 값 - 변수로 묘사 - field
	// 행동 - 함수로 묘사 - method
	// 생성자 - construct (마치 method 처럼 생겼어요)
	
	private int fuel;  // static field
	                  // class member
	
	public int speed; // field
	           // instance member
	
	// constructor ( instance 를 만드는게 목적)
	// 생성자는 이름이 반드시 클래스 이름과 같아야 해요!
	// 리턴타입이 존재하지 않아요!! 생성자는 메소드가 아님!!
	public Car(){
		
	} // 아무것도 안치면 javac 컴파일러가 저절로 default 생성자 호출!!
	  // default 생성자 : 아무 입력값과 행동이 없는 생성자(constructor)
	
	public Car(int n){
		
	} 
	
	public void reFuel(int k){
		if(k<0){
			System.out.println("말도 안돼요!!");
		}
		fuel += k;
	}

	/**
	 * @return the fuel
	 */
	public int getFuel() {
		return fuel;
	}

	/**
	 * @param fuel the fuel to set
	 */
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
}
