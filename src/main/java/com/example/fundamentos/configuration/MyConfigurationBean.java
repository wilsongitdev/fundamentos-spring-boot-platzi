package com.example.fundamentos.configuration;

import com.example.fundamentos.bean.*;
import com.example.fundamentos.bean.dependency.*;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @org.springframework.context.annotation.Bean
    public Bean beanOperation(){
        return new BeanImplement2();
    }

    @org.springframework.context.annotation.Bean
    public Operation operationop(){
        return new OperationImplement();
    }

    @org.springframework.context.annotation.Bean
    public MyBeanWithDependency MyBeanWithDependencyoperation(Operation operation){
        return new MyBeanWithDependencyImplement(operation);
    }

}
