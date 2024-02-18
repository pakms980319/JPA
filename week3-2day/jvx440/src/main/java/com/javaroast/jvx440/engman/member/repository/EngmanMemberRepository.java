package com.javaroast.jvx440.engman.member.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaroast.jvx440.engman.member.domain.EngmanMember;
import com.javaroast.jvx440.engman.member.domain.MemberRole;

/*
 * 쿼리 메소드 (Query Method)
 * -. 메소드의 이름 자체가 쿼리의 구문으로 처리되는 구문
 * -. https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
 * 
 * @Query 어노테이션
 * -. SQL과 유사하게 엔티티 클래스의 정보를 이용하여 쿼리를 작성하는 기능
 * -. JPQL
 * 
 * Querydsl
 * -. 동적 쿼리가 필요한 경우 ( 예: 검색조건과 같은 경우의 수가 많은 경우 )
 * Q도메인 클래스를 이용
 */

@Repository
public interface EngmanMemberRepository extends CrudRepository<EngmanMember, Long>{
	
	@Query("SELECT m From EngmanMember m WHERE m.email = ?1")  // @Query 어노테이션 m은 대상이 되는 엔티티, 여기서는 as 생략, email은 칼럼명이 아닌 속성명이다. ?1는 뒤에 들어갈 인자이다. 순서대로 ?1 ?2 ?3 ...
	Optional<EngmanMember> findByEmail(String email);  // 한건만 결과가 나온다, 쿼리 메소드이다. email=? 에 대한 쿼리 진행, 잘 사용하지 않는 방법이다.
	
	@Modifying  // update는 무조건 modifying, 트랜잭션과 관련된 이야기
	@Query("UPDATE EngmanMember m SET m.alias = ?1 WHERE m.id = ?2")
	void updateAlias(String alias, long memberId);
	
	@Modifying
	@Query("UPDATE EngmanMember m SET m.memberRole = ?1 WHERE m.id = ?2")
	void updateMemberRole(MemberRole memberRole, long memberId);
}
