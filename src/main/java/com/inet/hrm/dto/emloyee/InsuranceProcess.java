package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsuranceProcess extends BaseModel {

    private String insuranceId;
    private String insuranceCard;
    private String registerPosition;
    private String fromDate;
    private String toDate;
    private String insurancePremium;
    private String insuranceRate;
    private String note;
}
