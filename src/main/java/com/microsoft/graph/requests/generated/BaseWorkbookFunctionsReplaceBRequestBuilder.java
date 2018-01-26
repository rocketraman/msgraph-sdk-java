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
 * The class for the Base Workbook Functions Replace BRequest Builder.
 */
public class BaseWorkbookFunctionsReplaceBRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsReplaceB
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsReplaceBRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement oldText, final com.google.gson.JsonElement startNum, final com.google.gson.JsonElement numBytes, final com.google.gson.JsonElement newText) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("oldText", oldText);
        bodyParams.put("startNum", startNum);
        bodyParams.put("numBytes", numBytes);
        bodyParams.put("newText", newText);
    }

    /**
     * Creates the IWorkbookFunctionsReplaceBRequest
     *
     * @return The IWorkbookFunctionsReplaceBRequest instance
     */
    public IWorkbookFunctionsReplaceBRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsReplaceBRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsReplaceBRequest instance
     */
    public IWorkbookFunctionsReplaceBRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsReplaceBRequest request = new WorkbookFunctionsReplaceBRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("oldText")) {
            request.body.oldText = getParameter("oldText");
        }

        if (hasParameter("startNum")) {
            request.body.startNum = getParameter("startNum");
        }

        if (hasParameter("numBytes")) {
            request.body.numBytes = getParameter("numBytes");
        }

        if (hasParameter("newText")) {
            request.body.newText = getParameter("newText");
        }

        return request;
    }
}
