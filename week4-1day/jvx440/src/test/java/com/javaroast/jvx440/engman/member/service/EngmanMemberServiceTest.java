package com.javaroast.jvx440.engman.member.service;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;

import com.javaroast.jvx440.RoastTest;
import com.javaroast.jvx440.engman.member.domain.EngmanMember;
import com.javaroast.jvx440.engman.member.domain.MemberRole;

import jakarta.transaction.Transactional;

public class EngmanMemberServiceTest extends RoastTest {
	@Autowired
	private EngmanMemberService service;
	
	@Test
	@Transactional
	@Commit
	public void addMember() {
		EngmanMember engmanMember = new EngmanMember();
		
		
		for (int i = 0; i < 10; i++) {
            engmanMember = new EngmanMember();
            engmanMember.setEmail("example" + i + "@example.com");
            engmanMember.setPasswd("password" + i);
            engmanMember.setAlias("User" + i);
            engmanMember.setImagePath("/path/to/image" + i);
            engmanMember.setMemberRole(MemberRole.USER);
            engmanMember.setName("User" + i);
            engmanMember.setPhone("123-456-789" + i);
            engmanMember.setSex(i % 2 == 0 ? 'M' : 'F'); // 홀수면 'F', 짝수면 'M'
            engmanMember.setBirthDate(new Date()); // 현재 날짜로 설정
            engmanMember.setRegDate(new Date());   // 현재 날짜로 설정
            engmanMember.setUpdateDate(new Date()); // 현재 날짜로 설정
            
            service.addMember(engmanMember);
        }
		
	}
	
	@Test
	@Transactional
	public void getAllMemberList() {
		service.getAllMemberList().forEach(m -> System.out.println(m));
	}
	
	@Test
	@Transactional
	public void getMemberByEmail() {
		EngmanMember m = service.getMemberByEmail("example3@example.com");
		System.out.println(m);
	}
	
	@Test
	@Transactional
	@Commit
	public void modifyMemberRole() {
//	    EngmanMember m = service.getMemberByEmail("example3@example.com");
	    service.modifyMemberRole(MemberRole.MANAGER, 1517);
	    EngmanMember m = service.getMemberByEmail("example6@example.com");
	    System.out.println(m.getMemberRole());
	}
	
	private Date parseDate(int year) {
        // 연도를 문자열로 변환
        String dateString = String.valueOf(year);
        
        // SimpleDateFormat을 사용하여 문자열을 Date로 파싱
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        ParsePosition position = new ParsePosition(0); // 파싱을 시작할 위치를 설정합니다.
        Date parsedDate = format.parse(dateString, position);
        
        // 파싱된 Date 객체 반환
        return parsedDate;
    }
}
