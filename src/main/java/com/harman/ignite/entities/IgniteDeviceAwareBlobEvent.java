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

package com.harman.ignite.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.ecsp.domain.EventAttribute;

/**
 * Ignite device aware blob event class.
 *
 * @deprecated This class is deprecated and will be removed in future releases.
 *     It is present only for backward compatibility with older versions of the system
 *     and should not be used in new implementations.
 *     Use {@link org.eclipse.ecsp.entities.IgniteDeviceAwareBlobEvent} instead.
 */
@Deprecated(
    since = "1.1.2",
    forRemoval = true
)
public class IgniteDeviceAwareBlobEvent extends IgniteBlobEvent implements IgniteDeviceAware {

    /**
     * uid.
     */
    private static final long serialVersionUID = -3920038506977633926L;
    
    /**
     * ecuType.
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = EventAttribute.ECU_TYPE)
    private String ecuType;
    
    /**
     * mqttTopic.
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = EventAttribute.MQTT_TOPIC)
    private String mqttTopic;

    /**
     * Initialize with ecuType and mqttTopic.
     *
     * @param ecuType : String
     *
     * @param mqttTopic : String
     */
    public IgniteDeviceAwareBlobEvent(String ecuType, String mqttTopic) {
        this.ecuType = ecuType;
        this.mqttTopic = mqttTopic;
    }

    /**
     * get ecuType.
     *
     * @return String
     */
    @Override
    public String getEcuType() {
        return ecuType;
    }

    /**
     * set ecuType.
     *
     * @param ecuType : String
     */
    public void setEcuType(String ecuType) {
        this.ecuType = ecuType;
    }

    /**
     * get mqttTopic.
     *
     * @return String
     */
    @Override
    public String getMqttTopic() {
        return mqttTopic;
    }

    /**
     * set mqttTopic.
     *
     * @param mqttTopic : String
     */
    public void setMqttTopic(String mqttTopic) {
        this.mqttTopic = mqttTopic;
    }

    @Override
    public String toString() {
        return "IgniteDeviceAwareBlobEvent [ecuType=" + ecuType
                + ", mqttTopic=" + mqttTopic + ", eventId=" + eventId
                + ", version=" + version + ", timestamp=" + timestamp
                + ", eventData=" + eventData + ", requestId=" + requestId
                + ", sourceDeviceId=" + sourceDeviceId + ", vehicleId=" + vehicleId
                + ", targetDeviceId=" + targetDeviceId + "]";
    }

}
