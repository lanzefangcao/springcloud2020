package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_ok(Integer id) {
        return "------PaymentFallbackService fallback-paymentInfo_OK.哭脸";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService fallback-paymentInfo_TimeOut.哭脸";
    }
}
