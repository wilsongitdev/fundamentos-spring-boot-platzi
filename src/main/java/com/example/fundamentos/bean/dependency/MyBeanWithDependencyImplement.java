package com.example.fundamentos.bean.dependency;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    private Operation myoperation;

    public MyBeanWithDependencyImplement(Operation myoperation) {
        this.myoperation = myoperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 0;
        System.out.println(myoperation.sumar(numero));
        System.out.println("Hola desde implementación de un bean con dependencia");
    }
}
