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

/**
 * Event id.
 */
public class EventID {
    private EventID() {
    }


    /**
     * BLOBDATA.
     */
    public static final String BLOBDATA = "BlobData";

    /**
     * ALLTMCEVENTS.
     */
    public static final String ALLTMCEVENTS = "AllTMCEvents";


    /**
     * APPSALARM.
     */
    public static final String APPSALARM = "AppsAlarm";


    /**
     * AUDIOACTIVESOURCE.
     */
    public static final String AUDIOACTIVESOURCE = "AudioActiveSource";


    /**
     * AUDIOPLAYSTATECHANGE.
     */
    public static final String AUDIOPLAYSTATECHANGE = "AudioPlayStateChange";


    /**
     * AUDIORANDOMMODECHANGE.
     */
    public static final String AUDIORANDOMMODECHANGE = "AudioRandomModeChange";


    /**
     * AUDIOREPEATMODECHANGE.
     */
    public static final String AUDIOREPEATMODECHANGE = "AudioRepeatModeChange";


    /**
     * AUDIOTRACKCHANGE.
     */
    public static final String AUDIOTRACKCHANGE = "AudioTrackChange";


    /**
     * AVAILABLEAUDIOSOURCE.
     */
    public static final String AVAILABLEAUDIOSOURCE = "AvailableAudioSource";


    /**
     * BTCALLSTATE.
     */
    public static final String BTCALLSTATE = "BTCallState";


    /**
     * BTCONNECTED.
     */
    public static final String BTCONNECTED = "BTConnected";


    /**
     * BTCONTACTSYNCSTATUS.
     */
    public static final String BTCONTACTSYNCSTATUS = "BTContactSyncStatus";


    /**
     * BTDISCONNECTED.
     */
    public static final String BTDISCONNECTED = "BTDisConnected";


    /**
     * BTDISCONNECTED2.
     */
    public static final String BTDISCONNECTED2 = "BTDisconnected";


    /**
     * BTHANDSFREEMODE.
     */
    public static final String BTHANDSFREEMODE = "BTHandsFreeMode";


    /**
     * BTPAIRINGSTATUS.
     */
    public static final String BTPAIRINGSTATUS = "BTPairingStatus";


    /**
     * BTPHONEBATTERYCHARGE.
     */
    public static final String BTPHONEBATTERYCHARGE = "BTPhoneBatteryCharge";


    /**
     * BTPHONENETWORKOPERATOR.
     */
    public static final String BTPHONENETWORKOPERATOR = "BTPhoneNetworkOperator";


    /**
     * BTPHONENETWORKREGSTATE.
     */
    public static final String BTPHONENETWORKREGSTATE = "BTPhoneNetworkRegState";


    /**
     * BTPHONESIGNALQUALITY.
     */
    public static final String BTPHONESIGNALQUALITY = "BTPhoneSignalQuality";


    /**
     * BTPICTURESYNCSTATUS.
     */
    public static final String BTPICTURESYNCSTATUS = "BTPictureSyncStatus";


    /**
     * BTSMSSYNCSTATUS.
     */
    public static final String BTSMSSYNCSTATUS = "BTSMSSyncStatus";


    /**
     * CPUUSAGE.
     */
    public static final String CPUUSAGE = "CpuUsage";


    /**
     * CURRENTTIMEZONE.
     */
    public static final String CURRENTTIMEZONE = "CurrentTimeZone";


    /**
     * DBOVERLIMIT.
     */
    public static final String DBOVERLIMIT = "DBOverLimit";


    /**
     * DTC.
     */
    public static final String DTC = "Dtc";


    /**
     * DONGLE_STATUS.
     */
    public static final String DONGLE_STATUS = "DongleStatus";


    /**
     * ECALL.
     */
    public static final String ECALL = "Ecall";


    /**
     * HARDKEYPRESS.
     */
    public static final String HARDKEYPRESS = "HardKeyPress";


    /**
     * HCPCLIENTLAUNCHED.
     */
    public static final String HCPCLIENTLAUNCHED = "HCPClientLaunched";


    /**
     * HDSTATIONCHANGE.
     */
    public static final String HDSTATIONCHANGE = "HDStationChange";


    /**
     * HMISTARTUP.
     */
    public static final String HMISTARTUP = "hmiStartup";


    /**
     * HUHARDRESET.
     */
    public static final String HUHARDRESET = "HUHardReset";


    /**
     * HVACZONE.
     */
    public static final String HVACZONE = "HVACZone";


