// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceInstallState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceInstallStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceInstallStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Install State Summary.
 */
public class UserInstallStateSummary extends Entity implements IJsonBackedObject {


    /**
     * The User Name.
     * User name.
     */
    @SerializedName("userName")
    @Expose
    public String userName;

    /**
     * The Installed Device Count.
     * Installed Device Count.
     */
    @SerializedName("installedDeviceCount")
    @Expose
    public Integer installedDeviceCount;

    /**
     * The Failed Device Count.
     * Failed Device Count.
     */
    @SerializedName("failedDeviceCount")
    @Expose
    public Integer failedDeviceCount;

    /**
     * The Not Installed Device Count.
     * Not installed device count.
     */
    @SerializedName("notInstalledDeviceCount")
    @Expose
    public Integer notInstalledDeviceCount;

    /**
     * The Device States.
     * The install state of the eBook.
     */
    public DeviceInstallStateCollectionPage deviceStates;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("deviceStates")) {
            final DeviceInstallStateCollectionResponse response = new DeviceInstallStateCollectionResponse();
            if (json.has("deviceStates@odata.nextLink")) {
                response.nextLink = json.get("deviceStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceStates").toString(), JsonObject[].class);
            final DeviceInstallState[] array = new DeviceInstallState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceInstallState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceStates = new DeviceInstallStateCollectionPage(response, null);
        }
    }
}
