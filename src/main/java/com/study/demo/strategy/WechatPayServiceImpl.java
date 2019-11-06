package com.study.demo.strategy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author pukaiquan
 * @Date 2019-11-06 9:47
 */
@Service
public class WechatPayServiceImpl implements PayService, InitializingBean {

    @Override
    public BigDecimal pay(BigDecimal price) {
        System.out.println("wechatpay");
        return price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        PayServiceStrategyFactory.register(1, this);
    }
}
