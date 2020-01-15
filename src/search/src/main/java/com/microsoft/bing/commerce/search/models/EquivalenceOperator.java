// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.search.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for EquivalenceOperator.
 */
public enum EquivalenceOperator {
    /** Enum value Eq. */
    EQ("Eq"),

    /** Enum value Ne. */
    NE("Ne");

    /** The actual serialized value for a EquivalenceOperator instance. */
    private String value;

    EquivalenceOperator(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EquivalenceOperator instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EquivalenceOperator object, or null if unable to parse.
     */
    @JsonCreator
    public static EquivalenceOperator fromString(String value) {
        EquivalenceOperator[] items = EquivalenceOperator.values();
        for (EquivalenceOperator item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
