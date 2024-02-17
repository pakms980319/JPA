package com.javaroast.jvx440.exam.id;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;

import com.javaroast.jvx440.RoastTest;

import jakarta.transaction.Transactional;

public class IdStrategyRepositoryTest extends RoastTest {
	@Autowired
	private IdStrategyRepository idStrategyRepo;
	
	@Test
	@Transactional
	@Commit
	public void save() {
		idStrategyRepo.save(new IdStrategy("유비"));
	}
	
}
