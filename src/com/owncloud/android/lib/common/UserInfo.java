/**
 * Nextcloud Android client application
 *
 * @author Mario Danic
 * Copyright (C) 2017 Nextcloud GmbH.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.owncloud.android.lib.common;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * User information data model
 */

@Parcel
public class UserInfo {
    @SerializedName("id")
    public String id;
    @SerializedName("enabled")
    public Boolean enabled;
    @SerializedName(value = "display-name", alternate = {"displayname"})
    public String displayName;
    @SerializedName("email")
    public String email;
    @SerializedName("phone")
    public String phone;
    @SerializedName("address")
    public String address;
    @SerializedName(value = "website", alternate = {"webpage"})
    public String website;
    @SerializedName("twitter")
    public String twitter;
    @SerializedName("quota")
    public Quota quota;

    public UserInfo() {
    }

    public UserInfo(String id, Boolean enabled, String displayName, String email, String phone, String address,
                    String website, String twitter, Quota quota) {
        this.id = id;
        this.enabled = enabled;
        this.displayName = displayName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.website = website;
        this.twitter = twitter;
        this.quota = quota;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Quota getQuota() {
        return quota;
    }

    public void setQuota(Quota quota) {
        this.quota = quota;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
