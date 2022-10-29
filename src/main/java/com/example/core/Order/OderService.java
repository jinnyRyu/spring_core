package com.example.core.Order;

public interface OderService {

    Order createOrder(Long memberId, String ItemName, int itemPrice);
}
