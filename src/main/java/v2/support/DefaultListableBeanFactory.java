/*
 * Copyright(c) 2022 Wyze Labs, All Rights Reserved.
 */

package v2.support;

import v2.BeansException;
import v2.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Meng
 * @Date: 2023/3/30 16:54
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {
    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeansException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }

}
