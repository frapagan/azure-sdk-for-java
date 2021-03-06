/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2017_05_01_preview.implementation;

import com.microsoft.azure.management.monitor.v2017_05_01_preview.DiagnosticSettingsResourceCollection;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class DiagnosticSettingsResourceCollectionImpl extends WrapperImpl<DiagnosticSettingsResourceCollectionInner> implements DiagnosticSettingsResourceCollection {
    private final MonitorManager manager;
    DiagnosticSettingsResourceCollectionImpl(DiagnosticSettingsResourceCollectionInner inner, MonitorManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public List<DiagnosticSettingsResourceInner> value() {
        return this.inner().value();
    }

}
