package com.example.core;

import com.example.core.member.*;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());
        Member memberA = new Member(1L, "mameber1", Grade.VIP);
        memberService.join(memberA);

        Member findmember = memberService.findMember(1L);
        System.out.println("findmember = "+findmember.getName());
        System.out.println("member = "+memberA.getName());
    }
}
