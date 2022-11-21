package com.example.fundamentos.configuration;

import com.example.fundamentos.bean.MyBeanWithProperties;
import com.example.fundamentos.bean.MyBeanWithPropertiesImplement;
import com.example.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)//habilita la compatibilidad con beans anotados de ConfigurationProperties
public class GeneralConfiguration {
    @Value("${value.nombre}")//se llama a los values que fueron inicializados
    private String nombre;

    @Value("${value.apellido}")//se llama a los values que fueron inicializados
    private String apellido;

    @org.springframework.context.annotation.Bean
    public MyBeanWithProperties funciona(){
        return new MyBeanWithPropertiesImplement(nombre, apellido);
    }
}
