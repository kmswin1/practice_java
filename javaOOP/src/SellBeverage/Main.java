package SellBeverage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		int k = 1;
		while(k!=0)
		{
		System.out.println("1.커피, 2.차, 3.주문완료");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1)
			coffee.calcPrice();
		else if(n==2)
			tea.calcPrice();
		else if(n==3)
			k = 0;
		else
			System.out.println("Error!!");
		}
		
		System.out.println("Tea 판매량: "+tea.amount);
		System.out.println("Coffee 판매량:"+coffee.amount);
		System.out.println("총 판매금액 : "+(coffee.money+tea.money));
	}

}
