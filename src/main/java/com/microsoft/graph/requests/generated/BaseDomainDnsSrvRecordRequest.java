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
 * The class for the Base Domain Dns Srv Record Request.
 */
public class BaseDomainDnsSrvRecordRequest extends BaseRequest implements IBaseDomainDnsSrvRecordRequest {

    /**
     * The request for the DomainDnsSrvRecord
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseDomainDnsSrvRecordRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DomainDnsSrvRecord from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<DomainDnsSrvRecord> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DomainDnsSrvRecord from the service
     * @return The DomainDnsSrvRecord from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DomainDnsSrvRecord get() throws ClientException {
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
     * Patches this DomainDnsSrvRecord with a source
     * @param sourceDomainDnsSrvRecord The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final DomainDnsSrvRecord sourceDomainDnsSrvRecord, final ICallback<DomainDnsSrvRecord> callback) {
        send(HttpMethod.PATCH, callback, sourceDomainDnsSrvRecord);
    }

    /**
     * Patches this DomainDnsSrvRecord with a source
     * @param sourceDomainDnsSrvRecord The source object with updates
     * @return The updated DomainDnsSrvRecord
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DomainDnsSrvRecord patch(final DomainDnsSrvRecord sourceDomainDnsSrvRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceDomainDnsSrvRecord);
    }

    /**
     * Creates a DomainDnsSrvRecord with a new object
     * @param newDomainDnsSrvRecord The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final DomainDnsSrvRecord newDomainDnsSrvRecord, final ICallback<DomainDnsSrvRecord> callback) {
        send(HttpMethod.POST, callback, newDomainDnsSrvRecord);
    }

    /**
     * Creates a DomainDnsSrvRecord with a new object
     * @param newDomainDnsSrvRecord The new object to create
     * @return The created DomainDnsSrvRecord
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DomainDnsSrvRecord post(final DomainDnsSrvRecord newDomainDnsSrvRecord) throws ClientException {
        return send(HttpMethod.POST, newDomainDnsSrvRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IDomainDnsSrvRecordRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DomainDnsSrvRecordRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IDomainDnsSrvRecordRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DomainDnsSrvRecordRequest)this;
     }

}

