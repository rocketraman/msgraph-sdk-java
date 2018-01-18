// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Single Value Legacy Extended Property Request.
 */
public class BaseSingleValueLegacyExtendedPropertyRequest extends BaseRequest implements IBaseSingleValueLegacyExtendedPropertyRequest {

    /**
     * The request for the SingleValueLegacyExtendedProperty
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseSingleValueLegacyExtendedPropertyRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the SingleValueLegacyExtendedProperty from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<SingleValueLegacyExtendedProperty> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SingleValueLegacyExtendedProperty from the service
     * @return The SingleValueLegacyExtendedProperty from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public SingleValueLegacyExtendedProperty get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this SingleValueLegacyExtendedProperty with a source
     * @param sourceSingleValueLegacyExtendedProperty The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final SingleValueLegacyExtendedProperty sourceSingleValueLegacyExtendedProperty, final ICallback<SingleValueLegacyExtendedProperty> callback) {
        send(HttpMethod.PATCH, callback, sourceSingleValueLegacyExtendedProperty);
    }

    /**
     * Patches this SingleValueLegacyExtendedProperty with a source
     * @param sourceSingleValueLegacyExtendedProperty The source object with updates
     * @return The updated SingleValueLegacyExtendedProperty
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public SingleValueLegacyExtendedProperty patch(final SingleValueLegacyExtendedProperty sourceSingleValueLegacyExtendedProperty) throws ClientException {
        return send(HttpMethod.PATCH, sourceSingleValueLegacyExtendedProperty);
    }

    /**
     * Creates a SingleValueLegacyExtendedProperty with a new object
     * @param newSingleValueLegacyExtendedProperty The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final SingleValueLegacyExtendedProperty newSingleValueLegacyExtendedProperty, final ICallback<SingleValueLegacyExtendedProperty> callback) {
        send(HttpMethod.POST, callback, newSingleValueLegacyExtendedProperty);
    }

    /**
     * Creates a SingleValueLegacyExtendedProperty with a new object
     * @param newSingleValueLegacyExtendedProperty The new object to create
     * @return The created SingleValueLegacyExtendedProperty
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public SingleValueLegacyExtendedProperty post(final SingleValueLegacyExtendedProperty newSingleValueLegacyExtendedProperty) throws ClientException {
        return send(HttpMethod.POST, newSingleValueLegacyExtendedProperty);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public ISingleValueLegacyExtendedPropertyRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (SingleValueLegacyExtendedPropertyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public ISingleValueLegacyExtendedPropertyRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (SingleValueLegacyExtendedPropertyRequest)this;
     }

}

