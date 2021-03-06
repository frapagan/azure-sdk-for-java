/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_30;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.implementation.HealthcareApisManager;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.implementation.PrivateLinkResourceListResultInner;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.implementation.PrivateLinkResourceInner;
import java.util.List;

/**
 * Type representing PrivateLinkResourceListResult.
 */
public interface PrivateLinkResourceListResult extends HasInner<PrivateLinkResourceListResultInner>, HasManager<HealthcareApisManager> {
    /**
     * @return the value value.
     */
    List<PrivateLinkResourceInner> value();

}