    /**
     * IGNSTATUS.
     */
    public static final String IGNSTATUS = "IgnStatus";


    /**
     * INTERNETCONNECTED.
     */
    public static final String INTERNETCONNECTED = "InternetConnected";


    /**
     * INTERNETDISCONNECTED.
     */
    public static final String INTERNETDISCONNECTED = "InternetDisconnected";


    /**
     * KPI.
     */
    public static final String KPI = "KPI";


    /**
     * LAUNCHSMSDICTATION.
     */
    public static final String LAUNCHSMSDICTATION = "LaunchSMSDictation";


    /**
     * LOCATION.
     */
    public static final String LOCATION = "Location";


    /**
     * MEDIADEVICESTATE.
     */
    public static final String MEDIADEVICESTATE = "MediaDeviceState";


    /**
     * MEMORYUSAGE.
     */
    public static final String MEMORYUSAGE = "MemoryUsage";


    /**
     * MMSOURCE.
     */
    public static final String MMSOURCE = "MmSource";


    /**
     * NADREGSTATE.
     */
    public static final String NADREGSTATE = "NADRegState";


    /**
     * APPPLAYBACK.
     */
    public static final String APPPLAYBACK = "AppPlayback";


    /**
     * NAVDESTINATIONINFO.
     */
    public static final String NAVDESTINATIONINFO = "NavDestinationInfo";


    /**
     * NAVIGATIONROUTECALC.
     */
    public static final String NAVIGATIONROUTECALC = "NavigationRouteCall";


    /**
     * NEWSMS.
     */
    public static final String NEWSMS = "NewSMS";


    /**
     * NOWPLAYING.
     */
    public static final String NOWPLAYING = "NowPlaying";


    /**
     * ODOMETER.
     */
    public static final String ODOMETER = "Odometer";


    /**
     * ONROUTETMCEVENTS.
     */
    public static final String ONROUTETMCEVENTS = "OnRouteTMCEvents";


    /**
     * PHONEBOOKSTATUS.
     */
    public static final String PHONEBOOKSTATUS = "PhonebookStatus";


    /**
     * PIMOBJECTSYNCSTATE.
     */
    public static final String PIMOBJECTSYNCSTATE = "PIMObjectSyncState";


    /**
     * PRNDSTATUS.
     */
    public static final String PRNDSTATUS = "Prndstatus";


    /**
     * PROCESSDIED.
     */
    public static final String PROCESSDIED = "ProcessDied";


    /**
     * REARCAMERASTATUS.
     */
    public static final String REARCAMERASTATUS = "RearCameraStatus";


    /**
     * REMOTEOPSSMS.
     */
    public static final String REMOTEOPSSMS = "RemoteOpsSMS";


    /**
     * RPM.
     */
    public static final String RPM = "RPM";


    /**
     * SCREENTRANSITION.
     */
    public static final String SCREENTRANSITION = "ScreenTransition";


    /**
     * SESSIONSTATUS.
     */
    public static final String SESSIONSTATUS = "SessionStatus";


    /**
     * SETTINGSUPDATE.
     */
    public static final String SETTINGSUPDATE = "SettingsUpdate";


    /**
     * SPEED.
     */
    public static final String SPEED = "Speed";


    /**
     * DEVICEMESSAGEFAILURE.
     */
    public static final String DEVICEMESSAGEFAILURE = "DeviceMessageFailure";


    /**
     * STATIONCHANGE.
     */
    public static final String STATIONCHANGE = "StationChange";


    /**
     * SYSTEMSNAPSHOT.
     */
    public static final String SYSTEMSNAPSHOT = "SystemSnapshot";


    /**
     * THIRDPARTYAPPSTATUS.
     */
    public static final String THIRDPARTYAPPSTATUS = "ThirdPartyAppStatus";


    /**
     * TOUCHSCREENPRESS.
     */
    public static final String TOUCHSCREENPRESS = "TouchScreenPress";


    /**
     * UPLOADSTATUS.
     */
    public static final String UPLOADSTATUS = "UploadStatus";


    /**
     * VRAVAILABLE.
     */
    public static final String VRAVAILABLE = "VrAvailable";


    /**
     * VRDIALOGACTIVE.
     */
    public static final String VRDIALOGACTIVE = "VrDialogActive";


    /**
     * VRMICSTATE.
     */
    public static final String VRMICSTATE = "VrMicState";


    /**
     * VRSTATUS.
     */
    public static final String VRSTATUS = "VrStatus";


