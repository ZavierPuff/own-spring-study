/*
 * Copyright(c) 2022 Wyze Labs, All Rights Reserved.
 */

package org.example.main.java.springframework.v2.config;

/**
 * @Author: Meng
 * @Date: 2023/3/30 15:13
 */
public class BeanDefinition {
    //把 Bean 的创建交给容器，而不是我们在调用时候传递一个实例化好的 Bean 对象，另外还需要考虑单例对象，在对象的二次获取时是可以从内存中获取对象的。
    // 此外不仅要实现功能还需要完善基础容器框架的类结构体，否则将来就很难扩容进去其他的功能了
    private Class beanClass;

    public BeanDefinition(final Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return this.beanClass;
    }

    public void setBean(final Class beanClass) {
        this.beanClass = beanClass;
    }
}
