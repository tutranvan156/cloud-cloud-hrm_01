package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Skill extends BaseModel {

    private Boolean office;
    private Boolean programming;
    private Boolean network;
    private Boolean design;
}
