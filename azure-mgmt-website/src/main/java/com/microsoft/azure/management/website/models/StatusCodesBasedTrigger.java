/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;


/**
 * StatusCodeBasedTrigger.
 */
public class StatusCodesBasedTrigger {
    /**
     * HTTP status code.
     */
    private Integer status;

    /**
     * SubStatus.
     */
    private Integer subStatus;

    /**
     * Win32 error code.
     */
    private Integer win32Status;

    /**
     * Count.
     */
    private Integer count;

    /**
     * TimeInterval.
     */
    private String timeInterval;

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Get the subStatus value.
     *
     * @return the subStatus value
     */
    public Integer getSubStatus() {
        return this.subStatus;
    }

    /**
     * Set the subStatus value.
     *
     * @param subStatus the subStatus value to set
     */
    public void setSubStatus(Integer subStatus) {
        this.subStatus = subStatus;
    }

    /**
     * Get the win32Status value.
     *
     * @return the win32Status value
     */
    public Integer getWin32Status() {
        return this.win32Status;
    }

    /**
     * Set the win32Status value.
     *
     * @param win32Status the win32Status value to set
     */
    public void setWin32Status(Integer win32Status) {
        this.win32Status = win32Status;
    }

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Get the timeInterval value.
     *
     * @return the timeInterval value
     */
    public String getTimeInterval() {
        return this.timeInterval;
    }

    /**
     * Set the timeInterval value.
     *
     * @param timeInterval the timeInterval value to set
     */
    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

}