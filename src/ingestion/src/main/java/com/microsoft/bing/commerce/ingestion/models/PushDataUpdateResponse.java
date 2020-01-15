// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.ingestion.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A response to a push data update.
 */
public class PushDataUpdateResponse {
    /**
     * The id of the push data update that you can use to track it down.
     */
    @JsonProperty(value = "updateId")
    private String updateId;

    /**
     * Get the id of the push data update that you can use to track it down.
     *
     * @return the updateId value
     */
    public String updateId() {
        return this.updateId;
    }

    /**
     * Set the id of the push data update that you can use to track it down.
     *
     * @param updateId the updateId value to set
     * @return the PushDataUpdateResponse object itself.
     */
    public PushDataUpdateResponse withUpdateId(String updateId) {
        this.updateId = updateId;
        return this;
    }

}
