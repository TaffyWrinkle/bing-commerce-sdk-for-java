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
 * Defines values for ComparisonOperator.
 */
public enum ComparisonOperator {
    /** Enum value Eq. */
    EQ("Eq"),

    /** Enum value Ne. */
    NE("Ne"),

    /** Enum value Gt. */
    GT("Gt"),

    /** Enum value Lt. */
    LT("Lt"),

    /** Enum value Ge. */
    GE("Ge"),

    /** Enum value Le. */
    LE("Le");

    /** The actual serialized value for a ComparisonOperator instance. */
    private String value;

    ComparisonOperator(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ComparisonOperator instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComparisonOperator object, or null if unable to parse.
     */
    @JsonCreator
    public static ComparisonOperator fromString(String value) {
        ComparisonOperator[] items = ComparisonOperator.values();
        for (ComparisonOperator item : items) {
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
