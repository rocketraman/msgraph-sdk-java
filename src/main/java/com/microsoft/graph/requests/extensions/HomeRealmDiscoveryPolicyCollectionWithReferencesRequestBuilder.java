// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Home Realm Discovery Policy Collection With References Request Builder.
 */
public class HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder extends BaseRequestBuilder implements IHomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder {

    /**
     * The request builder for this collection of ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IHomeRealmDiscoveryPolicyCollectionWithReferencesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IHomeRealmDiscoveryPolicyCollectionWithReferencesRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new HomeRealmDiscoveryPolicyCollectionWithReferencesRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IHomeRealmDiscoveryPolicyWithReferenceRequestBuilder byId(final String id) {
        return new HomeRealmDiscoveryPolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IHomeRealmDiscoveryPolicyCollectionReferenceRequestBuilder references(){
        return new HomeRealmDiscoveryPolicyCollectionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }
}
