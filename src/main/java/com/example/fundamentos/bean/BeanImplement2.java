package com.example.fundamentos.bean;

import com.example.fundamentos.bean.Bean;

public class BeanImplement2 implements Bean {

    @Override
    public void saludar() {
        System.out.println("Hola desde implementación 2 propia de Bean");
    }
}
