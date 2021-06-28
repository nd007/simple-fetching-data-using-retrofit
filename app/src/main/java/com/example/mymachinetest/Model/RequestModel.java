package com.example.mymachinetest.Model;

import android.app.LauncherActivity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RequestModel {

    @SerializedName("data")
    private ListItem listItem;

    public RequestModel(ListItem listItem) {
        this.listItem = listItem;
    }

    public ListItem getListItem() {
        return listItem;
    }

    public void setListItem(ListItem listItem) {
        this.listItem = listItem;
    }
}

