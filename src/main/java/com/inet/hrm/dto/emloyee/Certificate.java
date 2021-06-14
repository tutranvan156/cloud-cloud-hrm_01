package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Certificate<String> extends BaseModel {

    private String degreeTraining;
    private String trainingPlace;
    private String facultyOfTraining;
    private String field;
    private String certificateName;
    private String numberCertificate;
    private String certificateDate;
}
