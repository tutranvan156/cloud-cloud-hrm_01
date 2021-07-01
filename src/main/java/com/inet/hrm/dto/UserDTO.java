package com.inet.hrm.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserDTO {

    String name;
    String age;
    Integer count;

    public UserDTO(String name, String age, Integer count) {
        this.name = name;
        this.age = age;
        this.count = count;
    }

}
