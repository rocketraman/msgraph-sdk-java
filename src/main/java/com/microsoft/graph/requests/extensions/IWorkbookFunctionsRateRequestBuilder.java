// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRateRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Rate Request Builder.
 */
public interface IWorkbookFunctionsRateRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsRateRequest
     *
     * @return the IWorkbookFunctionsRateRequest instance
     */
    IWorkbookFunctionsRateRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsRateRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRateRequest instance
     */
    IWorkbookFunctionsRateRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
