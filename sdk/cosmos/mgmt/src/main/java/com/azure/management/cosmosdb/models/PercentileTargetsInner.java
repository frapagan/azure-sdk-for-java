// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * PercentileTargets.
 */
public final class PercentileTargetsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private PercentileTargetsService service;

    /**
     * The service client containing this operation class.
     */
    private CosmosDBManagementClientImpl client;

    /**
     * Initializes an instance of PercentileTargetsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public PercentileTargetsInner(CosmosDBManagementClientImpl client) {
        this.service = RestProxy.create(PercentileTargetsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * CosmosDBManagementClientPercentileTargets to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CosmosDBManagementClientPercentileTargets")
    private interface PercentileTargetsService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/targetRegion/{targetRegion}/percentile/metrics")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PercentileMetricListResultInner>> listMetrics(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("targetRegion") String targetRegion, @QueryParam("$filter") String filter, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Retrieves the metrics determined by the given filter for the given account target region. This url is only for PBS and Replication Latency data.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param targetRegion 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PercentileMetricInner>> listMetricsSinglePageAsync(String resourceGroupName, String accountName, String targetRegion, String filter) {
        final String apiVersion = "2019-08-01";
        return service.listMetrics(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, accountName, targetRegion, filter, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            null,
            null));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given account target region. This url is only for PBS and Replication Latency data.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param targetRegion 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PercentileMetricInner> listMetricsAsync(String resourceGroupName, String accountName, String targetRegion, String filter) {
        return new PagedFlux<>(
            () -> listMetricsSinglePageAsync(resourceGroupName, accountName, targetRegion, filter));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given account target region. This url is only for PBS and Replication Latency data.
     * 
     * @param resourceGroupName 
     * @param accountName 
     * @param targetRegion 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PercentileMetricInner> listMetrics(String resourceGroupName, String accountName, String targetRegion, String filter) {
        return new PagedIterable<>(listMetricsAsync(resourceGroupName, accountName, targetRegion, filter));
    }
}