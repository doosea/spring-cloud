package com.enn.controller;

import com.enn.common.ApiResultDto;
import com.enn.entity.Payment;
import com.enn.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/test")
    public String test() {
        return "hello";
    }

    @PostMapping("/payment")
    public ApiResultDto createPayment(Payment payment) {
        Integer integer = paymentService.create(payment);
        return new ApiResultDto(integer);
    }

    @GetMapping("/payment")
    public ApiResultDto getPayment() {
        List<Payment> payment = paymentService.getPayment();
        return new ApiResultDto(payment);
    }

    @GetMapping("/payment/{id}")
    public ApiResultDto getPaymentById(@PathVariable("id") Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        return new ApiResultDto(paymentById);
    }

}
