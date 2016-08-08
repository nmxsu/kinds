package com.hxmic.myapplication.Fragment;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.hxmic.myapplication.R;

public class MainVisibility extends AppCompatActivity {


    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_visibility);
        //new intent().manager.cancel(new intent().notification_ID);
        textView=(TextView)findViewById(R.id.text2);





    }

    public void onclick(View view){
        switch (view.getId()){
            case R.id.button1:{
                textView.setVisibility(View.VISIBLE);
                break;

            }case R.id.button2:{

                textView.setVisibility(View.INVISIBLE);
                break;
            }case R.id.button3:{

                textView.setVisibility(View.GONE);
                break;
            }
            default: break;

        }
    }
}
