// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Planner Task Collection Request.
 */
public class BasePlannerTaskCollectionRequest extends BaseCollectionRequest<BasePlannerTaskCollectionResponse, IPlannerTaskCollectionPage> implements IBasePlannerTaskCollectionRequest {

    /**
     * The request builder for this collection of PlannerTask
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePlannerTaskCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BasePlannerTaskCollectionResponse.class, IPlannerTaskCollectionPage.class);
    }

    public void get(final ICallback<IPlannerTaskCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IPlannerTaskCollectionPage get() throws ClientException {
        final BasePlannerTaskCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PlannerTask newPlannerTask, final ICallback<PlannerTask> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PlannerTaskRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPlannerTask, callback);
    }

    public PlannerTask post(final PlannerTask newPlannerTask) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PlannerTaskRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPlannerTask);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IPlannerTaskCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (PlannerTaskCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IPlannerTaskCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (PlannerTaskCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IPlannerTaskCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (PlannerTaskCollectionRequest)this;
    }

    public IPlannerTaskCollectionPage buildFromResponse(final BasePlannerTaskCollectionResponse response) {
        final IPlannerTaskCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PlannerTaskCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PlannerTaskCollectionPage page = new PlannerTaskCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
