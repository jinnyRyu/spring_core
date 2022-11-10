package com.example.core;

import com.example.core.Order.OderService;
import com.example.core.Order.OrderServiceImpl;
import com.example.core.discount.DscountPolicy;
import com.example.core.discount.RateDiscount;
import com.example.core.member.MemberService;
import com.example.core.member.MemberServiceImpl;
import com.example.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //구성정보담당
public class AppConfig {  //app 구현체를 직접 생성하도록 

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public  MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DscountPolicy discountPolicy(){
        return new RateDiscount();  // ex 할인정책 변경을 간편하게 할수있도록 설계

    }
}
