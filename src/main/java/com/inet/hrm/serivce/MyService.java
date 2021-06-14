package com.inet.hrm.serivce;

import com.inet.hrm.bo.TestBO;
import com.inet.hrm.dto.emloyee.WorkInformation;
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

@Named("hrmmyService")
@XPortalDataService(description = "My test service")
@XPortalPageRequest(uri = "test/show", transaction = true, inherit = true, result = WebConstant.ACTION_XSTREAM_JSON_RESULT)
public class MyService extends PluginSubfirmAbstraction {
    @Inject
    TestBO testBO;

    protected WebDataService service(SiteDataModel siteDataModel, SubFirmProfile subFirmProfile, AbstractBaseAction abstractBaseAction, Map<String, Object> map) throws WebOSBOException {
        System.out.println("=================================================Enter==========================================");
        System.out.println("===================asdf=fad=fdsf=sfa=da=dfds=f=adsf=asdf=dsa=fdsa=f==============================");


        System.out.println("chay lai ne hahaha ==============================");
        String name = XParamUtils.getString("name", map, "");
        String address = XParamUtils.getString("address", map, "");
        WorkInformation workInformation = abstractBaseAction.getModel(WorkInformation.class);
        String age = XParamUtils.getString("age", map, "");
        Test test = new Test();
        test.setName(name);
        test.setAge(age);
        test.setAddress(address);
        TestChild testChild = new TestChild();
        testChild.setWorkPosition("Sai Gon");
        testChild.setPhone("0232323");
        testChild.setContactNumber("01212312321321");
        test.setTestChild(testChild);
        testBO.save(test);
        return new ObjectWebDataservice<>(testBO.findAll());


    }
}
