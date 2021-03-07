package com.enn.service.impl;

import com.enn.dao.PaymentMapper;
import com.enn.dao.PaymentMapper2;
import com.enn.entity.Payment;
import com.enn.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;
    @Resource
    private PaymentMapper2 paymentMapper2;

    @Override
    public Integer create(Payment payment) {
        int insert = paymentMapper.insert(payment);
        return insert;
    }

    @Override
    public Payment getPaymentById(Long id) {
        Payment payment = paymentMapper.selectByPrimaryKey(id);
        return payment;
    }

    @Override
    public List<Payment> getPayment() {
        List<Payment> all = paymentMapper2.getAll();
        return all;
    }
}
