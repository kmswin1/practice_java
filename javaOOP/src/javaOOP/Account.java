package javaOOP;

public class Account {
	private String acName;
	private String acNum;
	private int acMoney;
	private int nowMoney;
	private int money;
	public Account(String acName,String acNum,int acMoney,int money){
		this.acName = acName;
		this.acNum = acNum;
		this.acMoney = acMoney;
		this.money = money;
		this.nowMoney +=acMoney;
	}
	public void deposit(){
	nowMoney = acMoney+money;
	}
	public void withdraw(){
	nowMoney = acMoney-money;
	}
	public void moneyInfo()
	{
		System.out.println("계좌번호:"+acNum);
		System.out.println("계좌명의:"+acName);
		System.out.println("현 잔액은 :"+nowMoney+"입니다.");
	}
}
