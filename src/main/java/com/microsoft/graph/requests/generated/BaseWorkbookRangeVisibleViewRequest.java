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
 * The class for the Base Workbook Range Visible View Request.
 */
public class BaseWorkbookRangeVisibleViewRequest extends BaseRequest implements IBaseWorkbookRangeVisibleViewRequest {

    /**
     * The request for this WorkbookRangeVisibleView
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeVisibleViewRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeView.class);
    }

    /**
     * Patches the WorkbookRangeVisibleView
     * @param srcWorkbookRangeView The WorkbookRangeView with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    public void patch(WorkbookRangeView srcWorkbookRangeView, final ICallback<WorkbookRangeView> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookRangeView);
    }

    /**
     * Patches the WorkbookRangeVisibleView
     *
     * @param srcWorkbookRangeView The WorkbookRangeView with which to PATCH
     * @return The WorkbookRangeView
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public WorkbookRangeView patch(WorkbookRangeView srcWorkbookRangeView) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookRangeView);
    }

    /**
     * Puts the WorkbookRangeVisibleView
     *
     * @param srcWorkbookRangeView The WorkbookRangeView to PUT
     * @param callback The callback to be called after success or failure
     */
    public void put(WorkbookRangeView srcWorkbookRangeView, final ICallback<WorkbookRangeView> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookRangeView);
    }

    /**
     * Puts the WorkbookRangeVisibleView
     *
     * @param srcWorkbookRangeView The WorkbookRangeView to PUT
     * @return The WorkbookRangeView
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public WorkbookRangeView put(WorkbookRangeView srcWorkbookRangeView) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookRangeView);
    }
    /**
     * Gets the WorkbookRangeView
     *
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookRangeView> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRangeView
     *
     * @return The WorkbookRangeView
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public WorkbookRangeView get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookRangeVisibleViewRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookRangeVisibleViewRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookRangeVisibleViewRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookRangeVisibleViewRequest)this;
    }

}
