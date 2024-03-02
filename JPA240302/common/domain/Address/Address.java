package com.javaroast.jvx440.engman.common.domain.Address;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "address")
@Table(name = "Address")
@Getter
@Setter
@ToString(of = {"district", "address1", "address2", "postalCode", "regDate", "updateDate"})
public class Address {
	private String district;			// 지역
	private String address1;			// 주소1
	private String address2;			// 주소2
	private String postalCode;			// 우편번호
	private String regDate;				// 등록날짜
	private String updateDate;			// 수정날짜
	
}
