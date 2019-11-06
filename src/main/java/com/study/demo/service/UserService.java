package com.study.demo.service;

import java.math.BigDecimal;

/**
 * @Author pukaiquan
 * @Date 2019-11-04 11:20
 */
public interface UserService {

   void payOrder(Integer type, BigDecimal price);

}
