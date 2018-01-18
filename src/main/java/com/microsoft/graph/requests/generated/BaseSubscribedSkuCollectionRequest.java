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
 * The class for the Base Subscribed Sku Collection Request.
 */
public class BaseSubscribedSkuCollectionRequest extends BaseCollectionRequest<BaseSubscribedSkuCollectionResponse, ISubscribedSkuCollectionPage> implements IBaseSubscribedSkuCollectionRequest {

    /**
     * The request builder for this collection of SubscribedSku
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseSubscribedSkuCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseSubscribedSkuCollectionResponse.class, ISubscribedSkuCollectionPage.class);
    }

    public void get(final ICallback<ISubscribedSkuCollectionPage> callback) {
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

    public ISubscribedSkuCollectionPage get() throws ClientException {
        final BaseSubscribedSkuCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SubscribedSku newSubscribedSku, final ICallback<SubscribedSku> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SubscribedSkuRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSubscribedSku, callback);
    }

    public SubscribedSku post(final SubscribedSku newSubscribedSku) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SubscribedSkuRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSubscribedSku);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public ISubscribedSkuCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (SubscribedSkuCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public ISubscribedSkuCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (SubscribedSkuCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public ISubscribedSkuCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (SubscribedSkuCollectionRequest)this;
    }

    public ISubscribedSkuCollectionPage buildFromResponse(final BaseSubscribedSkuCollectionResponse response) {
        final ISubscribedSkuCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SubscribedSkuCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SubscribedSkuCollectionPage page = new SubscribedSkuCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
