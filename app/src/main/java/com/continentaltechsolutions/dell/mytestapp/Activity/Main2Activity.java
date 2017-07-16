package com.continentaltechsolutions.dell.mytestapp.Activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.continentaltechsolutions.dell.mytestapp.Helper.AppPrefs;
import com.continentaltechsolutions.dell.mytestapp.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        /*SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs",0);
        String desiredPreference =  sharedPreferences.getString("Email", "DefaultValue");
        Toast.makeText(Main2Activity.this,"Your name is " + desiredPreference, Toast.LENGTH_LONG).show();*/

        Context context1 = getApplicationContext();
        AppPrefs appPrefs1 = new AppPrefs(context1);
        int id1 = appPrefs1.getUser_id();
        String name1 = appPrefs1.getUser_name();
        Toast.makeText(Main2Activity.this,"Your name is 1" + id1 + "  "+ name1, Toast.LENGTH_LONG).show();
    }
}
