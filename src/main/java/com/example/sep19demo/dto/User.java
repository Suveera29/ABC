package com.example.sep19demo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder

public class User {

    private  String firstName;
    private String lastName;
    //@NonNull
    private Integer age;


}
