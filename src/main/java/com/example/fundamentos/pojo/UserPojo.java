package com.example.fundamentos.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "user") //representa al prefijo user creado en properties
                                        // todos los atributos se asignan al prefijo user

public class UserPojo {
    private int edad;
    private String email;
    private String password;

    public UserPojo(int edad, String email, String password) {
        this.edad = edad;
        this.email = email;
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
