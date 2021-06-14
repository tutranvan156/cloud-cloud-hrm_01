package com.inet.hrm.serivce;

import com.inet.hrm.bo.UserInformationBO;
import com.inet.hrm.model.UserInformation;
import com.inet.xportal.module.web.plugin.dataservice.PluginSubfirmAbstraction;
import com.inet.xportal.nosql.web.model.SiteDataModel;
import com.inet.xportal.nosql.web.model.SubFirmProfile;
import com.inet.xportal.web.WebConstant;
import com.inet.xportal.web.action.AbstractBaseAction;
import com.inet.xportal.web.annotation.XPortalDataService;
import com.inet.xportal.web.annotation.XPortalPageRequest;
import com.inet.xportal.web.exception.WebOSBOException;
import com.inet.xportal.web.interfaces.ObjectWebDataservice;
import com.inet.xportal.web.interfaces.WebDataService;
import com.inet.xportal.web.util.XParamUtils;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

@Named("hrm-user-information-service")
@XPortalDataService(description = "User information service")
@XPortalPageRequest(uri = "user/show", transaction = true, inherit = true, result = WebConstant.ACTION_XSTREAM_JSON_RESULT)

public class UserInformationService extends PluginSubfirmAbstraction {
    @Inject
    UserInformationBO userInformationBO;

    protected WebDataService service(SiteDataModel siteDataModel, SubFirmProfile subFirmProfile, AbstractBaseAction abstractBaseAction, Map<String, Object> map) throws WebOSBOException {

//        UserInformation userInformation = abstractBaseAction.getModel(UserInformation.class);
        System.out.println("co chay vao service");
        UserInformation userInformation = new UserInformation();
        String name = XParamUtils.getString("name", map, "");
        String age = XParamUtils.getString("age", map, "");
        System.out.println("==============chay toi day roi ===========");
        userInformation.setAge(age);
        userInformation.setName(name);
        userInformationBO.save(userInformation);
        System.out.println("asfsfkjfkfffasf=============================================");
        return new ObjectWebDataservice<>("co chay vao day");
    }
}
