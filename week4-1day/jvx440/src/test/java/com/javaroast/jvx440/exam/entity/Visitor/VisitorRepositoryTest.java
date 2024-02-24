package com.javaroast.jvx440.exam.entity.Visitor;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;

import com.javaroast.jvx440.VisitorTest;

import jakarta.transaction.Transactional;

public class VisitorRepositoryTest extends VisitorTest {
    @Autowired
    private VisitorRepository visitorRepository;

    @Test
    @Transactional
    @Commit
    public void save() {
        Visitor visitor = new Visitor();
        
        visitor.setVisitorId("first User");
        visitor.setEmail("fjwofj@naver.com");
        visitor.setUserDevice("Computer");
        visitor.setReferer("google search");
        visitor.setRequestURI("/search?id=jfj&page=2");
        visitor.setClientIP("112.0.251.154");

        visitorRepository.save(visitor);

        visitor = new Visitor();

        visitor.setVisitorId("second User");
        visitor.setEmail("fjwofj@naver.com");
        visitor.setUserDevice("Phone");
        visitor.setReferer("Naver search");
        visitor.setRequestURI("/search?id=fadg");
        visitor.setClientIP("117.30.21.75");

        visitorRepository.save(visitor);

        visitor = new Visitor();

        visitor.setVisitorId("third User");
        visitor.setEmail("testuser@daum.com");
        visitor.setUserDevice("Tablet");
        visitor.setReferer("daum search");
        visitor.setRequestURI("/search?sh=fjo&jf=154");
        visitor.setClientIP("92.1.93.205");

        visitorRepository.save(visitor);

        visitor = new Visitor();

        visitor.setVisitorId("fourth User");
        visitor.setEmail("zero@test.com");
        visitor.setUserDevice("Unknown");
        visitor.setReferer("yahoo search");
        visitor.setRequestURI("/search?h=1&fj=124");
        visitor.setClientIP("1.1.1.1");

        visitorRepository.save(visitor);
    }
    
    @Test
    public void findAll() {
    	List<Visitor> visitorList = (List<Visitor>)visitorRepository.findAll();
    	for (Visitor visitor : visitorList) {
    		System.out.println(visitor);
    	}
    }
}
