package com.inet.hrm.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserContactInformation {
    public String address;
    public String phone;
    public String workPosition;

    public UserContactInformation(String address, String phone, String workPosition) {
        this.address = address;
        this.phone = phone;
        this.workPosition = workPosition;
    }
}
