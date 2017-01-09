
package spring.ioc;

import org.junit.Test;

/**
 *
 * @author zhapc
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BeanFacatoryTest {
    @Test
    public void test(){
         // 1.初始化beanfactory
        BeanFactory facatory = new BeanFactory();
        
        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        facatory.registerBeanDefinition("helloWorldService", beanDefinition);
   
        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanDefinition.getBean();
        helloWorldService.sayHello();   
    }
}
