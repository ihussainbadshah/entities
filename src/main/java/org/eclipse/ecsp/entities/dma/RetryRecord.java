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

import org.eclipse.ecsp.entities.AbstractIgniteEntity;
import org.eclipse.ecsp.key.IgniteKey;

import java.util.Map;

/**
 * This data structure keeps track of the meta info of the event
 * that needs to be retried, including how many times the retry has been
 * attempted.
 *
 * @author avadakkootko
 */
public class RetryRecord extends AbstractIgniteEntity {
    
    /**
     * ignitkey.
     */
    private IgniteKey<?> igniteKey;

    /**
     * deviceMessage.
     */
    private DeviceMessage deviceMessage;

    /**
     * attempts.
     */
    private int attempts;

    /**
     * lastRetryTimestamp.
     */
    private long lastRetryTimestamp;

    /**
     * extraParameters.
     */
    private Map<String, Object> extraParameters;

    /**
     * Default constructor.
     */
    public RetryRecord() {
    }

    /**
     * Instantiates a new Retry record.
     *
     * @param igniteKey
     *         the ignite key
     * @param deviceMessage
     *         the device message
     * @param lastRetryTimestamp
     *         the last retry timestamp
     */
    public RetryRecord(IgniteKey<?> igniteKey, DeviceMessage deviceMessage, long lastRetryTimestamp) {
        super();
        this.igniteKey = igniteKey;
        this.deviceMessage = deviceMessage;
        this.lastRetryTimestamp = lastRetryTimestamp;
        attempts = 0;
    }

    /**
     * This method is a getter for ignitekey.
     *
     * @return IgniteKey
     */
    public IgniteKey<?> getIgniteKey() {
        return igniteKey;
    }

    /**
     * This method is a setter for ignitekey.
     *
     * @param igniteKey : IgniteKey{@code <}?{@code >}
     */
    public void setIgniteKey(IgniteKey<?> igniteKey) {
        this.igniteKey = igniteKey;
    }

    /**
     * This method is a getter for devicemessage.
     *
     * @return DeviceMessage
     */
    public DeviceMessage getDeviceMessage() {
        return deviceMessage;
    }

    /**
     * This method is a setter for devicemessage.
     *
     * @param deviceMessage : DeviceMessage
     */
    public void setDeviceMessage(DeviceMessage deviceMessage) {
        this.deviceMessage = deviceMessage;
    }

    /**
     * This method is a getter for attempts.
     *
     * @return int
     */
    public int getAttempts() {
        return attempts;
    }

    /**
     * This method is a setter for attempts.
     *
     * @param attempts : int
     */
    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    /**
     * This method is a getter for lastretrytimestamp.
     *
     * @return long
     */
    public long getLastRetryTimestamp() {
        return lastRetryTimestamp;
    }

    /**
     * This method is a setter for lastretrytimestamp.
     *
     * @param lastRetryTimestamp : long
     */
    public void setLastRetryTimestamp(long lastRetryTimestamp) {
        this.lastRetryTimestamp = lastRetryTimestamp;
    }

    /**
     * This method is to add lastRetryTimestamp.
     *
     * @param lastRetryTimestamp : long
     */
    public void addAttempt(long lastRetryTimestamp) {
        attempts++;
        this.lastRetryTimestamp = lastRetryTimestamp;
    }

    /**
     * This method is a getter for extraparameters.
     *
     * @return Map{@code <}String{@code >}{@code <}Object{@code >}
     */
    public Map<String, Object> getExtraParameters() {
        return extraParameters;
    }

    /**
     * This method is a setter for extraparameters.
     *
     * @param extraParameters : Map{@code <}String{@code >}{@code <}String{@code >}
     */
    public void setExtraParameters(Map<String, Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    @Override
    public String toString() {
        return "RetryRecord [igniteKey=" + igniteKey + ", deviceMessage="
                + deviceMessage + ", attempts=" + attempts
                + ", lastRetryTimestamp=" + lastRetryTimestamp + ", version="
                +  getSchemaVersion() + ", extraParameters=" + extraParameters + "]";
    }

}