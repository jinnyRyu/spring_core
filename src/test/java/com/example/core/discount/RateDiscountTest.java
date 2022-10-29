package com.example.core.discount;

import com.example.core.member.Grade;
import com.example.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountTest {

    RateDiscount rateDiscount = new RateDiscount();

    @Test
    @DisplayName("vip 10")
    void vip(){
        Member member = new Member(1L,"vip", Grade.VIP);

        int discount = rateDiscount.discount(member, 10000);

        Assertions.assertThat(discount).isEqualTo(1000);
    }

}