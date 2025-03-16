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

package org.eclipse.ecsp.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.morphia.annotations.Entity;
import org.eclipse.ecsp.domain.EventAttribute;

import java.io.Serializable;

/**
 * RTC-177051 - Class to create user context on Ignite Event.
 * IgniteEvent will have the added flexibility of adding the user context
 * information such as user id and the role to the ignite event.
 *
 * @author vkanchepalli
 */
@Entity
public class UserContext implements Serializable {

    /**
     * uid.
     */
    protected static final long serialVersionUID = -3920038506977633922L;

    /**
     * userId.
     */
    @JsonProperty(value = EventAttribute.USER_ID)
    protected String userId;

    /**
     * role.
     */
    @JsonProperty(value = EventAttribute.USER_ROLE)
    protected String role;

    /**
     * get userId.
     *
     * @return String
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set userId.
     *
     * @param userId : String
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * get role.
     *
     * @return String
     */
    public String getRole() {
        return role;
    }

    /**
     * set role.
     *
     * @param role : String
     */
    public void setRole(String role) {
        this.role = role;
    }

}