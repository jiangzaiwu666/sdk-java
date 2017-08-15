/*******************************************************************************
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
package org.openstack4j.openstack.database.domain;

import org.openstack4j.model.ModelEntity;
import org.openstack4j.openstack.trove.domain.ExtendParam;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.ToString;

/**
 * Model represent attributes of Database Backup Creation response
 *
 * @author QianBiao.NG
 * @date   2017-07-31 11:12:39
 */
@Getter
@ToString
public class DatabaseBackupCreateResponse implements ModelEntity {

	private static final long serialVersionUID = 5294355671374520846L;

	DatabaseBackup backup;

	@JsonProperty("extendparam")
	ExtendParam extendParam;
}