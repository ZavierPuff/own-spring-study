package org.example.main.java.springframework.v2;

/**
 * @Author: Meng
 * @Date: 2023/3/30 16:55
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;

}
