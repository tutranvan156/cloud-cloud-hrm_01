package com.inet.hrm.provider;

import com.inet.xportal.nosql.web.bo.AbstractPairValueBO;
import com.inet.xportal.nosql.web.provider.CloudConfigAbstraction;
import com.inet.xportal.web.context.ApplicationContext;
import com.inet.xportal.web.context.ContentContext;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * NoSqlDatabaseConfig.
 *
 * @author thoangtd
 * @version $$Id: NoSqlDatabaseConfig 8/16/16 10:08 AM thoangtd $$
 * @since 1.0
 */
@ApplicationContext(context = "NoSqlCloudHRMConfig")
@Named("NoSqlIProcDatabaseConfig")
@Singleton
public class CloudHRMDatabaseConfig extends CloudConfigAbstraction {
    //Change Tham so, resources/properties file
    @Inject
    public CloudHRMDatabaseConfig(@ContentContext(context = "CloudPairValue") AbstractPairValueBO pairValueBO) {
        super(pairValueBO, "hrm-app-config", "cloud-db-hrm.properties");
    }
}
