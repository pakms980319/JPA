package com.javaroast.jvx440.engman.member.domain;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 해당 이름 그대로 테이블을 만들거면 Table Annotation이 필요없다

@Entity
@Getter
@Setter
@ToString(of = {"id", "email", "alias", "phone", "memberRole"})
public class EngmanMember {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String email;
	
	@Column(updatable = false)
	private String passwd;
	
	private String alias;				// 별칭
	private String imagePath;			// 프로필 이미지
	
	@Enumerated(EnumType.STRING)		// 컬럼에 문자열로 값 지정
	private MemberRole memberRole;		// 사용자 role
	
	private String name;
	private String phone;
	private char sex = 'x';
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy")
	private Date birthDate;
	
	@Column(updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@CreationTimestamp  // insert 시 자동으로 날짜 등록
	private Date regDate;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@UpdateTimestamp  // update시 자동으로 변경
	private Date updateDate;
}
