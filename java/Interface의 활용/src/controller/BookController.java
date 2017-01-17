package controller;

import java.util.ArrayList;

import dto.BookDTO;
import service.BookService;

public class BookController {

	public BookController() {
		// 입력
		String keyword = "java";
				
		BookService service = new BookService();
		
		// 책 검색
		ArrayList<BookDTO> list = 
				service.findBookByKeyword(keyword);
		for(BookDTO dto : list) {
			System.out.println("책 제목 : " + dto.getBtitle());
		}
		
		// 책 입력
		BookDTO dto = new BookDTO();
		dto.setBtitle("레 미제라블");		
		boolean result = service.bookRegister(dto);
		if(result) {
			System.out.println("정상등록");
		} else {
			System.out.println("먼가이상해요!!");
		}
	}
}
