package bank2.controller;

import java.util.HashMap;
import java.util.Scanner;

import bank2.dto.BankDTO;
import bank2.service.BankService;

public class BankController {
	
	public BankController() {
		Scanner sc = new Scanner(System.in);
		String menu = null;
		do{
			System.out.println("=== 은행시스템입니다. ===");
			System.out.println("1.입금업무");
			System.out.println("2.출금업무");
			System.out.println("3.이체업무");
			System.out.println("4.종료");
			menu = sc.nextLine();
			if(menu.equals("1")){
				BankDTO dto = new BankDTO();
				System.out.println("입금할 사람의 이름을 입력하세요:");
				dto.setName(sc.nextLine());
				System.out.println("입금할 금액을 입력하세요:");
				dto.setBalance(sc.nextInt());
				sc.nextLine();
				BankService service = new BankService();
				dto = service.deposit(dto);
				System.out.println(dto.getName()+"님의잔액은 "
				+dto.getBalance()+" 입니다.");
								
			}
			else if(menu.equals("2")){
				BankDTO dto = new BankDTO();
				System.out.println("출금할 사람의 이름을 입력하세요:");
				dto.setName(sc.nextLine());
				System.out.println("출금할 금액을 입력하세요:");
				dto.setBalance(sc.nextInt());
				sc.nextLine();
				BankService service = new BankService();
				dto = service.withdraw(dto);
				System.out.println(dto.getName()+"님의잔액은 "
				+dto.getBalance()+" 입니다.");
				
			}
			else if(menu.equals("3")){
				BankDTO depositDto = new BankDTO();
				BankDTO withdrawDto = new BankDTO();
				System.out.println("입금할 사람의 이름을 입력하세요:");
				depositDto.setName(sc.nextLine());
				System.out.println("출금할 사람의 이름을 입력하세요:");
				withdrawDto.setName(sc.nextLine());
				System.out.println("이체할 금액을 입력하세요:");
				int money = sc.nextInt();
				depositDto.setBalance(money);
				withdrawDto.setBalance(money);
				sc.nextLine();
				BankService service = new BankService();
				HashMap<String, BankDTO> map = 
						service.transfer(depositDto,withdrawDto);
				depositDto = map.get("deposit");
				withdrawDto = map.get("withdraw");
				System.out.println("출금자 : "+withdrawDto.getName()+"출금액 :"
				+withdrawDto.getBalance()+" 입니다.");
			}
			else if(menu.equals("4")){
				System.out.println("프로그램 종료!!!");
			}
		}while(!menu.equals("4"));
	}
}
