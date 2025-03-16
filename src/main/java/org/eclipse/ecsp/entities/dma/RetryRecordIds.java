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
 * This data structure is necessary for DeviceMessagingAgent to keep track of recordIds to be retried.
 *
 * @author avadakkootko
 */
public class RetryRecordIds extends AbstractIgniteEntity {

    private ConcurrentHashSet<String> recordIds;

    /**
     * Default constructor.
     */
    public RetryRecordIds() {
        this.recordIds = new ConcurrentHashSet<>();
    }

    /**
     * Initialize with schemaVersion.
     *
     * @param schemaVersion : Version
     */
    public RetryRecordIds(Version schemaVersion) {
        this.recordIds = new ConcurrentHashSet<>();
        setSchemaVersion(schemaVersion);
    }

    /**
     * Initialize with schemaVersion and recordIds.
     *
     * @param schemaVersion : Version
     *
     * @param recordIds : ConcurrentHashSet{@code <}String{@code >}
     */
    public RetryRecordIds(Version schemaVersion, ConcurrentHashSet<String> recordIds) {
        setSchemaVersion(schemaVersion);
        this.recordIds = recordIds;
    }

    /**
     * get recordIds.
     *
     * @return ConcurrentHashSet{@code <}String{@code >}
     */
    public ConcurrentHashSet<String> getRecordIds() {
        return recordIds;
    }

    /**
     * set record Ids.
     *
     * @param recordIds : ConcurrentHashSet{@code <}String{@code >}
     */
    public void setRecordIds(ConcurrentHashSet<String> recordIds) {
        this.recordIds = recordIds;
    }

    /**
     * Add recordId to the set of recordIds.
     *
     * @param recordId : recordId
     */
    public void addRecordId(String recordId) {
        recordIds.add(recordId);
    }

    /**
     * Delete recordId from the set of recordIds.
     *
     * @param recordId : recordId
     * @return true/false
     */
    public boolean deleteRecordId(String recordId) {
        boolean deleted = false;
        if (recordIds.contains(recordId)) {
            recordIds.remove(recordId);
            deleted = true;
        }
        return deleted;
    }

    @Override
    public String toString() {
        return "RetryRecordIds [schemaVersion=" + getSchemaVersion() + ", recordIds=" + recordIds + "]";
    }

}
