package com.inet.hrm.serivce;

import com.inet.hrm.bo.UserBO;
import com.inet.hrm.model.User;
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
import java.util.List;
import java.util.Map;

@Named("update user")
@XPortalDataService(description = "cap nhat thong tin nguoi dung")
@XPortalPageRequest(uri = "user/update", transaction = true, inherit = true, result = WebConstant.ACTION_XSTREAM_JSON_RESULT)
public class UpdateService extends PluginSubfirmAbstraction {
    @Inject
    UserBO userBO;

    @Override
    protected WebDataService service(SiteDataModel siteDataModel, SubFirmProfile subFirmProfile, AbstractBaseAction abstractBaseAction, Map<String, Object> map) throws WebOSBOException {
        String username = XParamUtils.getString("name", map, "");
        String updateUsername = XParamUtils.getString("updateName", map, "");
        String updateAge = XParamUtils.getString("updateAge", map, "");
        List<User> users = this.userBO.findUserByUsername(username);
        String uuid = users.get(0).getUuid();
        User userUpdate = new User();
        userUpdate.setName(updateUsername);
        userUpdate.setAge(updateAge);

        this.userBO.updateUserByID(uuid, userUpdate);
        return new ObjectWebDataservice<>("Update thanh cong");
    }
}
