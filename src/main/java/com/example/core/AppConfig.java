package com.example.core;

import com.example.core.Order.OderService;
import com.example.core.Order.OrderServiceImpl;
import com.example.core.discount.FixDiscountPolicy;
import com.example.core.member.MemberService;
import com.example.core.member.MemberServiceImpl;
import com.example.core.member.MemoryMemberRepository;

public class AppConfig {  //app 구현체를 직접 생성하도록 

    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}