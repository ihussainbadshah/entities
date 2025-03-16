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

package org.eclipse.ecsp.domain;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.EqualsAndHashCode;
import org.eclipse.ecsp.annotations.EventMapping;

/**
 * Dongle status v 1 0 class.
 */
@SuppressWarnings("checkstyle:TypeName")
@EventMapping(id = EventID.DONGLE_STATUS, version = Version.V1_0)
@EqualsAndHashCode
public class DongleStatusV1_0 extends AlertEventData {
    
    /**
     * uid.
     */
    private static final long serialVersionUID = 229465933650377211L;
    
    /**
     * status.
     */
    private DongleStatus status;
    
    /**
     * latitude.
     */
    private double latitude;
    
    /**
     * longitude.
     */
    private double longitude;

    /**
     * get status.
     *
     * @return DongleStatus
     */
    public DongleStatus getStatus() {
        return status;
    }

    /**
     * set dongle status.
     *
     * @param status : DongleStatus
     */
    public void setStatus(DongleStatus status) {
        this.status = status;
    }

    /**
     * get latitude.
     *
     * @return double
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * set latitude.
     *
     * @param latitude : double
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * get longitude.
     *
     * @return double
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * set longitude.
     *
     * @param longitude : double
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "DongleStatusV1_0 [status=" + status + ", latitude=" + latitude
                + ", longitude=" + longitude + "]";
    }

    /**
     * The enum Dongle status.
     */
    public enum DongleStatus {

        /**
         * ATTACHED.
         */
        ATTACHED("attached"),
        /**
         * DETACHED.
         */
        DETACHED("detached");

        /**
         * value.
         */
        private String value;

        /**
         * Private constructor.
         *
         * @param value : String
         */
        private DongleStatus(String value) {
            this.value = value;
        }

        /**
         * get value.
         *
         * @return String
         */
        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }

}
