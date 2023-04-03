package v2.config;

/**
 * @Author: Meng
 * @Date: 2023/3/30 15:24
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
