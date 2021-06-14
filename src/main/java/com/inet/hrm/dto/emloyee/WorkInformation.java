package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkInformation extends BaseModel {

    private String employeeCode;
    private String timeAttendanceCode;
    private String department;
    private String jobPosition;
    private String title;
    private String rank;
    private String level;
    private String workStatus;
    private String kindOfLaborContract;
    private String trainingDate;
    private String probationaryDate;
    private String officeDate;
    private String directManager;
    private String numOfLeave;
    private String addressWork;
}
