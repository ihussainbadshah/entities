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

import com.harman.ignite.entities.CompositeIgniteEvent;
import com.harman.ignite.entities.EventData;
import com.harman.ignite.entities.IgniteEventImpl;

import java.io.Serializable;

/**
 * Abstract ignite exception data.
 */
public class AbstractIgniteExceptionData implements EventData, Serializable {

    /**
     * version uid.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * errorTimeInMilis.
     */
    protected long errorTimeInMilis;
    
    /**
     * It holds the serialized byte[] value.
     */
    protected  Object rawData;
    
    /**
     * igniteEvent data.
     */
    protected IgniteEventImpl igniteEvent;
    
    /**
     * compositeIgniteEvent data.
     */
    protected CompositeIgniteEvent compositeIgniteEvent;
    
    /**
     * exception instance.
     */
    protected Exception exception;

    /**
     * get errorTimeInMilis.
     *
     * @return long
     */
    public long getErrorTimeInMilis() {
        return errorTimeInMilis;
    }

    /**
     * set errorTimeInMilis.
     *
     * @param errorTimeInMilis : long
     */
    public void setErrorTimeInMilis(long errorTimeInMilis) {
        this.errorTimeInMilis = errorTimeInMilis;
    }

    /**
     * get rawData.
     *
     * @return Object
     */
    public Object getRawData() {
        return rawData;
    }

    /**
     * set rawData.
     *
     * @param rawData : Object
     */
    public void setRawData(Object rawData) {
        this.rawData = rawData;
    }

    /**
     * get igniteEvent.
     *
     * @return IgniteEventImpl
     */
    public IgniteEventImpl getIgniteEvent() {
        return igniteEvent;
    }

    /**
     * set igniteEvent.
     *
     * @param igniteEvent : IgniteEventImpl
     */
    public void setIgniteEvent(IgniteEventImpl igniteEvent) {
        this.igniteEvent = igniteEvent;
    }

    /**
     * get compositeIgniteEvent.
     *
     * @return CompositeIgniteEvent
     */
    public CompositeIgniteEvent getCompositeIgniteEvent() {
        return compositeIgniteEvent;
    }

    /**
     * set compositeIgniteEvent.
     *
     * @param compositeIgniteEvent : CompositeIgniteEvent
     */
    public void setCompositeIgniteEvent(CompositeIgniteEvent compositeIgniteEvent) {
        this.compositeIgniteEvent = compositeIgniteEvent;
    }

    /**
     * get exception.
     *
     * @return Exception
     */
    public Exception getException() {
        return exception;
    }

    /**
     * set exception.
     *
     * @param exception : Exception
     */
    public void setException(Exception exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        return "AbstractIgniteExceptionData [errorTimeInMilis=" + errorTimeInMilis
                + ", rawData=" + rawData + ", igniteEvent=" + igniteEvent
                + ", compositeIgniteEvent=" + compositeIgniteEvent
                + ", exception=" + exception + "]";
    }

}
