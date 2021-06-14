package com.inet.hrm.bo;

import com.inet.hrm.model.Test;
import com.inet.xportal.nosql.web.bf.MagicContentBF;
import com.inet.xportal.nosql.web.bo.MagicContentBO;
import com.inet.xportal.web.interfaces.BeanInitiateInvoke;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named("hrm-testBO")
public class TestBO extends MagicContentBO<Test> implements BeanInitiateInvoke {

    @Inject
    protected TestBO(MagicContentBF magicContentBF) {
        super(magicContentBF, "demo-collection");
    }

    public Test save(Test test) {
        childrenConvertMap();
        this.add(test, "code");
        return test;
    }

    public List<Test> findAll() {
        return this.query().getItems();
    }

    @Override
    protected Map<String, Class<?>> childrenConvertMap() {
        Map<String, Class<?>> children = new HashMap<>();
        return children;
    }

    @Override
    protected Class getClassConvetor() {
        return Test.class;
    }

    @Override
    public void init() {

    }
}
