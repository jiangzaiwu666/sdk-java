/*******************************************************************************
 * 	Copyright 2018 Huawei Technologies Co., Ltd.                                     
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.openstack.scaling.internal;

import static com.google.common.base.Preconditions.*;

import java.util.List;

import com.google.common.base.Strings;

import com.huawei.openstack4j.api.scaling.AutoScalingQuotaService;
import com.huawei.openstack4j.openstack.common.Quota;
import com.huawei.openstack4j.openstack.common.Quota.Quotas;

public class AutoScalingQuotaServiceImpl extends BaseAutoScalingServices implements AutoScalingQuotaService {

	@Override
	public List<Quota> list() {
		return get(Quotas.class, uri("/quotas")).execute().getList();
	}

	@Override
	public List<Quota> list(String groupId) {
		checkArgument(!Strings.isNullOrEmpty(groupId), "groupId required");
		return get(Quotas.class, uri("/quotas/%s", groupId)).execute().getList();
	}
}
