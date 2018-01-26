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
 * The class for the Base Message Collection Request Builder.
 */
public class BaseMessageCollectionRequestBuilder extends BaseRequestBuilder implements IBaseMessageCollectionRequestBuilder {

    /**
     * The request builder for this collection of MailFolder
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseMessageCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IMessageCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IMessageCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new MessageCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMessageRequestBuilder byId(final String id) {
        return new MessageRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IMessageDeltaCollectionRequestBuilder delta() {
        return new MessageDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

	public IMessageDeltaCollectionRequestBuilder delta(final String deltaLink) {
        return new MessageDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
    }
}
