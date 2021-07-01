package com.inet.hrm.serivce;

import com.inet.hrm.bo.UserBO;
import com.inet.hrm.model.User;
import com.inet.hrm.model.UserContactInformation;
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
import com.inet.xportal.xdb.util.JSONUtil;
import lombok.SneakyThrows;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.HashMap;
import java.util.Map;

@Named("updateSubmodel")
@XPortalPageRequest(uri = "user/update-sub-model", transaction = true, inherit = true, result = WebConstant.ACTION_XSTREAM_JSON_RESULT)
@XPortalDataService(description = "update user in sub model")
public class UpdateSubModel extends PluginSubfirmAbstraction {
    @Inject
    UserBO userBO;

    @SneakyThrows
    @Override
    protected WebDataService service(SiteDataModel siteDataModel, SubFirmProfile subFirmProfile, AbstractBaseAction abstractBaseAction, Map<String, Object> map) throws WebOSBOException {
        String name = XParamUtils.getString("name", map);
        Integer index = XParamUtils.getInteger("index", map);

        String temp = XParamUtils.getString("user", map, "");
        Map<String, Class<?>> children = new HashMap<>();
        children.put("userInfor", UserContactInformation.class);
        User user = JSONUtil.transfer(temp, User.class, children);

        System.out.println("================================");
        System.out.println(name);
        System.out.println(index);
        System.out.println(temp);
        userBO.updateUser(name, index, user);
        return new ObjectWebDataservice<>(userBO.findAll());
    }
}
