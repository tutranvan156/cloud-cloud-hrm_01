package com.inet.hrm.bo;

import com.inet.hrm.dto.emloyee.BaseModel;
import com.inet.xportal.nosql.web.bf.MagicContentBF;
import com.inet.xportal.nosql.web.bo.MagicContentBO;
import com.inet.xportal.web.interfaces.BeanInitiateInvoke;

import javax.inject.Inject;

public abstract class AbstractBO<T extends BaseModel> extends MagicContentBO<T> implements BeanInitiateInvoke {

    public static final String CONTENT_CONTEXT_NAME = "CloudHrmBF";

    @Inject
    protected AbstractBO(MagicContentBF magicContentBF, String collectionName) {
        super(magicContentBF, collectionName);
    }
}
