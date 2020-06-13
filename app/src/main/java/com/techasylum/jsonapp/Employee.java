package com.techasylum.jsonapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {

    @SerializedName("First_Name")
    private String mFirst_Name;
    @SerializedName("age")
    private  int mage;
    @SerializedName("mail")
    private String mmail;
    @SerializedName("address")
    private Address mAddress;
    @SerializedName("family")
    private List<FamilyMember> mFamily;

    public Employee(String first_Name, int age, String mail ,Address address,List<FamilyMember> family) {
        mFirst_Name = first_Name;
        mage = age;
        mmail = mail;
        mAddress=address;
        mFamily=family;
    }
}
