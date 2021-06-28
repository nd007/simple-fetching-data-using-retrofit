
package com.example.mymachinetest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class NetResponse implements Serializable {

    @SerializedName("header")
    @Expose
    private Header header;

    @SerializedName("data")
    @Expose
    private dataModel data;
    @SerializedName("response")
    @Expose
    private Response response;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public dataModel getData() {
        return data;
    }

    public void setData(dataModel data) {
        this.data = data;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

}
