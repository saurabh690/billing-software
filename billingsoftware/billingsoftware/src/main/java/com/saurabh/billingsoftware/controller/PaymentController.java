package com.saurabh.billingsoftware.controller;

import com.razorpay.RazorpayException;
import com.saurabh.billingsoftware.io.OrderResponse;
import com.saurabh.billingsoftware.io.PaymentRequest;
import com.saurabh.billingsoftware.io.PaymentVerificationRequest;
import com.saurabh.billingsoftware.io.RazorPayOrderResponse;
import com.saurabh.billingsoftware.service.OrderService;
import com.saurabh.billingsoftware.service.RazorPayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final RazorPayService razorPayService;
    private  final OrderService orderService;

    @PostMapping("/create-order")
    @ResponseStatus(HttpStatus.CREATED)
    public RazorPayOrderResponse createRazorpayOrder(@RequestBody PaymentRequest request) throws RazorpayException{
        return razorPayService.createOrder(request.getAmount(), request.getCurrency());
    }

    @PostMapping("/verify")
    public OrderResponse verifyPayment(@RequestBody PaymentVerificationRequest request){
        return orderService.verifyPayment(request);
    }
}
