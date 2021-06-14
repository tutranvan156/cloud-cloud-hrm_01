package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkProcess extends BaseModel {

    private String fromDate;
    private String toDate;
    private String position;
    private String rank;
    private String level;
    private String department;
    private String directManager;
}
