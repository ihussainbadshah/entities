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

import com.harman.ignite.annotations.EventMapping;
import com.harman.ignite.entities.AbstractEventData;
import lombok.EqualsAndHashCode;

/**
 * This class captures the key parameters that needs to be associated with
 * data analytics event which monitors event size etc..
 *
 * @author ashekar
 */
@SuppressWarnings("checkstyle:TypeName")
@EventMapping(id = EventID.DATA_USAGE_EVENT, version = Version.V1_0)
@EqualsAndHashCode
public class DataUsageEventDataV1_0 extends AbstractEventData {

    private static final long serialVersionUID = 8980594756974242470L;

    private String eventName;
    private double payLoadSize;
    private long eventTimestamp;
    private String vehicleId;
    private String deviceId;

    /**
     * get eventName.
     *
     * @return String
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * set event name.
     *
     * @param eventName : String
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * get payload size.
     *
     * @return double
     */
    public double getPayLoadSize() {
        return payLoadSize;
    }

    /**
     * set payload size.
     *
     * @param payLoadSize : double
     */
    public void setPayLoadSize(double payLoadSize) {
        this.payLoadSize = payLoadSize;
    }

    /**
     * get timestamp.
     *
     * @return long
     */
    public long getEventTimestamp() {
        return eventTimestamp;
    }

    /**
     * set timestamp.
     *
     * @param eventTimestamp : long
     */
    public void setEventTimestamp(long eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    /**
     * get vehicleId.
     *
     * @return String
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * set vehicleId.
     *
     * @param vehicleId : String
     */
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * get deviceId.
     *
     * @return String
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set deviceId.
     *
     * @param deviceId : String
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
