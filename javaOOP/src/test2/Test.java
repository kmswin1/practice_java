package test2;

// interface 의 형태
// 이런 interface를 도대체 왜 사용하나요?
public interface Test {
	String name = "홍길동";
	int age = 20;
	void printInfo();
}

// java 는 단일 상속만 지원한다
interface MyInterface extends Test{
	
}
// java 는 다중 구현은 지원한다
// class MyClass implements Test , Test2, ...
class MyClass implements Test{

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}
	
}