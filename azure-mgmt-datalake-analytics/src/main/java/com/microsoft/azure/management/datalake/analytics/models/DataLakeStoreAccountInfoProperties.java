/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;


/**
 * Data Lake Store account properties information.
 */
public class DataLakeStoreAccountInfoProperties {
    /**
     * Gets or sets the optional suffix for the Data Lake Store account.
     */
    private String suffix;

    /**
     * Get the suffix value.
     *
     * @return the suffix value
     */
    public String getSuffix() {
        return this.suffix;
    }

    /**
     * Set the suffix value.
     *
     * @param suffix the suffix value to set
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

}