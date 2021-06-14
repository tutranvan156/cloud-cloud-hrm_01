package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeInformation extends BaseModel {


    private Profile profile;
    private ContactInformation contactInformation;
    private BackgroundInformationDTO backgroundInformationDTO;
    private InsuranceProcess insuranceProcess;
    private LaborContractInformation laborContractInformation;
    private WorkInformation workInformation;
    private Certificate certificate;
    private Skill skill;
}
