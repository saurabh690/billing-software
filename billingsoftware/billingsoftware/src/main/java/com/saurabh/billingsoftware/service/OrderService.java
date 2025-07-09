package com.saurabh.billingsoftware.service;

import com.saurabh.billingsoftware.io.OrderRequest;
import com.saurabh.billingsoftware.io.OrderResponse;
import com.saurabh.billingsoftware.io.PaymentVerificationRequest;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {
    List<OrderResponse> getLatestOrder();

    void deleteOrder(String orderId);

    OrderResponse createOrder(OrderRequest request);

    OrderResponse verifyPayment(PaymentVerificationRequest request);

    Double sumSalesByDate(LocalDate date);

    Long countByOrderDate(LocalDate date);

    List<OrderResponse> findRecentOrders();
}
