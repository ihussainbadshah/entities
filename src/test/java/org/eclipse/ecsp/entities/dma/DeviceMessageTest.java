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

import org.apache.commons.lang3.StringUtils;
import org.eclipse.ecsp.domain.EventID;
import org.eclipse.ecsp.domain.FetchConnectionStatusEventData;
import org.eclipse.ecsp.domain.SpeedV1_0;
import org.eclipse.ecsp.domain.Version;
import org.eclipse.ecsp.entities.EventData;
import org.eclipse.ecsp.entities.IgniteEventImpl;
import org.eclipse.ecsp.utils.NumericConstants;
import org.junit.Assert;
import org.junit.Test;

import static org.eclipse.ecsp.utils.NumericConstants.EVENT_LEVEL_ENTRY;
import static org.eclipse.ecsp.utils.NumericConstants.EVENT_LEVEL_ENTRY_INTERVAL;
import static org.eclipse.ecsp.utils.NumericConstants.TWELVE;


/**
 * Device message test class.
 */
public class DeviceMessageTest {

    @Test
    public void testMqttTopicSetInDeviceMessage() {
        IgniteEventImpl event = new IgniteEventImpl();
        SpeedV1_0 speed = new SpeedV1_0();
        speed.setValue(NumericConstants.VALUE);
        event.setMessageId("Msg123");
        event.setBizTransactionId("Biz123");
        event.setEventData(speed);
        event.setDevMsgTopicSuffix("suffixMqtt123");
        event.setDevMsgTopicPrefix("prefixMqtt123");
        event.setPlatformId("testPlatformId");
        event.setTimezone((short) NumericConstants.TWELVE);

        String payload = "payload";
        DeviceMessage msg = new DeviceMessage(payload.getBytes(), Version.V1_0, event, "topic",
                EVENT_LEVEL_ENTRY_INTERVAL);

        DeviceMessageHeader header = msg.getDeviceMessageHeader();
        Assert.assertNotNull("DeviceMessageHeader should not be null", header.toString());
        String mqttSuffix = header.getDevMsgTopicSuffix();
        Assert.assertEquals("suffixMqtt123", mqttSuffix);
        String mqttPrefix = header.getDevMsgTopicPrefix();
        Assert.assertEquals("prefixMqtt123", mqttPrefix);
        String platform = header.getPlatformId();
        Assert.assertEquals("testPlatformId", platform);
        short timezone = header.getTimezone();
        Assert.assertEquals((short) NumericConstants.TWELVE, timezone);
    }

    @Test
    public void testFetchConnStatusEventDataDeviceMessage() {
        FetchConnectionStatusEventData connStatusEventData = new FetchConnectionStatusEventData();
        FetchConnectionStatusEventData connStatusEventData2 = new FetchConnectionStatusEventData();
        connStatusEventData.setPlatformId("testPlatformId");
        connStatusEventData.setVehicleId("VIN123");
        connStatusEventData2.setPlatformId("testPlatformId");
        connStatusEventData2.setVehicleId("VIN123");
        IgniteEventImpl event = new IgniteEventImpl();
        event.setMessageId("Msg123");
        event.setBizTransactionId("Biz123");
        event.setEventData(connStatusEventData);
        event.setDevMsgTopicSuffix("suffixMqtt123");
        event.setDevMsgTopicPrefix("prefixMqtt123");
        event.setPlatformId("testPlatformId");
        event.setTimezone((short) NumericConstants.TWELVE);
        event.setEventId(EventID.FETCH_CONN_STATUS);

        String payload = "payload";
        DeviceMessage msg = new DeviceMessage(payload.getBytes(), Version.V1_0,
                event, "topic", EVENT_LEVEL_ENTRY_INTERVAL);

        DeviceMessageHeader header = msg.getDeviceMessageHeader();
        String platform = header.getPlatformId();
        Assert.assertEquals("testPlatformId", platform);
        short timezone = header.getTimezone();
        Assert.assertEquals((short) TWELVE, timezone);
        EventData eventData = msg.getEvent().getEventData();
        String eventId = msg.getEvent().getEventId();
        Assert.assertEquals(EventID.FETCH_CONN_STATUS, eventId);
        Assert.assertTrue("EventData returned should be instance of"
               + " FetchConnectionStatusEventData", eventData instanceof FetchConnectionStatusEventData);
        FetchConnectionStatusEventData fetchStatusEventData = (FetchConnectionStatusEventData) eventData;
        Assert.assertEquals("testPlatformId", fetchStatusEventData.getPlatformId());
        Assert.assertEquals("VIN123", fetchStatusEventData.getVehicleId());
        Assert.assertNotNull("FetchConnectionStatusEventData should not be null", fetchStatusEventData.toString());
        Assert.assertEquals(connStatusEventData, fetchStatusEventData);
        Assert.assertEquals(connStatusEventData, connStatusEventData2);
        Assert.assertEquals(connStatusEventData.hashCode(), connStatusEventData2.hashCode());
    }

    @Test
    public void testMqttTopicSetNegativescenario() {
        IgniteEventImpl event = new IgniteEventImpl();
        SpeedV1_0 speed = new SpeedV1_0();
        speed.setValue(NumericConstants.VALUE);
        event.setMessageId("Msg123");
        event.setBizTransactionId("Biz123");
        event.setEventData(speed);

        String payload = "payload";
        DeviceMessage msg = new DeviceMessage(payload.getBytes(), Version.V1_0, event, "topic", EVENT_LEVEL_ENTRY);

        DeviceMessageHeader header = msg.getDeviceMessageHeader();
        String mqttSuffix = header.getDevMsgTopicSuffix();
        Assert.assertTrue(StringUtils.isEmpty(mqttSuffix));
        String mqttPrefix = header.getDevMsgTopicPrefix();
        Assert.assertTrue(StringUtils.isEmpty(mqttPrefix));

    }

}
