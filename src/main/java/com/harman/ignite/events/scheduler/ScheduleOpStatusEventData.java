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

package com.harman.ignite.events.scheduler;

import com.harman.ignite.annotations.EventMapping;
import com.harman.ignite.domain.EventID;
import com.harman.ignite.domain.Version;
import com.harman.ignite.entities.AbstractEventData;
import com.harman.ignite.entities.IgniteEventImpl;
import lombok.EqualsAndHashCode;

/**
 * Class represents the schedule operation status . As of today only create and
 * update are supported. If a service wishes to update their schedule, they need
 * to delete the schedule and again create. This class is used to notify the
 * service regarding the status of the schedule. Also this class carries the
 * "scheduleId" which the services can store in their internal data structure
 * for future reference.
 *
 * @author VKanchepalli
 *
 */
@EventMapping(id = EventID.SCHEDULE_OP_STATUS_EVENT, version = Version.V1_0)
@EqualsAndHashCode
public class ScheduleOpStatusEventData extends AbstractEventData {
    private static final long serialVersionUID = -3736798123313255990L;

    /**
     * id represents schedule event id for setting status.
     */
    private String scheduleId;
    /**
     * Represent the status of the schedule. Either CREATE or DELETE.
     */
    private ScheduleStatus status;
    /**
     * Event for which the status has been triggered (This could be
     * CreateSchedule or DeleteSchedule ).
     */
    private IgniteEventImpl igniteEvent;
    /**
     * Validity of the schedule event.
     */
    private boolean valid;
    /**
     * Error code if the event data is invalid.
     */
    private ScheduleOpStatusErrorCode statusErrorCode;

    /**
     * Default constructor.
     */
    public ScheduleOpStatusEventData() {
        super();
    }

    /**
     * Instantiates a new Schedule op status event data.
     *
     * @param scheduleId
     *         the schedule id
     * @param status
     *         the status
     * @param igniteEvent
     *         the ignite event
     * @param valid
     *         the valid
     */
    public ScheduleOpStatusEventData(String scheduleId, ScheduleStatus status,
            IgniteEventImpl igniteEvent, boolean valid) {
        super();
        this.scheduleId = scheduleId;
        this.status = status;
        this.igniteEvent = igniteEvent;
        this.valid = valid;
    }

    /**
     * This method is a getter for scheduleid.
     *
     * @return String
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * This method is a setter for scheduleid.
     *
     * @param scheduleId : String
     */
    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * This method is a getter for status.
     *
     * @return ScheduleStatus
     */
    public ScheduleStatus getStatus() {
        return status;
    }

    /**
     * This method is a setter for status.
     *
     * @param status : ScheduleStatus
     */
    public void setStatus(ScheduleStatus status) {
        this.status = status;
    }

    /**
     * This method is a getter for igniteevent.
     *
     * @return IgniteEventImpl
     */
    public IgniteEventImpl getIgniteEvent() {
        return igniteEvent;
    }

    /**
     * This method is a setter for igniteevent.
     *
     * @param igniteEvent : IgniteEventImpl
     */
    public void setIgniteEvent(IgniteEventImpl igniteEvent) {
        this.igniteEvent = igniteEvent;
    }

    /**
     * get if event data is valid.
     *
     * @return boolean
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * This method is a setter for valid.
     *
     * @param valid : boolean
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    /**
     * This method is a getter for statuserrorcode.
     *
     * @return ScheduleOpStatusErrorCode
     */
    public ScheduleOpStatusErrorCode getStatusErrorCode() {
        return statusErrorCode;
    }

    /**
     * This method is a setter for statuserrorcode.
     *
     * @param statusErrorCode : ScheduleOpStatusErrorCode
     */
    public void setStatusErrorCode(ScheduleOpStatusErrorCode statusErrorCode) {
        this.statusErrorCode = statusErrorCode;
    }

    @Override
    public String toString() {
        return "ScheduleOpStatusEvent [scheduleId=" + scheduleId + ", ScheduleStatus=" + status
                + ", igniteEvent=" + igniteEvent + ", valid=" + valid
                + ", statusErrorCode=" + statusErrorCode + "]";
    }

    /**
     * The enum Schedule op status error code.
     */
    public enum ScheduleOpStatusErrorCode {
        /**
         * INVALID_CREATE_SCHEDULE_MISSING_FIELDS.
         */
        INVALID_CREATE_SCHEDULE_MISSING_FIELDS,
        /**
         * INVALID_DELETE_SCHEDULE_INVALID_SCHEDULE_ID.
         */
        INVALID_DELETE_SCHEDULE_INVALID_SCHEDULE_ID,
        /**
         * EXPIRED_SCHEDULE.
         */
        EXPIRED_SCHEDULE,
        /**
         * MISSED_SCHEDULE_FIRINGS.
         */
        MISSED_SCHEDULE_FIRINGS;
    }
}