package com.inet.hrm.bo;

import com.inet.hrm.dto.UserDTO;
import com.inet.hrm.model.User;
import com.inet.hrm.model.UserContactInformation;
import com.inet.xportal.nosql.web.bf.MagicContentBF;
import com.inet.xportal.nosql.web.bo.MagicContentBO;
import com.inet.xportal.nosql.web.data.SearchDTO;
import com.inet.xportal.web.interfaces.BeanInitiateInvoke;
import com.inet.xportal.xdb.persistence.JSONDB;
import com.inet.xportal.xdb.query.impl.QueryImpl;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named("hrm-userinformation-BO")
public class UserBO extends MagicContentBO<User> implements BeanInitiateInvoke {
    @Inject
    protected UserBO(MagicContentBF magicContentBF) {
        super(magicContentBF, "user-show");
    }

    public User save(User user) {
        user.setUuid(super.add(user));
        return user;
    }


    public void updateUser(String username, Integer index, User user) {
        User userTemp = this.findUserByUsername(username).get(index);
        this.updateUserByID(userTemp.getUuid(), user);
    }

    public void removeAll() {
        super.removeAll();
    }

    public List<User> findUserByUsername(String username) {
        QueryImpl<JSONDB> query = new QueryImpl<>();
        query.field("name").equal(username);
        return this.query(query).getItems();
    }

    public List<User> findUserByAge(String age) {
        QueryImpl<JSONDB> query = new QueryImpl<>();
        query.field("age").equal(age);
        return this.query(query).getItems();
    }

    public void removeByUsername(String username) {
        User user = this.findUserByUsername(username).get(0);
        QueryImpl<JSONDB> query = new QueryImpl<>();
        query.field("name").equal(username);
        super.remove(query);
    }


    public SearchDTO<User> search(UserDTO userDTO) {
        QueryImpl<JSONDB> query = new QueryImpl<>();
        query.field("name").like(userDTO.getName());
        query.field("age").like(userDTO.getAge());
        query.limit(userDTO.getCount());
        return this.query(query);
    }

    @Override
    protected Map<String, Class<?>> childrenConvertMap() {
        Map<String, Class<?>> children = new HashMap<>();
        children.put("userInfor", UserContactInformation.class);
        return children;
    }

    public User findByName(String name) {
        QueryImpl<JSONDB> query = new QueryImpl<>();
        query.field("name").equal(name);
        return this.load(query);
    }

    public void updateUserByID(String uuid, User user) {
        super.update(uuid, user);
    }


    public List<User> findAll() {
        return this.query().getItems();
    }

    @Override
    protected Class<User> getClassConvetor() {
        return User.class;
    }

    @Override
    public void init() {

    }
}
