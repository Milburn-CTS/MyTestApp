package com.continentaltechsolutions.dell.mytestapp.Helper;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by DELL on 12-Jul-17.
 */

public class Helper {
    Context mContext;
    Activity mActivity;

    public Helper(Context mContext, Activity mActivity)
    {
        this.mContext = mContext;
        this.mActivity = mActivity;
    }
    public void loadSavedPreferences(String spName) {
        SharedPreferences sharedPreferences =  mContext.getSharedPreferences(spName, 0);


        String name = sharedPreferences.getString("name", "Your Name");
        //editText.setText(name);

    }

    public static  void savePreferences(String key, String value) {
            /*SharedPreferences sharedPreferences = mContext.getSharedPreferences("Sp", 0);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(key, value);
            editor.commit();*/
    }
}
