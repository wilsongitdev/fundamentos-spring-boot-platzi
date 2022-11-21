package com.example.fundamentos.bean;

import com.example.fundamentos.bean.Bean;

public class BeanImplement implements Bean {

    @Override
    public void saludar() {
        System.out.println("Hola desde implementación propia de Bean");
    }
}
