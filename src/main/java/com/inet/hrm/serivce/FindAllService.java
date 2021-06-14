package com.inet.hrm.serivce;

import com.inet.hrm.bo.AssetBO;
import com.inet.xportal.module.web.plugin.dataservice.PluginSubfirmAbstraction;
import com.inet.xportal.nosql.web.model.SiteDataModel;
import com.inet.xportal.nosql.web.model.SubFirmProfile;
import com.inet.xportal.web.WebConstant;
import com.inet.xportal.web.action.AbstractBaseAction;
import com.inet.xportal.web.annotation.XPortalDataService;
import com.inet.xportal.web.annotation.XPortalPageRequest;
import com.inet.xportal.web.interfaces.ObjectWebDataservice;
import com.inet.xportal.web.interfaces.WebDataService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

@Named("")
@XPortalDataService(description = "Mange procedure")
@XPortalPageRequest(uri = "hrm/findall", transaction = true, inherit = true,
        result = WebConstant.ACTION_XSTREAM_JSON_RESULT)
public class FindAllServicStringe extends PluginSubfirmAbstraction {
    @Inject
    AssetBO assetBO;

    @Override
    protected WebDataService service(SiteDataModel siteDataModel, SubFirmProfile subFirmProfile,
                                     AbstractBaseAction abstractBaseAction, Map<String, Object> map) {

        return new ObjectWebDataservice<>(assetBO.findAll());
    }
}
