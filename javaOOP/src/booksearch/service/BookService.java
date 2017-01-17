package booksearch.service;

import java.util.ArrayList;

import booksearch.dao.BookDAO;
import booksearch.dto.BookDTO;

public class BookService {

	public ArrayList<BookDTO> findBookByKeyword(String keyword) {
		// 일반로직은 service에서 구현을 한다.
		// database 처리는 service에서 직접 구현하지 않는다.
		// database 처리는 DAO를 이용해서 처리
		BookDAO dao = new BookDAO();
		return dao.select(keyword);
	}

	public boolean deleteByNumber(String bookNum) {
		BookDAO dao = new BookDAO();
		return dao.delete(bookNum);
	}
}
