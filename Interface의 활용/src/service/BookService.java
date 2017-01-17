package service;

import java.util.ArrayList;

import dao.BookDAO;
import dao.NaverBookDAO;
import dto.BookDTO;

public class BookService {

	public ArrayList<BookDTO> findBookByKeyword(String keyword) {

		NaverBookDAO ndao = new NaverBookDAO();
		BookDAO dao = new BookDAO(ndao);
		ArrayList<BookDTO> list = dao.select(keyword);
		return list;
	}
	
	public boolean bookRegister(BookDTO dto) {

		NaverBookDAO ndao = new NaverBookDAO();
		BookDAO dao = new BookDAO(ndao);
		boolean result = dao.insert(dto);
		return result;
	}
	

}
