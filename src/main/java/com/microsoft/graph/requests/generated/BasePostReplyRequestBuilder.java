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
 * The class for the Base Post Reply Request Builder.
 */
public class BasePostReplyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this PostReply
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePostReplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Post post) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("post", post);
    }

    /**
     * Creates the IPostReplyRequest
     *
     * @return The IPostReplyRequest instance
     */
    public IPostReplyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IPostReplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IPostReplyRequest instance
     */
    public IPostReplyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        PostReplyRequest request = new PostReplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("post")) {
            request.body.post = getParameter("post");
        }

        return request;
    }
}
