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

/**
 * The interface Ignite device aware.
 *
 * @deprecated This class is deprecated and will be removed in future releases.
 *     It is present only for backward compatibility with older versions of the system
 *     and should not be used in new implementations.
 *     Use {@link org.eclipse.ignite.entities.IgniteDeviceAware} instead.
 *
 * @author MaKumari
 */
@Deprecated(
    since = "1.1.2",
    forRemoval = true
)
public interface IgniteDeviceAware {

    /**
     * Type of ecu.
     *
     * @return EcuType
     */
    public String getEcuType();

    /**
     * Mqtt topic from where message is received from client.
     *
     * @return mqttTopic
     */
    public String getMqttTopic();

}
