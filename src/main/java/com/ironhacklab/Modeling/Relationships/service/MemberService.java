package com.ironhacklab.Modeling.Relationships.service;

import com.ironhacklab.Modeling.Relationships.model.Member;
import com.ironhacklab.Modeling.Relationships.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    public List<Member> findAllMembers() {
        return memberRepository.findAll();
    }

    public Member findMemberById(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    // Additional methods to manipulate members
}
