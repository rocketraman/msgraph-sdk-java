// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPercentRank_ExcRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Percent Rank_Exc Request Builder.
 */
public interface IWorkbookFunctionsPercentRank_ExcRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsPercentRank_ExcRequest
     *
     * @return the IWorkbookFunctionsPercentRank_ExcRequest instance
     */
    IWorkbookFunctionsPercentRank_ExcRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsPercentRank_ExcRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPercentRank_ExcRequest instance
     */
    IWorkbookFunctionsPercentRank_ExcRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
