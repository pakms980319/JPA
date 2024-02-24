package com.javaroast.jvx440.exam.value.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaroast.jvx440.exam.value.domain.ExamUser;
import com.javaroast.jvx440.exam.value.repository.ExamUserRepository;

@Service
public class ExamUserService {
	@Autowired
	private ExamUserRepository examUserRepo;
	
	public ExamUser addExamUser(ExamUser user) {
		return examUserRepo.save(user);
	}
	
	public List<ExamUser> getExamUserList() {
		return (List<ExamUser>)examUserRepo.findAll();
	}
}
