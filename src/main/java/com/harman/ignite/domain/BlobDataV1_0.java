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

import org.eclipse.ecsp.annotations.EventMapping;
import org.eclipse.ecsp.domain.EventID;
import org.eclipse.ecsp.domain.Version;

/**
 * Blob data v 1.0 class.
 *
 * @deprecated This class is deprecated and will be removed in future releases.
 *     It is present only for backward compatibility with older versions of the system
 *     and should not be used in new implementations.
 *     Use {@link org.eclipse.ignite.domain.BlobDataV1_0} instead.
 */
@Deprecated(
    since = "1.1.2",
    forRemoval = true
)
@SuppressWarnings("checkstyle:TypeName")
@EventMapping(id = EventID.BLOBDATA, version = Version.V1_0)
public class BlobDataV1_0 extends AbstractBlobEventData {

    private static final long serialVersionUID = 2708719978668440521L;

}
