package com.javaroast.jvx440.exam.value.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable  // 이 클래스가 다른 엔티티의 일부로 함께 저장될 수 있다.
public class ExamAddress1 {
	private String address1;
	private String address2;
	private String postalCode;
	
	public ExamAddress1() {
		super();
	}

	public ExamAddress1(String address1, String address2, String postalCode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.postalCode = postalCode;
	}
}
