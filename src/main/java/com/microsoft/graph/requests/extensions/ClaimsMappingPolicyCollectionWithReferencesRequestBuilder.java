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
 * The class for the Claims Mapping Policy Collection With References Request Builder.
 */
public class ClaimsMappingPolicyCollectionWithReferencesRequestBuilder extends BaseRequestBuilder implements IClaimsMappingPolicyCollectionWithReferencesRequestBuilder {

    /**
     * The request builder for this collection of ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ClaimsMappingPolicyCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IClaimsMappingPolicyCollectionWithReferencesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IClaimsMappingPolicyCollectionWithReferencesRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ClaimsMappingPolicyCollectionWithReferencesRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IClaimsMappingPolicyWithReferenceRequestBuilder byId(final String id) {
        return new ClaimsMappingPolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IClaimsMappingPolicyCollectionReferenceRequestBuilder references(){
        return new ClaimsMappingPolicyCollectionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }
}
