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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines a condition where the field must exactly match one of the values
 * within the set to be included / excluded. It can appear in a filter, a
 * boost, or a filter aggregation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = StringSetCondition.class)
@JsonTypeName("StringSetCondition")
public class StringSetCondition extends SetConditionBase {
    /**
     * The set of values for the field to match against.
     */
    @JsonProperty(value = "values")
    private List<String> values;

    /**
     * Get the set of values for the field to match against.
     *
     * @return the values value
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the set of values for the field to match against.
     *
     * @param values the values value to set
     * @return the StringSetCondition object itself.
     */
    public StringSetCondition withValues(List<String> values) {
        this.values = values;
        return this;
    }

}
