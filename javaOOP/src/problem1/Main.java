package problem1;

public class Main {
	public static void main(String args[]){
		Owner kim = new Owner("김민상","010-4026-4271");
		System.out.println(kim);
		Owner yoo = new Owner("유기태","010-2424-9999");
		System.out.println(yoo);
		Owner park = new Owner("박선우","010-7575-8888");
		System.out.println(park);
		
		if(kim.equals(park))
		{
			System.out.println("같은주인입니다.");
		}
		else
		{
			System.out.println("다른주인입니다.");
		}
	Vehicle v1 = new Vehicle();
	Vehicle v2 = new Vehicle();
	Vehicle v3 = new Vehicle();
	
	v1.setOwner(kim);
	v2.setOwner(yoo);
	v3.setOwner(park);
	v1.setPrice(100000000);
	v2.setPrice(60000000);
	v3.setPrice(70000000);
	
	System.out.println(v1+"\n"+v2+"\n"+v3);
	if(v1.equals(v3))
	{
		System.out.println("같은주인입니다.");
	}
	else
	{
		System.out.println("다른주인입니다.");
	}
	}
}