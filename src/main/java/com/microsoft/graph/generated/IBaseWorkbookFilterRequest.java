// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Filter Request.
 */
public interface IBaseWorkbookFilterRequest extends IHttpRequest {

    /**
     * Gets the WorkbookFilter from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookFilter> callback);

    /**
     * Gets the WorkbookFilter from the service
     * @return The WorkbookFilter from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookFilter get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookFilter with a source
     * @param sourceWorkbookFilter The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookFilter sourceWorkbookFilter, final ICallback<WorkbookFilter> callback);

    /**
     * Patches this WorkbookFilter with a source
     * @param sourceWorkbookFilter The source object with updates
     * @return The updated WorkbookFilter
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookFilter patch(final WorkbookFilter sourceWorkbookFilter) throws ClientException;

    /**
     * Posts a WorkbookFilter with a new object
     * @param newWorkbookFilter The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookFilter newWorkbookFilter, final ICallback<WorkbookFilter> callback);

    /**
     * Posts a WorkbookFilter with a new object
     * @param newWorkbookFilter The new object to create
     * @return The created WorkbookFilter
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookFilter post(final WorkbookFilter newWorkbookFilter) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookFilterRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookFilterRequest expand(final String value);

}
