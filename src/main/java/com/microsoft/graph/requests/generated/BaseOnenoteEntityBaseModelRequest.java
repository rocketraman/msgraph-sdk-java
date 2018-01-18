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
 * The class for the Base Onenote Entity Base Model Request.
 */
public class BaseOnenoteEntityBaseModelRequest extends BaseRequest implements IBaseOnenoteEntityBaseModelRequest {

    /**
     * The request for the OnenoteEntityBaseModel
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseOnenoteEntityBaseModelRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the OnenoteEntityBaseModel from the service
     * @param callback The callback to be called after success or failure.
     */
    public void getOnenoteEntityBaseModel(final ICallback<OnenoteEntityBaseModel> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OnenoteEntityBaseModel from the service
     * @return The OnenoteEntityBaseModel from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OnenoteEntityBaseModel getOnenoteEntityBaseModel() throws ClientException {
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
     * Patches this OnenoteEntityBaseModel with a source
     * @param sourceOnenoteEntityBaseModel The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final OnenoteEntityBaseModel sourceOnenoteEntityBaseModel, final ICallback<OnenoteEntityBaseModel> callback) {
        send(HttpMethod.PATCH, callback, sourceOnenoteEntityBaseModel);
    }

    /**
     * Patches this OnenoteEntityBaseModel with a source
     * @param sourceOnenoteEntityBaseModel The source object with updates
     * @return The updated OnenoteEntityBaseModel
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OnenoteEntityBaseModel patch(final OnenoteEntityBaseModel sourceOnenoteEntityBaseModel) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenoteEntityBaseModel);
    }

    /**
     * Creates a OnenoteEntityBaseModel with a new object
     * @param newOnenoteEntityBaseModel The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final OnenoteEntityBaseModel newOnenoteEntityBaseModel, final ICallback<OnenoteEntityBaseModel> callback) {
        send(HttpMethod.POST, callback, newOnenoteEntityBaseModel);
    }

    /**
     * Creates a OnenoteEntityBaseModel with a new object
     * @param newOnenoteEntityBaseModel The new object to create
     * @return The created OnenoteEntityBaseModel
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OnenoteEntityBaseModel post(final OnenoteEntityBaseModel newOnenoteEntityBaseModel) throws ClientException {
        return send(HttpMethod.POST, newOnenoteEntityBaseModel);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IOnenoteEntityBaseModelRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (OnenoteEntityBaseModelRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IOnenoteEntityBaseModelRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (OnenoteEntityBaseModelRequest)this;
     }

}

