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
 * The interface for the Base Workbook Functions Im Real Request Builder.
 */
public interface IBaseWorkbookFunctionsImRealRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsImRealRequest
     *
     * @return The IWorkbookFunctionsImRealRequest instance
     */
    IWorkbookFunctionsImRealRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsImRealRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsImRealRequest instance
     */
    IWorkbookFunctionsImRealRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
