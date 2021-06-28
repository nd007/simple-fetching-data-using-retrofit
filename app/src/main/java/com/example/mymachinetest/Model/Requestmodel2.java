package com.example.mymachinetest.Model;

import com.google.gson.annotations.SerializedName;

public class Requestmodel2 {

    @SerializedName("data")
    private dashboardModel dashboardModel;

    public com.example.mymachinetest.Model.dashboardModel getDashboardModel() {
        return dashboardModel;
    }

    public void setDashboardModel(com.example.mymachinetest.Model.dashboardModel dashboardModel) {
        this.dashboardModel = dashboardModel;
    }

    public Requestmodel2(com.example.mymachinetest.Model.dashboardModel dashboardModel) {
        this.dashboardModel = dashboardModel;
    }
}
