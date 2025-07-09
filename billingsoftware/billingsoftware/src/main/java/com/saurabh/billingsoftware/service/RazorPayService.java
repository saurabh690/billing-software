package com.saurabh.billingsoftware.service;

import com.razorpay.RazorpayException;
import com.saurabh.billingsoftware.io.RazorPayOrderResponse;

public interface RazorPayService {

    RazorPayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;

}
