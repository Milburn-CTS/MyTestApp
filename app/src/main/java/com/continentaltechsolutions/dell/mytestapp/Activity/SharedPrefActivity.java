package com.continentaltechsolutions.dell.mytestapp.Activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.continentaltechsolutions.dell.mytestapp.Helper.AppPrefs;
import com.continentaltechsolutions.dell.mytestapp.Helper.Helper;
import com.continentaltechsolutions.dell.mytestapp.R;

public class SharedPrefActivity extends AppCompatActivity {
    public static final String MyPREFERENCES = "MyPrefs" ;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("Name", "Milburn Gomes");
        editor.putString("Phone", "7447407754");
        editor.putString("Email", "milburn.gomes@continentaltechsolutions.com");
        editor.commit();


        //Save in Sp
        //Helper.savePreferences("Message", "Bye!");
        ///////////////////
        String name = "Luthfi Hariz";
        int id = 5;
        Context context = getApplicationContext();
        AppPrefs appPrefs = new AppPrefs(context);
        appPrefs.setUser_name(name);
        appPrefs.setUser_id(id);

        Context context1 = getApplicationContext();
        AppPrefs appPrefs1 = new AppPrefs(context1);
        int id1 = appPrefs1.getUser_id();
        String name1 = appPrefs1.getUser_name();
        Toast.makeText(SharedPrefActivity.this,"Your name is 1" + id1 + "  "+ name1, Toast.LENGTH_LONG).show();
///////////////////////////////////
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs",0);
        String desiredPreference =  sharedPreferences.getString("Phone", "DefaultValue");
        //Toast.makeText(SharedPrefActivity.this,"Your name is 2" + desiredPreference, Toast.LENGTH_LONG).show();
    }

   /* private void loadSavedPreferences() {
        SharedPreferences sharedPreferences = getSharedPreferences("Sp", Context.MODE_PRIVATE);

        String name = sharedPreferences.getString("name", "Your Name");
        //editText.setText(name);

    }

    private void savePreferences(String key, String value) {
        SharedPreferences sharedPreferences = getSharedPreferences("Sp", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }*/
}
