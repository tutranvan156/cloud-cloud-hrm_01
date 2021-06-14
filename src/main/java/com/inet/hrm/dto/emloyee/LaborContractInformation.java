package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LaborContractInformation extends BaseModel {

    private String idContract;
    private String kindOfLaborContract;
    private String personalIncomeTax;
    private String contractSigningDate;
    private String contractSigner;
    private String typeOfWork;
    private String probationaryPeriod;
    private String payForms;
    private String wage;
    private String dateStartWork;
    private String contractStatus;
    private String contractExpirationDate;
    private String contractTerminationDate;
    private String numberOfContract;
    private String contractAddendum;
}
