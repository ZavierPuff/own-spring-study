/*
 * Copyright(c) 2022 Wyze Labs, All Rights Reserved.
 */

package v2.support;

import v2.BeanFactory;
import v2.BeansException;
import v2.config.BeanDefinition;

/**
 * @Author: Meng
 * @Date: 2023/3/30 15:26
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        final Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
