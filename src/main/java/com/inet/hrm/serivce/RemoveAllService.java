package com.inet.hrm.serivce;

import com.inet.hrm.bo.UserBO;
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

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

@Named("removeAll")
@XPortalDataService(description = "xoa tat ca user")
@XPortalPageRequest(uri = "user/remove-all", inherit = true, transaction = true, result = WebConstant.ACTION_XSTREAM_JSON_RESULT)

public class RemoveAllService extends PluginSubfirmAbstraction {
    @Inject
    UserBO userBO;

    @Override
    protected WebDataService service(SiteDataModel siteDataModel, SubFirmProfile subFirmProfile, AbstractBaseAction abstractBaseAction, Map<String, Object> map) throws WebOSBOException {
        userBO.removeAll();
        return new ObjectWebDataservice<>("Xoa tat ca user thanh cong");

    }

}
