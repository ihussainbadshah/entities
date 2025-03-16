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

package org.eclipse.ecsp.entity.scheduler;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import org.eclipse.ecsp.entities.AbstractIgniteEntity;
import org.eclipse.ecsp.entities.IgniteEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * ScheduleEntry class for CreateScheduleEvent Class.
 * This Class stores the schedule information to DB.
 *
 * @author VKanchepalli
 */
@Entity("scheduleEntries")
public class ScheduleEntry extends AbstractIgniteEntity {

    /**
     * set Random UUID as scheduleId.
     */
    @Id
    private String scheduleId = UUID.randomUUID().toString();

    /*
     * vehicleId of the create schedule event
     */
    private String vehicleId;

    /*
     * set schedule event
     */
    private IgniteEvent event;

    /*
     * no of times to fire event
     */
    private int firedCount;

    /*
     * created date in milliseconds
     */
    private long createDts;

    /*
     * last updated date in milliseconds
     */
    private long updateDts;

    /*
     * deleted date in milliseconds
     */
    private long deleteDts;

    /*
     * list of firing entries
     */
    private List<Firing> firings = new ArrayList<>();

    /*
     * flag to indicate if schedule is deleted or not
     */
    private boolean deleteStatus = false;

    // RTC 162924
    /**
     * taskId represents the 'taskId' of the Kafka Stream thread that
     * processed the CreateScheduleEvent for this ScheduleEntry. On Scheduler
     * Stream Processor start up or restart or on rebalance of Kafka Streams
     * (results from upscale/downscale of K8 POD replica), this taskId
     * is used to bootstrap schedules per task basis. This enables uniform
     * distribution of schedules across all the available POD replicas
     * at any point in time, thus supporting high availability.
     */
    private String taskId;

    // RTC 165474
    /**
     * Represents the last time the caller service is notified about a missed
     * firing of this schedule. This is used to track that status
     * notification is sent only once in case of multiple re-balance of Kafka
     * Streams (results from upscale/downscale of K8 POD replica).
     */
    private long lastMissedFiringNotificationDts;

    /**
     * Default constructor.
     */
    public ScheduleEntry() {
        super();
    }

    /**
     * Instantiates a new Schedule entry.
     *
     * @param vehicleId
     *         the vehicle id
     * @param event
     *         the event
     * @param firedCount
     *         the fired count
     * @param createDts
     *         the create dts
     * @param updateDts
     *         the update dts
     * @param taskId
     *         the task id
     */
    public ScheduleEntry(String vehicleId, IgniteEvent event,
            int firedCount, long createDts, long updateDts, String taskId) {
        this.vehicleId = vehicleId;
        this.event = event;
        this.firedCount = firedCount;
        this.createDts = createDts;
        this.updateDts = updateDts;
        this.taskId = taskId;
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
     * This method is a setter for scheduleid.
     *
     * @param id : String
     *
     * @return ScheduleEntry
     */
    public ScheduleEntry setScheduleIdId(String id) {
        this.scheduleId = id;
        return this;

    }

    /**
     * This method is a getter for vehicleid.
     *
     * @return String
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * This method is a setter for vehicleid.
     *
     * @param vehicleId : String
     */
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * This method is a getter for event.
     *
     * @return IgniteEvent
     */
    public IgniteEvent getEvent() {
        return event;
    }

    /**
     * This method is a setter for event.
     *
     * @param event : IgniteEvent
     */
    public void setEvent(IgniteEvent event) {
        this.event = event;
    }

    /**
     * This method is a getter for firedcount.
     *
     * @return int
     */
    public int getFiredCount() {
        return firedCount;
    }

    /**
     * This method is a setter for firedcount.
     *
     * @param firedCount : int
     * @return ScheduleEntry
     */
    public ScheduleEntry setFiredCount(int firedCount) {
        this.firedCount = firedCount;
        return this;
    }

    /**
     * This method is a getter for createdts.
     *
     * @return long
     */
    public long getCreateDts() {
        return createDts;
    }

    /**
     * This method is a setter for createdts.
     *
     * @param createDts : long
     * @return ScheduleEntry
     */
    public ScheduleEntry setCreateDts(long createDts) {
        this.createDts = createDts;
        return this;
    }

    /**
     * This method is a getter for updatedts.
     *
     * @return long
     */
    public long getUpdateDts() {
        return updateDts;
    }

    /**
     * This method is a setter for updatedts.
     *
     * @param updateDts : long
     * @return ScheduleEntry
     */
    public ScheduleEntry setUpdateDts(long updateDts) {
        this.updateDts = updateDts;
        return this;
    }

    /**
     * This method is a getter for deletedts.
     *
     * @return long
     */
    public long getDeleteDts() {
        return deleteDts;
    }

    /**
     * This method is a setter for deletedts.
     *
     * @param deleteDts : long
     */
    public void setDeleteDts(long deleteDts) {
        this.deleteDts = deleteDts;
    }

    /**
     * This method is a getter for firings.
     *
     * @return List
     */
    public List<Firing> getFirings() {
        return firings;
    }

    /**
     * This method is a setter for firings.
     *
     * @param firings : List
     */
    public void setFirings(List<Firing> firings) {
        this.firings = firings;
    }

    /**
     * get delete status flag.
     *
     * @return boolean
     */
    public boolean isDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method is a setter for deletestatus.
     *
     * @param deleteStatus : boolean
     */
    public void setDeleteStatus(boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method is a getter for taskid.
     *
     * @return String
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * This method is a setter for taskid.
     *
     * @param taskId : String
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * This method is a getter for lastmissedfiringnotificationdts.
     *
     * @return long
     */
    public long getLastMissedFiringNotificationDts() {
        return lastMissedFiringNotificationDts;
    }

    /**
     * This method is a setter for lastmissedfiringnotificationdts.
     *
     * @param lastMissedFiringNotificationDts : long
     */
    public void setLastMissedFiringNotificationDts(long lastMissedFiringNotificationDts) {
        this.lastMissedFiringNotificationDts = lastMissedFiringNotificationDts;
    }

    @Override
    public String toString() {
        return "ScheduleEntry [scheduleId=" + scheduleId + ", vehicleId=" + vehicleId
                + ", event=" + event + ", firedCount=" + firedCount
                + ", createDts=" + createDts + ", updateDts=" + updateDts
                + ", deleteDts=" + deleteDts + ", firings=" + firings
                + ", deleteStatus=" + deleteStatus + ", taskId=" + taskId
                + ", lastMissedFiringNotificationDts=" + lastMissedFiringNotificationDts + "]";
    }

}