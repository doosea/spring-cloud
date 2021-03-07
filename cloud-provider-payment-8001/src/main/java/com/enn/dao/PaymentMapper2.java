package com.enn.dao;

import com.enn.entity.Payment;
import com.enn.entity.PaymentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentMapper2 {


    List<Payment> getAll();


}