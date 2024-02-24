package com.javaroast.jvx440.exam.value.domain;

import jakarta.persistence.Column;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "ExamUser")
@SecondaryTable(
	name = "ExamAddress",  // 저장할 테이블명
	pkJoinColumns = @PrimaryKeyJoinColumn(
			name = "userId",  // ExamAdress에서 ExamUser와 관련된 정보를 저장할 컬럼명
			referencedColumnName = "id"  // 부모 엔티티 식별자 컬럼명
		)
	)
public class ExamUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String email;
	private String passwd;
	private String name;
	private String phone;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(  // 속성과 (테이블과 컬럼)의 매핑 정보를 정의
				name = "address1",  // 속성 지정
				column = @Column(name="address1", table="ExamAddress")),  // 테이블과 컬럼 지정
		@AttributeOverride(
				name = "address2",
				column = @Column(name="address2", table="ExamAddress")),
		@AttributeOverride(
				name = "postalCode",
				column = @Column(name="postalCode", table="ExamAddress"))
	})
	private ExamAddress addr;
}
