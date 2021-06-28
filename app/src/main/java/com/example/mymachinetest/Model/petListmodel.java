package com.example.mymachinetest.Model;

import com.google.gson.annotations.SerializedName;

public class petListmodel {


    @SerializedName("dateOfBirth")
    private String dateOfBirth;


    @SerializedName("petName")
    private String petName;


    @SerializedName("petParentName")
    private String petParentName;

    @SerializedName("id")
    private String id;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetParentName() {
        return petParentName;
    }

    public String getId() {
        return id;
    }
}
