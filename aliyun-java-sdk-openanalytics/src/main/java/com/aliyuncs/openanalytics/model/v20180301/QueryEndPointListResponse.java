/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.openanalytics.model.v20180301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openanalytics.transform.v20180301.QueryEndPointListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEndPointListResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private List<EndPointListItem> endPointList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<EndPointListItem> getEndPointList() {
		return this.endPointList;
	}

	public void setEndPointList(List<EndPointListItem> endPointList) {
		this.endPointList = endPointList;
	}

	public static class EndPointListItem {

		private String endPointID;

		private String zone;

		private String vSwitch;

		private String status;

		private String vpcID;

		private String host;

		private String domainURL;

		private String networkType;

		private String allowIP;

		private String port;

		private String cloudInstanceID;

		public String getEndPointID() {
			return this.endPointID;
		}

		public void setEndPointID(String endPointID) {
			this.endPointID = endPointID;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}

		public String getVSwitch() {
			return this.vSwitch;
		}

		public void setVSwitch(String vSwitch) {
			this.vSwitch = vSwitch;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVpcID() {
			return this.vpcID;
		}

		public void setVpcID(String vpcID) {
			this.vpcID = vpcID;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getDomainURL() {
			return this.domainURL;
		}

		public void setDomainURL(String domainURL) {
			this.domainURL = domainURL;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getAllowIP() {
			return this.allowIP;
		}

		public void setAllowIP(String allowIP) {
			this.allowIP = allowIP;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getCloudInstanceID() {
			return this.cloudInstanceID;
		}

		public void setCloudInstanceID(String cloudInstanceID) {
			this.cloudInstanceID = cloudInstanceID;
		}
	}

	@Override
	public QueryEndPointListResponse getInstance(UnmarshallerContext context) {
		return	QueryEndPointListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
