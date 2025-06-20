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

import org.eclipse.ecsp.domain.Version;

/**
 * Contract for all events in Ignite.
 *
 * <p>
 * This should not be changed frequently. This is the common abstraction shared
 * by HiveMq-plugin and rest of the system. HiveMQ uses a special FST serializer
 * to serialize the incoming events from device. And any changes to this
 * interface requires recompilation and re-release of HiveMQ. Any attributes
 * that are not relevant to HiveMQ's role in data ingestion and publish to Kafka
 * should be added in {@link org.eclipse.ecsp.entities.IgniteEvent} class.
 * </p>
 *
 * @deprecated This class is deprecated and will be removed in future releases.
 *     It is present only for backward compatibility with older versions of the system
 *     and should not be used in new implementations.
 *     Use {@link org.eclipse.ecsp.entities.IgniteEventBase} instead.
 */
@Deprecated(
    since = "1.1.2",
    forRemoval = true
)
public interface IgniteEventBase extends IgniteEntity {

    /**
     * Identifier for this event.
     *
     * @return EventId
     */
    public String getEventId();

    /**
     * get version.
     *
     * @return Version
     */
    public Version getVersion();

    /**
     * get timestamp.
     *
     * @return long
     */
    public long getTimestamp();

    /**
     * Polymorphic data that varies from one event to another.
     *
     * @return EventData
     */
    // Removing the optional else while deserializing it wont deserialize the
    // actual data. it will just show whether the data is present or not
    public EventData getEventData();

    /**
     * unique across all clients to track messages.
     *
     * @return requestId
     */
    public String getRequestId();

    /**
     * One vehicle (denoted by vehicleId) can have multiple source devices
     * that are talking to the cloud (denoted by deviceId).
     *
     * @return deviceId
     */
    public String getSourceDeviceId();

    /**
     * vehicleId - unique identification of a vehicle.
     *
     * @return vehicleId
     */
    public String getVehicleId();

    /**
     * Returns the distributed tracing context.
     *
     * @return TracingContext
     */
    public String getTracingContext();

    /**
     * Sets the distributed tracing context.
     *
     * @param context : Context
     */
    public void setTracingContext(String context);
}