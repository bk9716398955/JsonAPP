package com.techasylum.jsonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Gson gson=new Gson();
// ArrayList<FamilyMember> family=new ArrayList<>();
      //  family.add(new FamilyMember("wife",23));
      //  family.add(new FamilyMember("son",2));

    //  Address address = new Address("Germany", "Berlin");

      // Employee employee=new Employee("boby",25,"bk7210669792@gmail.com",address,family);
     //   String json=gson.toJson(family);



      String json="[{\"age\":23,\"relationship\":\"wife\"},{\"age\":2,\"relationship\":\"son\"}]";
       FamilyMember[] employee=gson.fromJson(json,FamilyMember[].class);

        Log.i(LOG_TAG,"hello"+employee);
        System.out.println(employee);
        Toast.makeText(this, ""+employee, Toast.LENGTH_SHORT).show();





    }

}
