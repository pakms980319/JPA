package com.javaroast.jvx440.exam.value.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import com.javaroast.jvx440.RoastTest;
import com.javaroast.jvx440.exam.value.domain.ExamAddress1;
import com.javaroast.jvx440.exam.value.domain.ExamUser1;

public class ExamUser1RepositoryTest extends RoastTest {
	@Autowired
	private ExamUser1Repository examUser1Repo;
	
	@Test
	@Transactional
	@Commit
	public void save() {
		ExamUser1 user = new ExamUser1();
		ExamAddress1 address = new ExamAddress1("address1", "address2", "555");  // 인자에서 바로 생성해도 된다. (굳이 변수로?)
		
		user.setEmail("yubi@dummy.com");
		user.setPasswd("1111");
		user.setName("유비");
		user.setPhone("01011112222");
		user.setAddr(address);
		examUser1Repo.save(user);
	}
	
	@Test
	public void findAll() {
//		List<ExamUser1> users = (List) examUser1Repo.findAll();
//		
//		for (ExamUser1 examUser1 : users) {
//			System.out.println(examUser1);
//		}
		examUser1Repo.findAll().forEach(user -> System.out.println(user));
	}
}