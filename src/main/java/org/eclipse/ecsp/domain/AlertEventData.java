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
import org.eclipse.ecsp.entities.AbstractEventData;

/**
 * All the event data which is being processed as alerts should have tripid in it.
 *
 * @author avadakkootko
 */
@EqualsAndHashCode
public abstract class AlertEventData extends AbstractEventData {
    
    /**
     * uid.
     */
    private static final long serialVersionUID = -9196480199577811807L;
    
    /**
     * tripid.
     */
    private String tripid;

    /**
     * get tripId.
     *
     * @return String
     */
    public String getTripid() {
        return tripid;
    }

    /**
     * set tripId.
     *
     * @param tripid : String
     */
    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

}
