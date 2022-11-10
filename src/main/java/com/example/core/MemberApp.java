package com.example.core;

import com.example.core.member.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        Member memberA = new Member(1L, "mameber1", Grade.VIP);
        memberService.join(memberA);

        Member findmember = memberService.findMember(1L);
        System.out.println("findmember = "+findmember.getName());
        System.out.println("member = "+memberA.getName());
    }
}
