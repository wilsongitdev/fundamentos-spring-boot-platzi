package com.example.fundamentos.bean.dependency;

import com.example.fundamentos.bean.dependency.Operation;

public class OperationImplement implements Operation {

    @Override
    public int sumar(int num) {
        return num + 322;
    }
}
