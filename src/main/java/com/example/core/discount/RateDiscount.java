package com.example.core.discount;

import com.example.core.member.Grade;
import com.example.core.member.Member;

public class RateDiscount implements DscountPolicy{

    private int discountPrice = 10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPrice / 100;
        }else {
            return 0;
        }
    }
}
