package spring.ioc;

import java.util.HashMap;
import java.util.Map;


/**
 * @author zhapc
 */
public class BeanFactory {
     Map<String,BeanDefinition> beanDefinitionMap = new HashMap<String,BeanDefinition>();
     
     public Object getBean(String name){
         return beanDefinitionMap.get(name);
     }
     public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
         beanDefinitionMap.put(name,beanDefinition);
     }
}
