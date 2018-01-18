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
 * The class for the Base Workbook Filter Apply Dynamic Filter Request Builder.
 */
public class BaseWorkbookFilterApplyDynamicFilterRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyDynamicFilter
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFilterApplyDynamicFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String criteria) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("criteria", criteria);
    }

    /**
     * Creates the IWorkbookFilterApplyDynamicFilterRequest
     *
     * @return The IWorkbookFilterApplyDynamicFilterRequest instance
     */
    public IWorkbookFilterApplyDynamicFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFilterApplyDynamicFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFilterApplyDynamicFilterRequest instance
     */
    public IWorkbookFilterApplyDynamicFilterRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFilterApplyDynamicFilterRequest request = new WorkbookFilterApplyDynamicFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("criteria")) {
            request.body.criteria = getParameter("criteria");
        }

        return request;
    }
}
