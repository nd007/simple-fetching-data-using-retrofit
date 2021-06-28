
package com.example.mymachinetest.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Header {

    @SerializedName("deviceId")
    @Expose
    private Object deviceId;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("platform")
    @Expose
    private Object platform;
    @SerializedName("token")
    @Expose
    private String token;

    public Object getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Object deviceId) {
        this.deviceId = deviceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Object getPlatform() {
        return platform;
    }

    public void setPlatform(Object platform) {
        this.platform = platform;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
