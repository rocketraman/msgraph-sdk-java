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
 * The class for the Base Directory Object Get Member Groups Collection Request.
 */
public class BaseDirectoryObjectGetMemberGroupsCollectionRequest extends BaseCollectionRequest<BaseDirectoryObjectGetMemberGroupsCollectionResponse, IDirectoryObjectGetMemberGroupsCollectionPage> implements IBaseDirectoryObjectGetMemberGroupsCollectionRequest {


    protected final DirectoryObjectGetMemberGroupsBody body;


    /**
     * The request for this DirectoryObjectGetMemberGroups
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDirectoryObjectGetMemberGroupsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDirectoryObjectGetMemberGroupsCollectionResponse.class, IDirectoryObjectGetMemberGroupsCollectionPage.class);
        body = new DirectoryObjectGetMemberGroupsBody();
    }


    public void post(final ICallback<IDirectoryObjectGetMemberGroupsCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDirectoryObjectGetMemberGroupsCollectionPage post() throws ClientException {
        final BaseDirectoryObjectGetMemberGroupsCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IDirectoryObjectGetMemberGroupsCollectionPage buildFromResponse(final BaseDirectoryObjectGetMemberGroupsCollectionResponse response) {
        final IDirectoryObjectGetMemberGroupsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DirectoryObjectGetMemberGroupsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, /* securityEnabledOnly */ null);
        } else {
            builder = null;
        }
        final IDirectoryObjectGetMemberGroupsCollectionPage page = new DirectoryObjectGetMemberGroupsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IDirectoryObjectGetMemberGroupsCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IDirectoryObjectGetMemberGroupsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IDirectoryObjectGetMemberGroupsCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (IDirectoryObjectGetMemberGroupsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IDirectoryObjectGetMemberGroupsCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IDirectoryObjectGetMemberGroupsCollectionRequest)this;
    }

}
