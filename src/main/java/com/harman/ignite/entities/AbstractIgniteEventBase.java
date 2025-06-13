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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.ecsp.domain.EventAttribute;
import org.eclipse.ecsp.domain.Version;

import java.io.Serializable;

/**
 * Abstract ignite event base class.
 *
 * @deprecated This class is deprecated and will be removed in future releases.
 *     It is present only for backward compatibility with older versions of the system
 *     and should not be used in new implementations.
 *     Use {@link org.eclipse.ignite.entities.AbstractIgniteEventBase} instead.
 */
@Deprecated(
    since = "1.1.2",
    forRemoval = true
)
public class AbstractIgniteEventBase implements IgniteEventBase, Serializable {

    /**
     * version uid.
     */
    protected static final long serialVersionUID = -3920038506977633926L;

    /**
     * get schema version.
     *
     * @return Version
     */
    @JsonIgnore
    @Override
    public Version getSchemaVersion() {
        return version;
    }

    /**
     * set version.
     *
     * @param v : Version
     */
    @Override
    public void setSchemaVersion(Version v) {
        setVersion(v);
    }

    /**
     * eventId.
     */
    @JsonProperty(value = EventAttribute.EVENTID, required = true)
    protected String eventId;

    /**
     * version.
     */
    @JsonProperty(value = EventAttribute.VERSION, required = true)
    protected Version version;

    /**
     * timestamp.
     */
    @JsonProperty(value = EventAttribute.TIMESTAMP, required = true)
    protected long timestamp;

    /**
     * eventData.
     */
    @JsonProperty(value = "Data", required = true)
    protected EventData eventData;

    /**
     * requestId.
     */
    @JsonProperty(value = EventAttribute.REQUEST_ID)
    protected String requestId;

    /**
     * sourceDeviceId.
     */
    @JsonProperty(value = EventAttribute.SOURCE_DEVICE_ID)
    protected String sourceDeviceId;

    /**
     * vehicleId.
     */
    @JsonProperty(value = EventAttribute.VEHICLE_ID)
    protected String vehicleId;

    /**
     * targetDeviceId.
     */
    @JsonIgnore
    @JsonProperty(value = EventAttribute.TARGET_DEVICE_ID)
    protected String targetDeviceId;

    /**
     * tracingContext.
     */
    @JsonProperty(value = EventAttribute.TRC_CTX)
    private String tracingContext;

    /**
     * get eventId.
     *
     * @return String
     */
    @Override
    public String getEventId() {
        return this.eventId;
    }

    /**
     * set eventId.
     *
     * @param eventId : String
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * get version.
     *
     * @return Version
     */
    @Override
    public Version getVersion() {
        return this.version;
    }

    /**
     * set version.
     *
     * @param version : Version
     */
    public void setVersion(Version version) {
        this.version = version;
    }

    /**
     * get timestamp.
     *
     * @return long
     */
    @Override
    public long getTimestamp() {
        return this.timestamp;
    }

    /**
     * set timestamp.
     *
     * @param timestamp : long
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * get eventData.
     *
     * @return EventData
     */
    @Override
    public EventData getEventData() {
        return eventData;
    }

    /**
     * set eventData.
     *
     * @param eventData : EventData
     */
    public void setEventData(EventData eventData) {
        this.eventData = eventData;
    }

    /**
     * get requestId.
     *
     * @return String
     */
    @Override
    public String getRequestId() {
        return requestId;
    }

    /**
     * set requestId.
     *
     * @param requestId : String
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * One vehicle (denoted by vehicleId) can have multiple devices that are talking to the cloud (denoted by deviceId).
     *
     * @return deviceId
     */
    @Override
    public String getSourceDeviceId() {
        return sourceDeviceId;
    }

    /**
     * set value for sourceDeviceId.
     *
     * @param sourceDeviceId : String
     */
    public void setSourceDeviceId(String sourceDeviceId) {
        this.sourceDeviceId = sourceDeviceId;
    }

    /**
     * vehicleId (VIN) - unique identification of a vehicle.
     *
     * @return vehicleId
     */
    @Override
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * Set value for vehicleId.
     *
     * @param vehicleId : String
     */
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * get value for tracing context.
     *
     * @return String
     */
    @Override
    public String getTracingContext() {
        return tracingContext;
    }

    /**
     * set value for tracing context.
     *
     * @param tracingContext : String
     */
    @Override
    public void setTracingContext(String tracingContext) {
        this.tracingContext = tracingContext;
    }

}