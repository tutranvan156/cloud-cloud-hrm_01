package com.inet.hrm.bo;

import com.inet.hrm.model.UserInformation;
import com.inet.xportal.nosql.web.bf.MagicContentBF;
import com.inet.xportal.nosql.web.bo.MagicContentBO;
import com.inet.xportal.web.interfaces.BeanInitiateInvoke;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named("hrm-userinformation-BO")
public class UserInformationBO extends MagicContentBO<UserInformation> implements BeanInitiateInvoke {
    @Inject
    protected UserInformationBO(MagicContentBF magicContentBF) {
        super(magicContentBF, "user-show");
    }

    public UserInformation save(UserInformation userInformation) {
        userInformation.setUuid(super.add(userInformation));
        return userInformation;
    }

    public List<UserInformation> findAll() {
        System.out.println("==============chay toi find all ============");
        return this.query().getItems();
    }

    @Override
    protected Class<UserInformation> getClassConvetor() {
        return UserInformation.class;
    }

    @Override
    public void init() {

    }
}
