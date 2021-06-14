package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BackgroundInformationDTO extends BaseModel {
    private String identityCard;
    private String issuedDate;
    private String issuedPlace;
    private String passport;
    //    private String issuedDate;
//    private String issuedPlace;
    private String hometown;
    private String nativeCountry;
    private String permanentAddress;
    private String residenceAddress;
    private String familyMember;
}
