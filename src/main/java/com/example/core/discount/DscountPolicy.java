package com.example.core.discount;

import com.example.core.member.Member;

public interface DscountPolicy {

    int discount(Member member, int price);
}
