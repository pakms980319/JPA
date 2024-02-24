package com.javaroast.jvx440.exam.value.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import com.javaroast.jvx440.RoastTest;
import com.javaroast.jvx440.exam.value.domain.ExamAddress;
import com.javaroast.jvx440.exam.value.domain.ExamUser;

public class ExamUserServiceTest extends RoastTest {
	@Autowired
	private ExamUserService examUserService;
	
	@Test
	@Transactional
	@Commit
	public void addExamUserTest() {
	    // 테스트용 ExamUser 및 ExamAddress 객체 생성
	    ExamUser testUser = new ExamUser();
	    ExamAddress testAddress = new ExamAddress();
	    
	    testAddress.setAddress1("임시 주소1");
	    testAddress.setAddress2("임시 주소2");
	    testAddress.setPostalCode("5");
	    
	    testUser.setEmail("test@test.com");
	    testUser.setPasswd("1111");
	    testUser.setName("test");
	    testUser.setPhone("01011112222");
	    testUser.setAddr(testAddress);
	        
	    // ExamUserService의 addExamUser 메서드 호출
	    examUserService.addExamUser(testUser);
	}

	
	@Test
	public void getExamUserList() {
		examUserService.getExamUserList().forEach(user -> System.out.println(user));
	}
}
