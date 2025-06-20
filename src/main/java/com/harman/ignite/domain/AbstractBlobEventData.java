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
import org.eclipse.ecsp.domain.InvalidBlobSourceException;

import java.util.Arrays;

/**
 * Abstract blob event data class.
 *
 * @deprecated This class is deprecated and will be removed in future releases.
 *     It is present only for backward compatibility with older versions of the system
 *     and should not be used in new implementations.
 *     Use {@link org.eclipse.ecsp.domain.AbstractBlobEventData} instead.
 */
@Deprecated(
    since = "1.1.2",
    forRemoval = true
)
@EqualsAndHashCode
public abstract class AbstractBlobEventData extends AbstractEventData {


    /**
     * uid.
     */
    private static final long serialVersionUID = -3736798123313255985L;
    
    /**
     * encoding.
     */
    private Encoding encoding;
    
    /**
     * eventSource.
     */
    private String eventSource;
    
    /**
     * payload.
     */
    private byte[] payload;

    /**
     * Get the type of encoding.
     *
     * @return Encoding
     */
    public Encoding getEncoding() {
        return encoding;
    }

    /**
     * Set the type of encoding.
     *
     * @param encoding : Encoding
     */
    public void setEncoding(Encoding encoding) {
        this.encoding = encoding;
    }

    /**
     * Get the event source.
     *
     * @return String
     */
    public String getEventSource() {
        return eventSource;
    }

    /**
     * Set the event source.
     *
     * @param eventSource : String
     */
    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * Get the payload.
     *
     * @return byte[]
     */
    public byte[] getPayload() {
        return payload;
    }

    /**
     * Set the payload.
     *
     * @param payload : byte[]
     */
    public void setPayload(byte[] payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "AbstractBlobEventData [encoding=" + encoding + ", eventSource="
                + eventSource + ", payload=" + Arrays.toString(payload)
                + "]";
    }

    /**
     * Encoding that can be used.
     */
    public enum Encoding {
        /**
         * GPB.
         */
        GPB("gpb"),
        /**
         * JSON.
         */
        JSON("json");

        private String encode;

        /**
         * Get the type encoding.
         *
         * @return String
         */
        public String getEncode() {
            return encode;
        }

        Encoding(String blobSource) {
            this.encode = blobSource;
        }

        /**
         * Validate.
         *
         * @param encoding
         *         the encoding
         */
        public static void validate(String encoding) {
            boolean flag = true;
            for (Encoding value : Encoding.values()) {
                if (value.getEncode().equals(encoding)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                throw new InvalidBlobSourceException("Invalid blob source : " + encoding + ", provided");
            }
        }
    }
}
