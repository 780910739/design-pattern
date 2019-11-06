package com.study.demo.strategy;

import com.study.demo.strategy.PayService;
import org.springframework.util.Assert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author pukaiquan
 * @Date 2019-11-06 9:52
 */
public class PayServiceStrategyFactory {

    private static Map<Integer, PayService> services = new ConcurrentHashMap<>();

    public static PayService getPayType(Integer type) {
        return services.get(type);
    }

    public static void register(Integer userType, PayService payService) {
        Assert.notNull(userType, "userType can't be null");
        services.put(userType, payService);
    }

}
