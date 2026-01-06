package com.jeequan.jeepay.business.controller;

import com.jeequan.jeepay.core.model.ApiRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/property")
public class PropertyFeeController {

    @Autowired
    private PropertyFeeBusinessService propertyFeeService;

    @PostMapping("/create-order")
    public ApiRes<PropertyFeeOrder> createOrder(@RequestBody PropertyFeeRequest request) {
        PropertyFeeOrder order = propertyFeeService.createPropertyFeeOrder(request);
        return ApiRes.ok(order);
    }

    @PostMapping("/pay")
    public ApiRes<PaymentResponse> pay(@RequestParam String orderId) {
        PaymentResponse response = propertyFeeService.payPropertyFee(orderId);
        return ApiRes.ok(response);
    }
}

