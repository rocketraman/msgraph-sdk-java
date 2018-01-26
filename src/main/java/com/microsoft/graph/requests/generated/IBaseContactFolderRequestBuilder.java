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
 * The interface for the Base Contact Folder Request Builder.
 */
public interface IBaseContactFolderRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IContactFolderRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IContactFolderRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IContactCollectionRequestBuilder contacts();

    IContactRequestBuilder contacts(final String id);

    IContactFolderCollectionRequestBuilder childFolders();

    IContactFolderRequestBuilder childFolders(final String id);

    ISingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties();

    ISingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id);

    IMultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties();

    IMultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id);

}
