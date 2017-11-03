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
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Odd FYield Body.
 */
public class BaseWorkbookFunctionsOddFYieldBody {

    /**
     * The settlement.
     * 
     */
    @SerializedName("settlement")
    @Expose
    public com.google.gson.JsonElement settlement;

    /**
     * The maturity.
     * 
     */
    @SerializedName("maturity")
    @Expose
    public com.google.gson.JsonElement maturity;

    /**
     * The issue.
     * 
     */
    @SerializedName("issue")
    @Expose
    public com.google.gson.JsonElement issue;

    /**
     * The first Coupon.
     * 
     */
    @SerializedName("firstCoupon")
    @Expose
    public com.google.gson.JsonElement firstCoupon;

    /**
     * The rate.
     * 
     */
    @SerializedName("rate")
    @Expose
    public com.google.gson.JsonElement rate;

    /**
     * The pr.
     * 
     */
    @SerializedName("pr")
    @Expose
    public com.google.gson.JsonElement pr;

    /**
     * The redemption.
     * 
     */
    @SerializedName("redemption")
    @Expose
    public com.google.gson.JsonElement redemption;

    /**
     * The frequency.
     * 
     */
    @SerializedName("frequency")
    @Expose
    public com.google.gson.JsonElement frequency;

    /**
     * The basis.
     * 
     */
    @SerializedName("basis")
    @Expose
    public com.google.gson.JsonElement basis;


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

    }
}