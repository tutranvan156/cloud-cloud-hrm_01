/*****************************************************************
 Copyright 2013 by Duyen Tang (tttduyen@inetcloud.vn)

 Licensed under the iNet Solutions Corp.,;
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.inetcloud.vn/licenses

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 *****************************************************************/
package com.inet.hrm.provider;

import com.inet.xportal.nosql.web.provider.CloudConfigAbstraction;
import com.inet.xportal.nosql.web.provider.NoSQLConfigProviderAbstraction;
import com.inet.xportal.web.context.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * NoSqlProcDatabaseProvider.
 *
 * @author Duyen Tang
 * @version $Id: NoSqlProcDatabaseProvider.java 2013-06-12 12:08:50z tttduyen $
 * @since 1.0
 */
@ApplicationContext(context = "CloudHRMNoSqlProvider")
@Named("NoSqlIProcDatabaseProvider")
public class NoSqlCloudHRMDatabaseProvider extends NoSQLConfigProviderAbstraction {
    @Inject
    public NoSqlCloudHRMDatabaseProvider(@ApplicationContext(context = "NoSqlCloudHRMConfig") CloudConfigAbstraction cloudCfg) {
        super(cloudCfg);
    }

    @Override
    public boolean contextEnabled() {
        return false;
    }
}