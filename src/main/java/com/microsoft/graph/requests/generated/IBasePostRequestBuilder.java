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
 * The interface for the Base Post Request Builder.
 */
public interface IBasePostRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IPostRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IPostRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IExtensionCollectionRequestBuilder extensions();

    IExtensionRequestBuilder extensions(final String id);

    /**
     * Gets the request builder for Post.
     */
    IPostRequestBuilder inReplyTo();

    IAttachmentCollectionRequestBuilder attachments();

    IAttachmentRequestBuilder attachments(final String id);

    ISingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties();

    ISingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id);

    IMultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties();

    IMultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id);
    IPostForwardRequestBuilder forward(final String comment, final java.util.List<Recipient> toRecipients);
    IPostReplyRequestBuilder reply(final Post post);

}
