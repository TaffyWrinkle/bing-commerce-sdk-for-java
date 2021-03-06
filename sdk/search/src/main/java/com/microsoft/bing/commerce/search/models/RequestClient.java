// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.search.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RequestClient model.
 */
public class RequestClient {
    /**
     * The ids property.
     */
    @JsonProperty(value = "ids")
    private List<RequestClientId> ids;

    /**
     * Get the ids value.
     *
     * @return the ids value
     */
    public List<RequestClientId> ids() {
        return this.ids;
    }

    /**
     * Set the ids value.
     *
     * @param ids the ids value to set
     * @return the RequestClient object itself.
     */
    public RequestClient withIds(List<RequestClientId> ids) {
        this.ids = ids;
        return this;
    }

}
