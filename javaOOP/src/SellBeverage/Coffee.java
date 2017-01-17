package SellBeverage;

import java.util.Scanner;

public class Coffee extends Beverage{
	public int amount;
	public int money;
	public Coffee(){
		
	}
	public void calcPrice(){
		int k = 1;
		while(k!=0)
		{
		System.out.println("1.Americano");
		System.out.println("2.Caffe latte");
		System.out.println("3.Cappuccino");
		System.out.println("4.quit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n){
		case 1: setName("Americano");
		setPrice(1500);
		super.print();
		amount+=1;
		money+=1500;
		break;
		case 2: setName("Caffe latte");
		setPrice(2500);
		super.print();
		amount+=1;
		money+=2500;
		break;
		case 3: setName("Cappuccino");
		setPrice(3000);
		super.print();
		amount+=1;
		money+=3000;
		break;
		case 4: k = 0;
		break;
		default : System.out.println("Error!!");
		}
		}
		}
}
