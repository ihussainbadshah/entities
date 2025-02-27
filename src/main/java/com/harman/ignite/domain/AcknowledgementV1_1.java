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
import com.harman.ignite.utils.Constants;
import lombok.EqualsAndHashCode;

/**
 * Acknowledgement v 1.1 class.
 */
@SuppressWarnings("checkstyle:TypeName")
@EventMapping(id = "Acknowledgement", version = Version.V1_1)
@EqualsAndHashCode
public class AcknowledgementV1_1 extends AbstractEventData {

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
    public AcknowledgementV1_1() {
    }

    /**
     * Initialize with status.
     *
     * @param status : Status
     */
    public AcknowledgementV1_1(Status status) {
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
        return "AcknowledgementV1_1 [status=" + status + "]";
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
