package com.javaroast.jvx440.engman.partners.domain.Partner;

import com.javaroast.jvx440.engman.common.domain.Address.Address;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "partner")
@Table(name = "Partner")
@Getter
@Setter
@ToString(of = {"name", "crn", "partnerType", "phone", "homePage", "status", "repName", "regDate", "updateDate"})
public class Partner {
	private String name;		// 업체명
	private String crn;			// 사업자 등록번호
	private String partnerType;	// 1 학원 2 학교
	private String phone;		// 연락처
	private String homePage;	// 홈페이지
	private String status;		// 상태
	private String repName;		// 대표자명
	private String regDate;		// 등록날짜
	private String updateDate;	// 수정날짜
	
	private Address address;	// 주소
}
