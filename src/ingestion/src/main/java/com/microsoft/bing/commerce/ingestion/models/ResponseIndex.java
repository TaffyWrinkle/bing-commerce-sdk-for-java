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
 * The ResponseIndex model.
 */
public class ResponseIndex extends Index {
    /**
     * The ID that uniquely identifies the index definition that had the CRUD
     * operation applied.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The current state of provisioning for the index definition. Possible
     * values include: 'Unknown', 'NotStarted', 'Provisioning',
     * 'Deprovisioning', 'Succeeded', 'Failed'.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * The date and time when the index was created.
     */
    @JsonProperty(value = "createdDateTime")
    private String createdDateTime;

    /**
     * Get the ID that uniquely identifies the index definition that had the CRUD operation applied.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID that uniquely identifies the index definition that had the CRUD operation applied.
     *
     * @param id the id value to set
     * @return the ResponseIndex object itself.
     */
    public ResponseIndex withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the current state of provisioning for the index definition. Possible values include: 'Unknown', 'NotStarted', 'Provisioning', 'Deprovisioning', 'Succeeded', 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the current state of provisioning for the index definition. Possible values include: 'Unknown', 'NotStarted', 'Provisioning', 'Deprovisioning', 'Succeeded', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ResponseIndex object itself.
     */
    public ResponseIndex withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the date and time when the index was created.
     *
     * @return the createdDateTime value
     */
    public String createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the date and time when the index was created.
     *
     * @param createdDateTime the createdDateTime value to set
     * @return the ResponseIndex object itself.
     */
    public ResponseIndex withCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

}
