package com.study.demo.strategy;

import java.math.BigDecimal;

/**
 * @Author pukaiquan
 * @Date 2019-11-06 9:45
 */
public interface PayService {

    BigDecimal pay(BigDecimal price);

}
