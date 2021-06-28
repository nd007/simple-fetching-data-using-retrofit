package com.example.mymachinetest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListItem {
    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ListItem(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
