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

package org.eclipse.ecsp.entities.dma;

import org.eclipse.ecsp.domain.Version;
import org.eclipse.ecsp.entities.AbstractIgniteEntity;
import org.eclipse.ecsp.utils.ConcurrentHashSet;

/**
 * This class is reponsible for Managing the Mapping between vehicleId and deviceId.
 * One vehicleId can have multiple deviceIds.
 *
 * @author avadakkootko
 */
public class VehicleIdDeviceIdMapping extends AbstractIgniteEntity {

    /**
     * default constructor.
     */
    public VehicleIdDeviceIdMapping() {
        this.deviceIds = new ConcurrentHashSet<>();
        setSchemaVersion(Version.V1_0);
    }

    /**
     * Constructor with version.
     *
     * @param schemaVersion : Version
     */
    public VehicleIdDeviceIdMapping(Version schemaVersion) {
        this.deviceIds = new ConcurrentHashSet<>();
        setSchemaVersion(schemaVersion);
    }

    /**
     * Constructor with version. and deviceIds.
     *
     * @param schemaVersion : Version
     *
     * @param deviceIds : ConcurrentHashSet{@code <}String{@code >}
     */
    public VehicleIdDeviceIdMapping(Version schemaVersion, ConcurrentHashSet<String> deviceIds) {
        setSchemaVersion(schemaVersion);
        this.deviceIds = deviceIds;
    }

    /**
     * deviceIds.
     */
    private ConcurrentHashSet<String> deviceIds;

    /**
     * get deviceIds.
     *
     * @return ConcurrentHashSet{@code <}String{@code >}
     */
    public ConcurrentHashSet<String> getDeviceIds() {
        return deviceIds;
    }

    /**
     * set device Ids.
     *
     * @param deviceIds : ConcurrentHashSet{@code <}String{@code >}
     */
    public void setDeviceIds(ConcurrentHashSet<String> deviceIds) {
        this.deviceIds = deviceIds;
    }

    /**
     * Add deviceId to the set of deviceIds.
     *
     * @param deviceId : deviceId
     */
    public void addDeviceId(String deviceId) {
        deviceIds.add(deviceId);
    }

    /**
     * Remove deviceId from the set of deviceIds.
     *
     * @param deviceId : deviceId
     * @return : true/false
     */
    public boolean deleteDeviceId(String deviceId) {
        boolean deleted = false;
        if (deviceIds.contains(deviceId)) {
            deviceIds.remove(deviceId);
            deleted = true;
        }
        return deleted;
    }

    @Override
    public String toString() {
        return "VehicleIdDeviceIdMapping [schemaVersion="
                + getSchemaVersion() + ", deviceIds=" + deviceIds + "]";
    }

}
