package com.migrantalks.model.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable{

    private String name;
    private int age;
}
