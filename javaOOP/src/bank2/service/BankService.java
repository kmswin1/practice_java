package bank2.service;

import java.util.HashMap;

import bank2.dao.BankDAO;
import bank2.dto.BankDTO;

public class BankService {
	public BankService() {
	}

	public BankDTO deposit(BankDTO dto) {
		// 로직처리
		// DB처리
		BankDAO dao = new BankDAO();
		BankDTO result = dao.select(dto);
		if(result!=null){
			dto = dao.updateDeposit(dto);
		}
		else{
			
		}
		return dto;
	}

	public BankDTO withdraw(BankDTO dto) {
		BankDAO dao = new BankDAO();
		BankDTO result = dao.select(dto);
		if((result!=null)&&(result.getBalance()>=dto.getBalance())){
			dto = dao.updateWithdraw(dto);
		}
		else{
			
		}
		return dto;
	}

	public HashMap<String, BankDTO> transfer(BankDTO depositDto, BankDTO withdrawDto) {
		HashMap<String,BankDTO> result = new HashMap<String,BankDTO>();
		result.put("deposit",deposit(depositDto));
		result.put("withdraw", withdraw(withdrawDto));
		return result;
	}
}
