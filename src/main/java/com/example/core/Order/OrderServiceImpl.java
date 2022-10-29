package com.example.core.Order;

import com.example.core.discount.DscountPolicy;
import com.example.core.discount.FixDiscountPolicy;
import com.example.core.member.Member;
import com.example.core.member.MemberRepository;
import com.example.core.member.MemoryMemberRepository;


public class OrderServiceImpl implements OderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String ItemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId,ItemName, itemPrice, discountPrice);
    }
}