    /**
     * XMADVISORYMSG.
     */
    public static final String XMADVISORYMSG = "XMAdvisoryMsg";


    /**
     * XMAPPSTATUS.
     */
    public static final String XMAPPSTATUS = "XMAppStatus";


    /**
     * XMSIGNALSTRENGTH.
     */
    public static final String XMSIGNALSTRENGTH = "XMSignalStrength";


    /**
     * XMSTATIONCHANGE.
     */
    public static final String XMSTATIONCHANGE = "XMStationChange";


    /**
     * PHONENETWORKREGSTATE.
     */
    public static final String PHONENETWORKREGSTATE = "BTPhoneNetworkRegState";


    /**
     * BTEMAILSYNCSTATUS.
     */
    public static final String BTEMAILSYNCSTATUS = "BTEmailSyncStatus";


    /**
     * BTCALENDARSYNCSTATUS.
     */
    public static final String BTCALENDARSYNCSTATUS = "BTCalendarSyncStatus";


    /**
     * BTTASKSSYNCSTATUS.
     */
    public static final String BTTASKSSYNCSTATUS = "BTTasksSyncStatus";


    /**
     * BTNOTESSYNCSTATUS.
     */
    public static final String BTNOTESSYNCSTATUS = "BTNotesSyncStatus";


    /**
     * BTCALLISTSYNCSTATUS.
     */
    public static final String BTCALLISTSYNCSTATUS = "BTCalllistSyncStatus";

    // Acknowledgement

    /**
     * ACKNOWLEDGEMENT.
     */
    public static final String ACKNOWLEDGEMENT = "Acknowledgement";

    // BMW Specific Events

    /**
     * BMW_INTERNAL_CONN_LABEL.
     */
    public static final String BMW_INTERNAL_CONN_LABEL = "BMW_Internal_Conn_Label";


    /**
     * BMW_INTERNAL_LABEL.
     */
    public static final String BMW_INTERNAL_LABEL = "BMW_Internal_Label";


    /**
     * BMW_INTERNAL_VIN.
     */
    public static final String BMW_INTERNAL_VIN = "BMW_Internal_VIN";
    // Subaru VR Events

    /**
     * VRSESSIONSUMMARY.
     */
    public static final String VRSESSIONSUMMARY = "VrSessionSummary";
    // Porsche drive mode events

    /**
     * DRIVEMODE.
     */
    public static final String DRIVEMODE = "DriveMode";

    // ProjectionMode events for Orinoco

    /**
     * PROJECTIONMODE.
     */
    public static final String PROJECTIONMODE = "ProjectionMode";


    /**
     * PROJECTIONMODEACTIVITY.
     */
    public static final String PROJECTIONMODEACTIVITY = "ProjectionModeActivity";


    /**
     * DTCSTORED.
     */
    public static final String DTCSTORED = "DTCStored";
    // Added new eventId called Stability ; this is towards the
    // implementation of HCP-7709 Generic stability event aggregator
    // Start

    /**
     * STABILITY.
     */
    public static final String STABILITY = "Stability";


    /**
     * DFFEVENT.
     */
    public static final String DFFEVENT = "DffEvent";


    /**
     * GENERICTHIRDPARTYDATAEVENT.
     */
    public static final String GENERICTHIRDPARTYDATAEVENT = "GenericThirdPartyDataEvent";


    /**
     * GENERIC_THIRDPARTY_DATA_REQUEST_EVENT.
     */
    public static final String GENERIC_THIRDPARTY_DATA_REQUEST_EVENT = "GenericThirdPartyDataRequestEvent";

    // DFFControlEvent

    /**
     * DFF_CONTROL_EVENT.
     */
    public static final String DFF_CONTROL_EVENT = "DFFControlEvent";


    /**
     * DEVICE_CONN_STATUS.
     */
    public static final String DEVICE_CONN_STATUS = "DeviceConnStatus";
    

    /**
     * FETCH_CONN_STATUS.
     */
    public static final String FETCH_CONN_STATUS = "FetchConnectionStatus";


    /**
     * SERVICE_REMINDER.
     */
    public static final String SERVICE_REMINDER = "ServiceReminder";

    /**
     * MAINTENANCE_ALERT.
     */
    public static final String MAINTENANCE_ALERT = "MaintenanceReminder";
    // Event which store in Stream DLQ topic

    /**
     * IGNITE_EXCEPTION_EVENT.
     */
    public static final String IGNITE_EXCEPTION_EVENT = "IgniteExceptionEvent";


