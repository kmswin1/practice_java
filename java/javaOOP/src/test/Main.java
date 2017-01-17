package test;

public class Main {
	public static void main(String[] args) {
		
		// Car class 의 instance 생성
		Car car1 = new Car();
		car1.setOwner("김민상");
		Car car2 = new Car();
		car2.setOwner("김민상");
		// 기본적으로 상속받는 equals()의 기능은 "=="와 같아요
		if(car1.equals(car2))
			System.out.println("같아요!!");
		else
			System.out.println("달라요!!");
		
		//String은 굉장히 특이한 class
		//String은 기본 data type 아니다.
		String a = new String("안녕하세요");
		//문자열은 프로그램에서 아주 빈번하게 사용이 되니까 좀 편하게 써 보아요
		String b = "소리없는 아우성";
		//그러면 new 해서 만드는 String과 = 해서 만드는 String은 같은건가요?? -> 다르다!!!
		
		int c = 10;
		int d[] = new int[5]; //java에서 배열을 사용하는 방법
		                      //가능하면 배열보다는 collection 이용
	}
}
