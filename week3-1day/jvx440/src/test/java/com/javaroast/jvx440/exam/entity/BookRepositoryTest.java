package com.javaroast.jvx440.exam.entity;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;

import com.javaroast.jvx440.RoastTest;

import jakarta.transaction.Transactional;

public class BookRepositoryTest extends RoastTest{
	@Autowired
	private BookRepository bookRepository;
	
	@Test
	@Transactional
	@Commit
	public void save() {
		Book book = new Book();
		
		book.setIsbn("12345-6789");
		book.setTitle("Spring JPA");
		book.setPrice(25000);
		book.setPress("코리아 출판");
		book.setAuthor("유비");
		
		bookRepository.save(book);
		
		
		book = new Book();
		
		book.setIsbn("23456-7890");
		book.setTitle("Spring Web MVC");
		book.setPrice(35000);
		book.setPress("아시아나 출판");
		book.setAuthor("관우");
		
		bookRepository.save(book);
	}
	
	@Test
	public void findAll() {
		List<Book> bookList = (List<Book>)bookRepository.findAll();
		for (Book book : bookList) {
			System.out.println(book);
		}
	}
}
