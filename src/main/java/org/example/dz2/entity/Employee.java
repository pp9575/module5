package org.example.dz2.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Employee {
    @Override
    public String toString() {
        return  "name=" + name +
                ", age=" + age +
                ", salary=" + salary;
    }

    private int id;

    @NonNull
    private String name;

    @NonNull
    private int age;

    @NonNull
    private int salary;
}
