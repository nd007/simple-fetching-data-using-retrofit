package com.example.mymachinetest.Model;

import com.google.gson.annotations.SerializedName;

public class dashboardModel {

    @SerializedName("PageNumber")
    private Integer PageNumber;

    @SerializedName("pageSize")
    private Integer pageSize;

    public dashboardModel(Integer pageNumber, Integer pageSize) {
        PageNumber = pageNumber;
        this.pageSize = pageSize;
    }
}
