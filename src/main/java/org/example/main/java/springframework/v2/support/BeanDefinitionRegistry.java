/*
 * Copyright(c) 2022 Wyze Labs, All Rights Reserved.
 */

package org.example.main.java.springframework.v2.support;

import org.example.main.java.springframework.v2.config.BeanDefinition;

/**
 * @Author: Meng
 * @Date: 2023/3/30 15:26
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
