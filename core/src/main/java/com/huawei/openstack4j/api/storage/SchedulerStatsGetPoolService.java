/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
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
package com.huawei.openstack4j.api.storage;

import java.util.List;

import com.huawei.openstack4j.common.RestService;
import com.huawei.openstack4j.openstack.storage.block.domain.VolumeBackendPool;

/**
 * Scheduler Stats Service for Cinder block storage.
 *
 * @author chenguofeng
 */
public interface SchedulerStatsGetPoolService extends RestService {
    /**
     * Lists all Volumes back-end storage pools.
     *
     * @return a list of all Volumes back-end storage pools
     */
    List<? extends VolumeBackendPool> pools();

    List<? extends VolumeBackendPool> poolsDetail();


}
