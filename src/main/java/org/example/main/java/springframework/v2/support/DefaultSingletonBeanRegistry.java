/*
 * Copyright(c) 2022 Wyze Labs, All Rights Reserved.
 */

package org.example.main.java.springframework.v2.support;

import org.example.main.java.springframework.v2.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Meng
 * @Date: 2023/3/30 16:55
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return this.singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
