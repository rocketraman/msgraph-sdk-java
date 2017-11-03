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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Bucket.
 */
public class BasePlannerBucket extends Entity implements IJsonBackedObject {


    public BasePlannerBucket() {
        oDataType = "microsoft.graph.plannerBucket";
    }

    /**
     * The Name.
     * Name of the bucket.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Plan Id.
     * Plan ID to which the bucket belongs.
     */
    @SerializedName("planId")
    @Expose
    public String planId;

    /**
     * The Order Hint.
     * Hint used to order items of this type in a list view. The format is defined as outlined here.
     */
    @SerializedName("orderHint")
    @Expose
    public String orderHint;

    /**
     * The Tasks.
     * Read-only. Nullable. The collection of tasks in the bucket.
     */
    public transient PlannerTaskCollectionPage tasks;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;


        if (json.has("tasks")) {
            final BasePlannerTaskCollectionResponse response = new BasePlannerTaskCollectionResponse();
            if (json.has("tasks@odata.nextLink")) {
                response.nextLink = json.get("tasks@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tasks").toString(), JsonObject[].class);
            final PlannerTask[] array = new PlannerTask[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PlannerTask.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tasks = new PlannerTaskCollectionPage(response, null);
        }
    }
}