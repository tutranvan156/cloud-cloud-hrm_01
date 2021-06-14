package com.inet.hrm.serivce.profile;

import com.inet.xportal.web.annotation.XPortalDataService;
import com.inet.xportal.web.annotation.XPortalPageRequest;

import javax.inject.Named;

@Named("hrm_profile_service")
@XPortalDataService(description = "profile employee")
@XPortalPageRequest(uri = "hrm/profile/main", inherit = true, transaction = true)
public class ProfileService {

}
