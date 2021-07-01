package com.inet.hrm.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User extends BaseModel {
    public String name;
    public String age;
    public UserContactInformation userInfor;


    public User(String name, String age, UserContactInformation userInfor) {
        this.name = name;
        this.age = age;
        this.userInfor = userInfor;
    }
}
