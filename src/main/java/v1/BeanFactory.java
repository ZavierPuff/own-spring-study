/*
 * Copyright(c) 2022 Wyze Labs, All Rights Reserved.
 */

package v1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Meng
 * @Date: 2023/3/30 14:49
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }

    public void registerBeanDefinition(final String beanName, final BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
