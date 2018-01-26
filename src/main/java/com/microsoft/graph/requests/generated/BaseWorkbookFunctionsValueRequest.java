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
 * The class for the Base Workbook Functions Value Request.
 */
public class BaseWorkbookFunctionsValueRequest extends BaseRequest implements IBaseWorkbookFunctionsValueRequest {
    protected final WorkbookFunctionsValueBody body;

    /**
     * The request for this WorkbookFunctionsValue
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsValueRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookFunctionResult.class);
        body = new WorkbookFunctionsValueBody();
    }

    public void post(final ICallback<WorkbookFunctionResult> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public WorkbookFunctionResult post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookFunctionsValueRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookFunctionsValueRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IWorkbookFunctionsValueRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (WorkbookFunctionsValueRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookFunctionsValueRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookFunctionsValueRequest)this;
    }

}
