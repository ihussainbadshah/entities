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

package org.eclipse.ecsp.key;

import dev.morphia.annotations.Entity;

import java.io.Serializable;


/**
 * Ignite string key.
 */
@Entity
public class IgniteStringKey implements IgniteKey<String>, Serializable {

    /**
     * uid.
     */
    private static final long serialVersionUID = 4506765790446050310L;

    /**
     * key.
     */
    private String key;

    /**
     * Default constructor.
     */
    public IgniteStringKey() {
    }

    /**
     * Initialize with key.
     *
     * @param key : String
     */
    public IgniteStringKey(String key) {
        this.key = key;
    }

    /**
     * get key.
     *
     * @return String
     */
    public String getKey() {
        return key;
    }

    /**
     * set key.
     *
     * @param key : String
     */
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "IgniteStringKey [key=" + key + "]";
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
        IgniteStringKey other = (IgniteStringKey) obj;
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
