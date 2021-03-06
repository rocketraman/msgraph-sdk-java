// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMobileAppContentRequest;
import com.microsoft.graph.requests.extensions.MobileAppContentRequest;
import com.microsoft.graph.requests.extensions.IMobileAppContentFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentFileRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentFileRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content Request Builder.
 */
public class MobileAppContentRequestBuilder extends BaseRequestBuilder implements IMobileAppContentRequestBuilder {

    /**
     * The request builder for the MobileAppContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppContentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IMobileAppContentRequest instance
     */
    public IMobileAppContentRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IMobileAppContentRequest instance
     */
    public IMobileAppContentRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new MobileAppContentRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IMobileAppContentFileCollectionRequestBuilder files() {
        return new MobileAppContentFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("files"), getClient(), null);
    }

    public IMobileAppContentFileRequestBuilder files(final String id) {
        return new MobileAppContentFileRequestBuilder(getRequestUrlWithAdditionalSegment("files") + "/" + id, getClient(), null);
    }
}

