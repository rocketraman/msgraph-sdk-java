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
 * The class for the Base Calendar Group Request Builder.
 */
public class BaseCalendarGroupRequestBuilder extends BaseRequestBuilder implements IBaseCalendarGroupRequestBuilder {

    /**
     * The request builder for the CalendarGroup
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseCalendarGroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public ICalendarGroupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public ICalendarGroupRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new CalendarGroupRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ICalendarCollectionRequestBuilder calendars() {
        return new CalendarCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendars"), getClient(), null);
    }

    public ICalendarRequestBuilder calendars(final String id) {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendars") + "/" + id, getClient(), null);
    }
}
