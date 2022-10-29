package com.example.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    void join(){

        Member memberA = new Member(1L, "mameber1", Grade.VIP);
        memberService.join(memberA);

        Member findmember = memberService.findMember(1L);

        Assertions.assertThat(memberA).isEqualTo(findmember);
    }
}
