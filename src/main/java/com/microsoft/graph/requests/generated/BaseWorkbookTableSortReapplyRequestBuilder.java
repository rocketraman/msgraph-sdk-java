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
 * The class for the Base Workbook Table Sort Reapply Request Builder.
 */
public class BaseWorkbookTableSortReapplyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableSortReapply
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookTableSortReapplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookTableSortReapplyRequest
     *
     * @return The IWorkbookTableSortReapplyRequest instance
     */
    public IWorkbookTableSortReapplyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableSortReapplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookTableSortReapplyRequest instance
     */
    public IWorkbookTableSortReapplyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableSortReapplyRequest request = new WorkbookTableSortReapplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
