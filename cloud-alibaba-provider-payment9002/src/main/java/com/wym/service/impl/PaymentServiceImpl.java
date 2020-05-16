package com.wym.service.impl;

import com.wym.dao.PaymentDao;
import com.wym.pojo.Payment;
import com.wym.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public List<Payment> queryPayment() {
        return paymentDao.queryPayment();
    }
}
