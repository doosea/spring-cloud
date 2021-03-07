package com.enn.service;

import com.enn.entity.Payment;

import java.util.List;

public interface PaymentService {
    Integer create(Payment payment);

    Payment getPaymentById(Long id);

    List<Payment> getPayment();
}
