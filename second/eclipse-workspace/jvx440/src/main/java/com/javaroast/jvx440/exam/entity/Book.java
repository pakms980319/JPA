package com.javaroast.jvx440.exam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Book")
@Getter
@Setter
public class Book {
	@Id
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="title")
	private String title;
	
	@Column(name="price")
	private int price;
	
	@Column(name="author")
	private String author;
	
	@Column(name="press")
	private String press;
}
/*
 * 테이블 이름과 클래스 이름이 같다면 name을 작성안해도 된다.
 * 자바의 기본 명명 규칙은 카멜 방식 (BookDetail ...)
 * 테이블의 명명 규칙은 정해진게 없다
 * 테이블은 카멜로 작성해도 다 대문자로 바뀔수있다 (DBMS마다 다르다)
 * 그래서 테이블은 (Book_detail) 이런식으로 명명한다
 * 이럴때 Table 어노테이션을 사용하여 name을 지정해준다
 * 
 *  
 *  @Id() 어노테이션
 *  @Column() 어노테이션
 *  
 *  변수명과 컬럼명이 같다면 어노테이션을 따로 작성해주지 않아도 된다.
 *  
 *  테이블이 없다면 JPA가 동적으로 테이블을 만들어준다
 *  하지만 실제로는 그렇게 만들지 마라
 *  
*/
