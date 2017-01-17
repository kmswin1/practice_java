package bank.service;

import bank.dao.BankDAO;
import bank.dto.BankDTO;

public class BankService {
	public BankService(){
		
	}

	public void deposit(String name1, int money1) {
		BankDAO dao = new BankDAO();
		BankDTO dto = dao.deposit(name1);
		if(dto.getName().equals(name1)){
			dto.setBalance(dto.getBalance()+money1);
			System.out.println(name1+"님의 잔액 : "+dto.getBalance());
		}		
	}

	public void withdraw(String name2, int money2) {
		BankDAO dao = new BankDAO();
		BankDTO dto = dao.deposit(name2);
		if(dto.getName().equals(name2)){
			if(dto.getBalance()>money2){
			dto.setBalance(dto.getBalance()-money2);
			System.out.println(name2+"님의 잔액 : "+dto.getBalance());
			}
			else{
				System.out.println("잔액부족!!");
			}
		}						
	}

}
