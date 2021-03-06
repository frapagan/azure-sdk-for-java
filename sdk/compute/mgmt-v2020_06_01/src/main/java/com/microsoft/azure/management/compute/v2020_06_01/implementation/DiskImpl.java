/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.compute.v2020_06_01.Disk;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_06_01.DiskUpdate;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_06_01.DiskSku;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2020_06_01.OperatingSystemTypes;
import com.microsoft.azure.management.compute.v2020_06_01.HyperVGeneration;
import com.microsoft.azure.management.compute.v2020_06_01.CreationData;
import com.microsoft.azure.management.compute.v2020_06_01.EncryptionSettingsCollection;
import com.microsoft.azure.management.compute.v2020_06_01.DiskState;
import com.microsoft.azure.management.compute.v2020_06_01.Encryption;
import com.microsoft.azure.management.compute.v2020_06_01.ShareInfoElement;
import com.microsoft.azure.management.compute.v2020_06_01.NetworkAccessPolicy;
import rx.functions.Func1;

class DiskImpl extends GroupableResourceCoreImpl<Disk, DiskInner, DiskImpl, ComputeManager> implements Disk, Disk.Definition, Disk.Update {
    private DiskUpdate updateParameter;
    DiskImpl(String name, DiskInner inner, ComputeManager manager) {
        super(name, inner, manager);
        this.updateParameter = new DiskUpdate();
    }

    @Override
    public Observable<Disk> createResourceAsync() {
        DisksInner client = this.manager().inner().disks();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<DiskInner, DiskInner>() {
               @Override
               public DiskInner call(DiskInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Disk> updateResourceAsync() {
        DisksInner client = this.manager().inner().disks();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<DiskInner, DiskInner>() {
               @Override
               public DiskInner call(DiskInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DiskInner> getInnerAsync() {
        DisksInner client = this.manager().inner().disks();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new DiskUpdate();
    }

    @Override
    public CreationData creationData() {
        return this.inner().creationData();
    }

    @Override
    public String diskAccessId() {
        return this.inner().diskAccessId();
    }

    @Override
    public Long diskIOPSReadOnly() {
        return this.inner().diskIOPSReadOnly();
    }

    @Override
    public Long diskIOPSReadWrite() {
        return this.inner().diskIOPSReadWrite();
    }

    @Override
    public Long diskMBpsReadOnly() {
        return this.inner().diskMBpsReadOnly();
    }

    @Override
    public Long diskMBpsReadWrite() {
        return this.inner().diskMBpsReadWrite();
    }

    @Override
    public Long diskSizeBytes() {
        return this.inner().diskSizeBytes();
    }

    @Override
    public Integer diskSizeGB() {
        return this.inner().diskSizeGB();
    }

    @Override
    public DiskState diskState() {
        return this.inner().diskState();
    }

    @Override
    public Encryption encryption() {
        return this.inner().encryption();
    }

    @Override
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.inner().encryptionSettingsCollection();
    }

    @Override
    public HyperVGeneration hyperVGeneration() {
        return this.inner().hyperVGeneration();
    }

    @Override
    public String managedBy() {
        return this.inner().managedBy();
    }

    @Override
    public List<String> managedByExtended() {
        return this.inner().managedByExtended();
    }

    @Override
    public Integer maxShares() {
        return this.inner().maxShares();
    }

    @Override
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.inner().networkAccessPolicy();
    }

    @Override
    public OperatingSystemTypes osType() {
        return this.inner().osType();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<ShareInfoElement> shareInfo() {
        return this.inner().shareInfo();
    }

    @Override
    public DiskSku sku() {
        return this.inner().sku();
    }

    @Override
    public DateTime timeCreated() {
        return this.inner().timeCreated();
    }

    @Override
    public String uniqueId() {
        return this.inner().uniqueId();
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

    @Override
    public DiskImpl withCreationData(CreationData creationData) {
        this.inner().withCreationData(creationData);
        return this;
    }

    @Override
    public DiskImpl withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.inner().withHyperVGeneration(hyperVGeneration);
        return this;
    }

    @Override
    public DiskImpl withZones(List<String> zones) {
        this.inner().withZones(zones);
        return this;
    }

    @Override
    public DiskImpl withDiskAccessId(String diskAccessId) {
        if (isInCreateMode()) {
            this.inner().withDiskAccessId(diskAccessId);
        } else {
            this.updateParameter.withDiskAccessId(diskAccessId);
        }
        return this;
    }

    @Override
    public DiskImpl withDiskIOPSReadOnly(Long diskIOPSReadOnly) {
        if (isInCreateMode()) {
            this.inner().withDiskIOPSReadOnly(diskIOPSReadOnly);
        } else {
            this.updateParameter.withDiskIOPSReadOnly(diskIOPSReadOnly);
        }
        return this;
    }

    @Override
    public DiskImpl withDiskIOPSReadWrite(Long diskIOPSReadWrite) {
        if (isInCreateMode()) {
            this.inner().withDiskIOPSReadWrite(diskIOPSReadWrite);
        } else {
            this.updateParameter.withDiskIOPSReadWrite(diskIOPSReadWrite);
        }
        return this;
    }

    @Override
    public DiskImpl withDiskMBpsReadOnly(Long diskMBpsReadOnly) {
        if (isInCreateMode()) {
            this.inner().withDiskMBpsReadOnly(diskMBpsReadOnly);
        } else {
            this.updateParameter.withDiskMBpsReadOnly(diskMBpsReadOnly);
        }
        return this;
    }

    @Override
    public DiskImpl withDiskMBpsReadWrite(Long diskMBpsReadWrite) {
        if (isInCreateMode()) {
            this.inner().withDiskMBpsReadWrite(diskMBpsReadWrite);
        } else {
            this.updateParameter.withDiskMBpsReadWrite(diskMBpsReadWrite);
        }
        return this;
    }

    @Override
    public DiskImpl withDiskSizeGB(Integer diskSizeGB) {
        if (isInCreateMode()) {
            this.inner().withDiskSizeGB(diskSizeGB);
        } else {
            this.updateParameter.withDiskSizeGB(diskSizeGB);
        }
        return this;
    }

    @Override
    public DiskImpl withEncryption(Encryption encryption) {
        if (isInCreateMode()) {
            this.inner().withEncryption(encryption);
        } else {
            this.updateParameter.withEncryption(encryption);
        }
        return this;
    }

    @Override
    public DiskImpl withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        if (isInCreateMode()) {
            this.inner().withEncryptionSettingsCollection(encryptionSettingsCollection);
        } else {
            this.updateParameter.withEncryptionSettingsCollection(encryptionSettingsCollection);
        }
        return this;
    }

    @Override
    public DiskImpl withMaxShares(Integer maxShares) {
        if (isInCreateMode()) {
            this.inner().withMaxShares(maxShares);
        } else {
            this.updateParameter.withMaxShares(maxShares);
        }
        return this;
    }

    @Override
    public DiskImpl withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        if (isInCreateMode()) {
            this.inner().withNetworkAccessPolicy(networkAccessPolicy);
        } else {
            this.updateParameter.withNetworkAccessPolicy(networkAccessPolicy);
        }
        return this;
    }

    @Override
    public DiskImpl withOsType(OperatingSystemTypes osType) {
        if (isInCreateMode()) {
            this.inner().withOsType(osType);
        } else {
            this.updateParameter.withOsType(osType);
        }
        return this;
    }

    @Override
    public DiskImpl withSku(DiskSku sku) {
        if (isInCreateMode()) {
            this.inner().withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

}
