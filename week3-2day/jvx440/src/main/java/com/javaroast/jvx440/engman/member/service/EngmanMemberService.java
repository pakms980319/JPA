package com.javaroast.jvx440.engman.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaroast.jvx440.engman.member.domain.EngmanMember;
import com.javaroast.jvx440.engman.member.domain.MemberRole;
import com.javaroast.jvx440.engman.member.repository.EngmanMemberRepository;

import jakarta.transaction.Transactional;

@Service
public class EngmanMemberService {
	@Autowired
	private EngmanMemberRepository memberRepo;
	
	public EngmanMember addMember(EngmanMember member) {
		return memberRepo.save(member);
	}
	
	public List<EngmanMember> getAllMemberList() {
		return (List<EngmanMember>)memberRepo.findAll();
		// 반환타입이 Iterable이므로 List<제네릭> 캐스팅 작업이 필요하다 
	}
	
	public EngmanMember getMemberByEmail(String email) {
		return memberRepo.findByEmail(email).orElse(null);
		// 궁금하다면 Optional APi 에 대해 더 공부할 것
	}
	
	@Transactional  // update 구문에서 @modifying이 들어가 있기 때문에 @Transactional을 작성해야한다
	public void modifyMemberRole(MemberRole memberRole, long memberId) {
		memberRepo.updateMemberRole(memberRole, memberId);
	}
	
	@Transactional
	public void modifyAlias(String alias, long memberId) {
		memberRepo.updateAlias(alias, memberId);
	}
}
