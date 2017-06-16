/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jandy.android.shareclipboard;

/**
 * Provides the list of dummy devices. This sample implements this as constants, but real-life apps
 * should use a database and such.
 */
public class Device {

    /**
     * The list of dummy devices.
     */
    public static final Device[] DEVICES = {
            new Device("My tab"),
            new Device("My pc")
    };

    /**
     * The device ID.
     */
    public static final String ID = "device_id";

    /**
     * Representative invalid device ID.
     */
    public static final int INVALID_ID = -1;

    /**
     * The name of this device.
     */
    private final String mName;

    /**
     * Instantiates a new {@link Device}.
     *
     * @param name The name of the device.
     */
    public Device(String name) {
        mName = name;
    }

    /**
     * Finds a {@link Device} specified by a device ID.
     *
     * @param id The device ID. This needs to be a valid ID.
     * @return A {@link Device}
     */
    public static Device byId(int id) {
        return DEVICES[id];
    }

    /**
     * Gets the name of this device.
     *
     * @return The name of this device.
     */
    public String getName() {
        return mName;
    }

    /**
     * Gets the icon of this device.
     *
     * @return The icon.
     */
    public int getIcon() {
        return R.mipmap.ic_launcher;
    }

}
