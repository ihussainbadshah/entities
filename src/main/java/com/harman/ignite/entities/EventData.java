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

import dev.morphia.annotations.Entity;

/**
 * This interface is embedded in IgniteEvent.
 *
 * @deprecated This class is deprecated and will be removed in future releases.
 *     It is present only for backward compatibility with older versions of the system
 *     and should not be used in new implementations.
 *     Use {@link org.eclipse.ecsp.entities.EventData} instead.
 *
 * @author avadakkootko
 *
 *         It represents the Data in Ignite event specification.
 *
 *         Example: Sample dongle status event looks like as follows:
 *
 *         "{"EventID": "DongleStatus","Version: "1.0","Data": { "status": "attached",
 *         "latitude": 42.2363501, "longitude": -87.9428014 }}"
 *         ;
 *
 *         In the above event EventData is "Data": { "status":"attached",
 *         "latitude": 42.2363501, "longitude": -87.9428014 }
 *
 *         Using @JsonRootName annotation during serialization the entire thing
 *         will be wrapped under Data
 */
@Deprecated(
    since = "1.1.2",
    forRemoval = true
)
@Entity
public interface EventData {

}
