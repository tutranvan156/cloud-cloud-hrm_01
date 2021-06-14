package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profile extends BaseModel {

    private String image;
    private String employeeCode;
    private String fullName;
    private String email;
    private String gender;
    private String birthPlace;
    private String dateOfBirth;
    private String taxIdNumber;
    private String department;
    private String jobPosition;
    private String nationality;
}
