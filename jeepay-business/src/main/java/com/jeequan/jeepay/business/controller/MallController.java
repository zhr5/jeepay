package com.jeequan.jeepay.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mall")
public class MallController {

   /* @Autowired
    private MallBusinessService mallService;

    @PostMapping("/create-order")
    public ApiRes<MallOrder> createOrder(@RequestBody MallOrderRequest request) {
        MallOrder order = mallService.createMallOrder(request);
        return ApiRes.ok(order);
    }

    @PostMapping("/pay")
    public ApiRes<PaymentResponse> pay(@RequestParam String orderId) {
        PaymentResponse response = mallService.payMallOrder(orderId);
        return ApiRes.ok(response);
    }*/
}

