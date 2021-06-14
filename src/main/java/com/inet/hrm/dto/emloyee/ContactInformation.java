package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactInformation extends BaseModel {


    private String phoneNumber;
    private String email;
    private String zalo;
    private String address;
}
