// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.dns.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ZoneListResult model.
 */
@Fluent
public final class ZoneListResultInner {
    /*
     * Information about the DNS zones.
     */
    @JsonProperty(value = "value")
    private List<ZoneInner> value;

    /*
     * The continuation token for the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Information about the DNS zones.
     * 
     * @return the value value.
     */
    public List<ZoneInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Information about the DNS zones.
     * 
     * @param value the value value to set.
     * @return the ZoneListResultInner object itself.
     */
    public ZoneListResultInner withValue(List<ZoneInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The continuation token for the next page of
     * results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }
}