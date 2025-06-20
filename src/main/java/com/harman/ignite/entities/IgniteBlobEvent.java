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

/**
 * This class will be used by the HiveMQ plugin and Protocol Translator
 * to convert embed the data originating from Device.
 *
 * @deprecated This class is deprecated and will be removed in future releases.
 *     It is present only for backward compatibility with older versions of the system
 *     and should not be used in new implementations.
 *     Use {@link org.eclipse.ecsp.entities.IgniteBlobEvent} instead.
 */
@Deprecated(
    since = "1.1.2",
    forRemoval = true
)
public class IgniteBlobEvent extends AbstractIgniteEventBase {

    private static final long serialVersionUID = 699520665348643942L;

    @Override
    public String toString() {
        return "IgniteBlobEvent [getEventId()=" + getEventId() + ", getVersion()="
                + getVersion() + ", getTimestamp()=" + getTimestamp() + ", getEventData()="
                + getEventData() + ", getRequestId()="
                + getRequestId() + ", getSourceDeviceId()=" + getSourceDeviceId()
                + ", getVehicleId()=" + getVehicleId() + "]";
    }
}
