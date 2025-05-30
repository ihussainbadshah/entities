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

/**
 * Abstract device status key Class.
 */
public class AbstractDeviceStatusKey {

    private String key;

    /**
     * Default public constructor.
     */
    public AbstractDeviceStatusKey() {
    }

    /**
     * Initialize device status key.
     *
     * @param key : String
     */
    public AbstractDeviceStatusKey(String key) {
        this.key = key;
    }

    /**
     * get value of key.
     *
     * @return String
     */
    public String getKey() {
        return key;
    }

    /**
     * set value of key.
     *
     * @param key : String
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Convert key to device status key.
     *
     * @param key : String
     *
     * @return AbstractDeviceStatusKey
     */
    public AbstractDeviceStatusKey convertFrom(String key) {
        return new AbstractDeviceStatusKey(key);
    }

    /**
     * Convert to string.
     *
     * @return String
     */
    public String convertToString() {
        return key;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key != null) ? key.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AbstractDeviceStatusKey other = (AbstractDeviceStatusKey) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }

}
