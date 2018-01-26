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
 * The interface for the Base Workbook Functions Quartile_Exc Request Builder.
 */
public interface IBaseWorkbookFunctionsQuartile_ExcRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsQuartile_ExcRequest
     *
     * @return The IWorkbookFunctionsQuartile_ExcRequest instance
     */
    IWorkbookFunctionsQuartile_ExcRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsQuartile_ExcRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsQuartile_ExcRequest instance
     */
    IWorkbookFunctionsQuartile_ExcRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
