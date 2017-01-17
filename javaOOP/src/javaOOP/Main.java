package javaOOP;

import java.util.Scanner;

public class Main { // method area 메모리에 올라감
     // field , method
	
	 // program의 entry point 역할을 하는 특수한 method가
	 // 존재 => main method (항상 똑같은 형태로 사용)
	public static void main(String[] args){
		System.out.println("1.잔액조회,2.입금,3.출금");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a){
		case 1: System.out.println("현재 잔액조회 정보입니다:");
	    Account kms = new Account("김민상","232-1234-4545",30000,0);
	    kms.moneyInfo();
	    break;
		case 2: System.out.println("입금금액을 입력하세요:");
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt();
	    Account kms2 = new Account("김민상","232-1234-4545",30000,b);
	    kms2.deposit();
		kms2.moneyInfo();
		break;
		case 3: System.out.println("출금금액을 입력하세요:");
		Scanner sc3 = new Scanner(System.in);
		int c = sc3.nextInt();
	    Account kms3 = new Account("김민상","232-1234-4545",30000,c);
	    kms3.withdraw();
		kms3.moneyInfo();
		break;
		default : System.out.println("입력 오류입니다. 다시시도해 주세요");
		}
	}
}
