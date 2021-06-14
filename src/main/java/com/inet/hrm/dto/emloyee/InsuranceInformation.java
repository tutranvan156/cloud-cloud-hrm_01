package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsuranceInformation extends BaseModel {
    private String insuranceCoverageDate;
    private String insuranceRate;
    private String someSocialInsuranceBooks;
    private String socialInsuranceNumber;
    private String expirationDate;
    private String medicalExaminationPlace;
    private String medicalExaminationPlaceCode;
    private String wageInsurancePremiums;
}
