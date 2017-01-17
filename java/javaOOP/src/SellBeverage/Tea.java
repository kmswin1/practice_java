package SellBeverage;

import java.util.Scanner;

public class Tea extends Beverage {
	public int amount;
	public int money;
	public Tea(){
		
	}
	public void calcPrice(){
		int k = 1;
		while(k!=0)
		{
		System.out.println("1.Lemon Tea");
		System.out.println("2.Jasmine Tea");
		System.out.println("3.Black Tea");
		System.out.println("4.quit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n){
		case 1: setName("Lemon Tea");
		setPrice(1500);
		super.print();
		amount+=1;
		money+=1500;
		break;
		case 2: setName("Jasmine Tea");
		setPrice(2000);
		super.print();
		amount+=1;
		money+=2000;
		break;
		case 3: setName("Black Tea");
		setPrice(2500);
		super.print();
		amount+=1;
		money+=2500;
		break;
		case 4: k = 0;
		break;
		default : System.out.println("Error!!");
		}
		}
		}
}
