package bank.controller;

import java.util.Scanner;

import bank.service.BankService;

public class BankController {
	public BankController() {

		int k = 1;
		while(k!=0){
			System.out.println("1.입금업무 2.출금업무 3.이체업무 4.종료");
			Scanner sc = new Scanner(System.in);
			String n = sc.nextLine();
			BankService service = new BankService();
			if(n.equals("1")){
				System.out.println("입금할 사람의 이름을 입력하세요.");
					String name1 = sc.nextLine();
					System.out.println("얼마를 입금하시겠습니까?");
					Scanner sc2 = new Scanner(System.in);
					int money1 = sc2.nextInt();
					service.deposit(name1,money1);
					continue;
			}
			else if(n.equals("2")){
				System.out.println("출금할 사람의 이름을 입력하세요");
					Scanner b1 = new Scanner(System.in);
					String name2 = b1.nextLine();
					System.out.println("얼마를 출금하시겠습니까?");
					Scanner b2 = new Scanner(System.in);
					int money2 = b2.nextInt();
					service.withdraw(name2,money2);
					continue;
			}
			else if(n.equals("3")) {
				System.out.println("얼마를 이체하시겠습니까?");
				continue;
			}
			else if(n.equals("4")){
				System.out.println("종료되었습니다.");
			        k=0;
			        continue;
			}
			else{
				System.out.println("Error! 다시 입력하세요");
			   		continue;
			}
		}
	}
}