    /**
     * COMPOSITE_EVENT.
     */
    public static final String COMPOSITE_EVENT = "CompositeEvent";


    /**
     * CREATE_SCHEDULE_EVENT.
     */
    public static final String CREATE_SCHEDULE_EVENT = "CreateScheduleEvent";


    /**
     * DELETE_SCHEDULE_EVENT.
     */
    public static final String DELETE_SCHEDULE_EVENT = "DeleteScheduleEvent";


    /**
     * SCHEDULE_OP_STATUS_EVENT.
     */
    public static final String SCHEDULE_OP_STATUS_EVENT = "ScheduleOpStatusEvent";


    /**
     * SCHEDULE_NOTIFICATION_EVENT.
     */
    public static final String SCHEDULE_NOTIFICATION_EVENT = "ScheduleNotificationEvent";


    /**
     * DFF_FEEDBACK_EVENT.
     */
    public static final String DFF_FEEDBACK_EVENT = "DffFeedBackEvent";


    /**
     * AMBIENT_AIR_TEMP.
     */
    public static final String AMBIENT_AIR_TEMP = "AmbientAirTemp";


    /**
     * CAR_BATTERY_VOLTAGE.
     */
    public static final String CAR_BATTERY_VOLTAGE = "CarBatteryVoltage";


    /**
     * ENGINE_OIL_LIFE.
     */
    public static final String ENGINE_OIL_LIFE = "EngineOilLife";


    /**
     * ENGINE_COOLANT_TEMP.
     */
    public static final String ENGINE_COOLANT_TEMP = "EngineCoolantTemp";


    /**
     * FUEL_ECONOMY.
     */
    public static final String FUEL_ECONOMY = "FuelEconomy";


    /**
     * FUEL_CAPACITY.
     */
    public static final String FUEL_CAPACITY = "FuelCapacity";


    /**
     * FUEL_LEVEL.
     */
    public static final String FUEL_LEVEL = "FuelLevel";


    /**
     * OEM_VEHICLE_STATUS.
     */
    public static final String OEM_VEHICLE_STATUS = "OEMVehicleStatus";


    /**
     * LOW_FUEL.
     */
    public static final String LOW_FUEL = "LowFuel";


    /**
     * ENGINE_MIL_INDICATOR.
     */
    public static final String ENGINE_MIL_INDICATOR = "EngineMILindicator";


    /**
     * OIL_MAINTENANCE_STATE.
     */
    public static final String OIL_MAINTENANCE_STATE = "OilMaintenanceState";


    /**
     * OIL_PRESSURE.
     */
    public static final String OIL_PRESSURE = "OilPressure";


    /**
     * OUTPUT_SPEED.
     */
    public static final String OUTPUT_SPEED = "OutputSpeed";


    /**
     * TYPE_OF_FUEL.
     */
    public static final String TYPE_OF_FUEL = "Typeoffuel";


    /**
     * TIRE_PRESSURE.
     */
    public static final String TIRE_PRESSURE = "TirePressure";


    /**
     * DISTANCE_TO_EMPTY.
     */
    public static final String DISTANCE_TO_EMPTY = "DistanceToEmpty";


    /**
     * DISTANCE_TO_SERVICE.
     */
    public static final String DISTANCE_TO_SERVICE = "DistanceToService";


    /**
     * MSG_SEQ_BUF_FLUSH_EVENT.
     */
    public static final String MSG_SEQ_BUF_FLUSH_EVENT = "MsgSeqBufferFlush";


    /**
     * ENROLMENT_REQUEST.
     */
    public static final String ENROLMENT_REQUEST = "EnrolmentRequest";


    /**
     * POLICY_REQUEST.
     */
    public static final String POLICY_REQUEST = "PolicyRequest";


    /**
     * POLICY_FEED_REQUEST.
     */
    public static final String POLICY_FEED_REQUEST = "PolicyFeedRequest";


    /**
     * VEHICLE_PROFILE_CHANGED_NOTIFICATION_EVENT.
     */
    public static final String VEHICLE_PROFILE_CHANGED_NOTIFICATION_EVENT =
            "VEHICLE_PROFILE_CHANGED_NOTIFICATION_EVENT";

    //Analytics Event for sending data to analytics dashboard via kafka (RTC-301848)

    /**
     * DATA_USAGE_EVENT.
     */
    public static final String DATA_USAGE_EVENT = "DataUsage";
}