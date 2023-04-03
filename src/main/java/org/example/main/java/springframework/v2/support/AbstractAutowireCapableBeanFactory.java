/*
 * Copyright(c) 2022 Wyze Labs, All Rights Reserved.
 */

package org.example.main.java.springframework.v2.support;

import org.example.main.java.springframework.v2.BeansException;
import org.example.main.java.springframework.v2.config.BeanDefinition;

/**
 * @Author: Meng
 * @Date: 2023/3/30 15:25
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
