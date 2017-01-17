package booksearch.controller;

import java.util.ArrayList;
import java.util.Scanner;

import booksearch.dto.BookDTO;
import booksearch.service.BookService;

public class BookController {
	public BookController() {
		// 여기서부터 시작
		// 입출력을 담당하는 클래스
		int k = 1;
		// 로직을 처리하는 객체를 생성해서 일을 시켜요
		BookService service = new BookService();
		while(k!=0)
		{
		Scanner sc2 = new Scanner(System.in);
		System.out.println("=====도서관리 프로그램=====");
		System.out.println("1.도서검색,2.도서삭제,3.종료");
		int num = sc2.nextInt();
		switch(num){
		// 도서를 검색!!
		case 1: Scanner sc = new Scanner(System.in);
		System.out.println("도서를 검색합니다. 키워드를 입력하세요 : ");
		String keyword = sc.nextLine();
		ArrayList<BookDTO> list = service.findBookByKeyword(keyword);
		
		// 출력
		for(BookDTO dto : list)
		{
			System.out.println(dto.getBtitle()+", "+dto.getBauthor());
		}
		break;
		//도서 삭제!!
		case 2: System.out.println("도서번호를 입력하세요 :");
		        Scanner sc3 = new Scanner(System.in);
		        String bookNum = sc3.nextLine();
		        boolean result = service.deleteByNumber(bookNum);
		        if(result){
		        	System.out.println("정상적으로 삭제되었습니다.");
		        }
		        else{
		        	System.out.println("Error!!");
		        }
	    //프로그램 종료!!
		case 3: System.out.println("프로그램이 종료되었습니다!!");
		        k=0;
		        break;
		//다시입력하라는 에러메시지!!
		default: System.out.println("Error 다시 입력하세요!");
		         continue;
		}
		}
	}
	
}
