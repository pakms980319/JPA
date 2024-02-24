package com.javaroast.jvx440.exam.value.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import com.javaroast.jvx440.RoastTest;
import com.javaroast.jvx440.exam.value.domain.ExamAddress;
import com.javaroast.jvx440.exam.value.domain.ExamUser;

public class ExamUserRepositoryTest extends RoastTest {
	@Autowired
	ExamUserRepository examUserRepo;
	
	@Test
	@Transactional
	@Commit
	public void save() {
		ExamUser user = new ExamUser();
		
		user.setEmail("yubi@dummy.com");
		user.setPasswd("1111");
		user.setName("유비");
		user.setPhone("01011112222");
		user.setAddr(new ExamAddress("address1", "address2", "555"));
		examUserRepo.save(user);
	}
	
	@Test
	public void findAll() {
		examUserRepo.findAll().forEach(user -> System.out.println(user));
	}
}
