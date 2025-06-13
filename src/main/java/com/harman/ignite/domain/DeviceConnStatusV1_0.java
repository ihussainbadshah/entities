/*
 * *******************************************************************************
 *
 *  Copyright (c) 2023-24 Harman International
 *
 *
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *
 *  you may not use this file except in compliance with the License.
 *
 *  You may obtain a copy of the License at
 *
 *
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *       
 *
 *  Unless required by applicable law or agreed to in writing, software
 *
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *  See the License for the specific language governing permissions and
 *
 *  limitations under the License.
 *
 *
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  *******************************************************************************
 */

package com.harman.ignite.domain;

import com.harman.ignite.entities.AbstractEventData;
import lombok.EqualsAndHashCode;
import org.eclipse.ecsp.annotations.EventMapping;
import org.eclipse.ecsp.domain.EventID;
import org.eclipse.ecsp.domain.Version;

/**
 * Device conn status v 1.0 class.
 *
 * @deprecated This class is deprecated and will be removed in future releases.
 *     It is present only for backward compatibility with older versions of the system
 *     and should not be used in new implementations.
 *     Use {@link org.eclipse.ecsp.domain.DeviceConnStatusV1_0} instead.
 */
@Deprecated(
    since = "1.1.2",
    forRemoval = true
)
@SuppressWarnings("checkstyle:TypeName")
@EventMapping(id = EventID.DEVICE_CONN_STATUS, version = Version.V1_0)
@EqualsAndHashCode
public class DeviceConnStatusV1_0 extends AbstractEventData {

    /**
     * uid.
     */
    private static final long serialVersionUID = -8185364560878375079L;
    
    /**
     * serviceName.
     */
    private String serviceName;
    
    /**
     * connStatus.
     */
    private ConnectionStatus connStatus;

    /**
     * get service name.
     *
     * @return String
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * set service name.
     *
     * @param serviceName : String
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * get connection status.
     *
     * @return ConnectionStatus
     */
    public ConnectionStatus getConnStatus() {
        return connStatus;
    }

    /**
     * set connection status.
     *
     * @param connStatus : ConnectionStatus
     */
    public void setConnStatus(ConnectionStatus connStatus) {
        this.connStatus = connStatus;
    }

    @Override
    public String toString() {
        return "DeviceConnStatusV1_0 [serviceName=" + serviceName + ", connStatus=" + connStatus + "]";
    }

    /**
     * The enum Connection status.
     */
    public enum ConnectionStatus {
        /**
         * Active.
         */
        ACTIVE("ACTIVE"),
        /**
         * Inactive.
         */
        INACTIVE("INACTIVE");

        private String connStatus;

        ConnectionStatus(String connStatus) {
            this.connStatus = connStatus;
        }

        /**
         * get connection status.
         *
         * @return String
         */
        public String getConnectionStatus() {
            return connStatus;
        }
    }

}
