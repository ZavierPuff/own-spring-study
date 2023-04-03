/*
 * Copyright(c) 2022 Wyze Labs, All Rights Reserved.
 */

package org.example.main.java.springframework.v1;

/**
 * @Author: Meng
 * @Date: 2023/3/30 14:49
 */
public class BeanDefinition {

    public BeanDefinition(final Object bean){
        this.bean = bean;
    }
    private final Object bean;

    public Object getBean(){
        return this.bean;
    }
}
