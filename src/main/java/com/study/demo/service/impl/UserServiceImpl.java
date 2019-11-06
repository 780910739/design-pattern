package com.study.demo.service.impl;

import com.study.demo.service.UserService;
import com.study.demo.strategy.PayServiceStrategyFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author pukaiquan
 * @Date 2019-11-04 11:20
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void payOrder(Integer type, BigDecimal price) {
        BigDecimal pr = PayServiceStrategyFactory.getPayType(type).pay(price);
    }
}
