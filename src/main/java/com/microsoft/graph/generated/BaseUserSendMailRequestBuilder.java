// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base User Send Mail Request Builder.
 */
public class BaseUserSendMailRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this UserSendMail
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseUserSendMailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final Message message, final Boolean saveToSentItems) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("message", message);
        mBodyParams.put("saveToSentItems", saveToSentItems);
    }

    /**
     * Creates the IUserSendMailRequest
     *
     * @return The IUserSendMailRequest instance
     */
    public IUserSendMailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserSendMailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IUserSendMailRequest instance
     */
    public IUserSendMailRequest buildRequest(final java.util.List<Option> requestOptions) {
        UserSendMailRequest request = new UserSendMailRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("message")) {
            request.mBody.message = getParameter("message");
        }

        if (hasParameter("saveToSentItems")) {
            request.mBody.saveToSentItems = getParameter("saveToSentItems");
        }

        return request;
    }
}