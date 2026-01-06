package com.jeequan.jeepay.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/home-service")
public class HomeServiceController {

    @Autowired
    private HomeServiceBusinessService homeServiceService;

    @PostMapping("/create-order")
    public ApiRes<HomeServiceOrder> createOrder(@RequestBody HomeServiceRequest request) {
        HomeServiceOrder order = homeServiceService.createHomeServiceOrder(request);
        return ApiRes.success(order);
    }

    @PostMapping("/pay")
    public ApiRes<PaymentResponse> pay(@RequestParam String orderId) {
        PaymentResponse response = homeServiceService.payHomeService(orderId);
        return ApiRes.success(response);
    }
}

