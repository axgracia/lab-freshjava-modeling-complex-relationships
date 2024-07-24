package com.ironhacklab.Modeling.Relationships;

import com.ironhacklab.Modeling.Relationships.service.MemberService;
import com.ironhacklab.Modeling.Relationships.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping
    public Member createMember(@RequestBody Member member) {
        return memberService.saveMember(member);
    }

    @GetMapping("/{id}")
    public Member getMember(@PathVariable Long id) {
        return memberService.findMemberById(id);
    }

    // Additional endpoints for update and delete can be added here
}