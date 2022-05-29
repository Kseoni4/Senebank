package ru.mirea.senebank.model;

import lombok.Data;

@Data
public class ClientModel {

    private String name;
    private int age;
    private String password;

    private Role role;

}
