package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrainProcess extends BaseModel {

    private String courseCode;
    private String courseName;
    private String fromDate;
    private String toDate;
    private String certificateName;
    private String result;
    private String evaluate;
}
