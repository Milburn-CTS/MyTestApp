package com.continentaltechsolutions.dell.mytestapp.Activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.continentaltechsolutions.dell.mytestapp.R;
import com.continentaltechsolutions.dell.mytestapp.Service.MyService;


public class ServiceActivity extends AppCompatActivity implements View.OnClickListener {

    //button objects
    private Button buttonStart;
    private Button buttonStop;
    private Button buttonCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        //getting buttons from xml
        buttonStart = (Button) findViewById(R.id.button3);
        buttonStop = (Button) findViewById(R.id.button4);
        buttonCall = (Button) findViewById(R.id.button5);

        //attaching onclicklistener to buttons
        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        buttonCall.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == buttonStart) {
            //starting service
            startService(new Intent(this, MyService.class));
        } else if (view == buttonStop) {
            //stopping service
            stopService(new Intent(this, MyService.class));
        }
        else if (view == buttonCall) {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:+917447407748"));
            startActivity(callIntent);

        }
    }
}
