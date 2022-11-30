package org.example.dz2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;
@Data
public class EmployeeDtoRq {
    @Override
    public String toString() {
        return  "name=" + name +
                ", age=" + age +
                ", salary=" + salary;
    }

    @JsonProperty
    private Integer id;

    @NonNull
    @JsonProperty
    private String name;

    @NonNull
    @JsonProperty
    private Integer age;

    @JsonProperty
    @NonNull
    private Integer salary;
}

