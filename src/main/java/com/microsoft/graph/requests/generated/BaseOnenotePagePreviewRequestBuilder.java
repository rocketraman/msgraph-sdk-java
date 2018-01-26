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
 * The class for the Base Onenote Page Preview Request Builder.
 */
public class BaseOnenotePagePreviewRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this OnenotePagePreview
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseOnenotePagePreviewRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IOnenotePagePreviewRequest
     *
     * @return The IOnenotePagePreviewRequest instance
     */
    public IOnenotePagePreviewRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IOnenotePagePreviewRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IOnenotePagePreviewRequest instance
     */
    public IOnenotePagePreviewRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        OnenotePagePreviewRequest request = new OnenotePagePreviewRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
