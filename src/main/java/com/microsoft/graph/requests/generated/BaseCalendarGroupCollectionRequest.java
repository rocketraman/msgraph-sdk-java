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
 * The class for the Base Calendar Group Collection Request.
 */
public class BaseCalendarGroupCollectionRequest extends BaseCollectionRequest<BaseCalendarGroupCollectionResponse, ICalendarGroupCollectionPage> implements IBaseCalendarGroupCollectionRequest {

    /**
     * The request builder for this collection of CalendarGroup
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseCalendarGroupCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseCalendarGroupCollectionResponse.class, ICalendarGroupCollectionPage.class);
    }

    public void get(final ICallback<ICalendarGroupCollectionPage> callback) {
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

    public ICalendarGroupCollectionPage get() throws ClientException {
        final BaseCalendarGroupCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final CalendarGroup newCalendarGroup, final ICallback<CalendarGroup> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new CalendarGroupRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newCalendarGroup, callback);
    }

    public CalendarGroup post(final CalendarGroup newCalendarGroup) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CalendarGroupRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newCalendarGroup);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public ICalendarGroupCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (CalendarGroupCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public ICalendarGroupCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (CalendarGroupCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public ICalendarGroupCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (CalendarGroupCollectionRequest)this;
    }

    public ICalendarGroupCollectionPage buildFromResponse(final BaseCalendarGroupCollectionResponse response) {
        final ICalendarGroupCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CalendarGroupCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final CalendarGroupCollectionPage page = new CalendarGroupCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
