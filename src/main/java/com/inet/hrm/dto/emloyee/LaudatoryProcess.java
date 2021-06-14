package com.inet.hrm.dto.emloyee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LaudatoryProcess extends BaseModel {

    private String laudatoryName;
    private String decisionCode;
    private String decisionDate;
    private String laudatoryContent;
    private String laudatoryAmount;
    private String laudatoryStatus;
}
