package com.javaroast.jvx440.exam.entity;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String>{
	
}

/*
 * T: 어떤 Repository와 관계가 있는가 - Book
 * ID: Book Entity의 PK는 뭔가? type을 작성한다 - String 
*/