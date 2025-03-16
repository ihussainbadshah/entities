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

import lombok.EqualsAndHashCode;
import org.eclipse.ecsp.annotations.EventMapping;
import org.eclipse.ecsp.entities.AbstractEventData;
import org.eclipse.ecsp.utils.Constants;

/**
 * Acknowledgement v 1 0.
 */
@SuppressWarnings("checkstyle:TypeName")
@EqualsAndHashCode
@EventMapping(id = EventID.ACKNOWLEDGEMENT, version = Version.V1_0)
public class AcknowledgementV1_0 extends AbstractEventData {

    /**
     * version uid.
     */
    private static final long serialVersionUID = -6745785116371883005L;
    
    /**
     * status.
     */
    private Status status;

    /**
     * default constructor.
     */
    public AcknowledgementV1_0() {
    }

    /**
     * Initialize with status.
     *
     * @param status : Status
     */
    public AcknowledgementV1_0(Status status) {
        this.status = status;
    }

    /**
     * get status.
     *
     * @return Status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * set status.
     *
     * @param status : Status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AcknowledgementV1_0 [status=" + status + "]";
    }

    /**
     * The enum Status.
     */
    public enum Status {
        /**
         * Success.
         */
        SUCCESS(Constants.SUCCESS),
        /**
         * Failure.
         */
        FAILURE(Constants.FAILURE),
        /**
         * Custom extension.
         */
        CUSTOM_EXTENSION(Constants.CUSTOM_EXTENSION);
        
        private String value;

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }

}
