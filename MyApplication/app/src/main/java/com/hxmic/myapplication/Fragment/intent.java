package com.hxmic.myapplication.Fragment;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.hxmic.myapplication.R;

public class intent extends AppCompatActivity implements View.OnClickListener {

    NotificationManager manager;//通知控制类
    int notification_ID ;

    private boolean mark=false;

    private TextView textView;

    private Button send, cancle;

    ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        textView = (TextView) findViewById(R.id.textview);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(intent.this, "这是一个挑战页面", Toast.LENGTH_LONG).show();
            }
        });

        actionBar = getActionBar();
        manager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        findViewById(R.id.send).setOnClickListener(this);
        findViewById(R.id.cancle).setOnClickListener(this);



    }


    public void showActionBar(View source) {
        showActionBar(source);
    }

    public void hideActionBar(View source) {
        hideActionBar(source);
    }

    @Override
    public void onClick(View view) {

        ActivityManager activityManager=(ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        String runningActivity=activityManager.getRunningTasks(1).get(0).topActivity.getClassName();
        switch (view.getId()) {
            case R.id.send:

            sendNotification();

                //if (runningActivity=="com.hxmic.myapplication.Fragment.intent")
                //manager.cancel(notification_ID);

            break;

            case R.id.cancle:
                //Toast.makeText(this,runningActivity,Toast.LENGTH_LONG).show();
                 manager.cancel(notification_ID);

            break;

            default:
                break;
        }
    }
    //构造notification并发送到通知栏
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void sendNotification(){


        Intent intent=new Intent(this,MainVisibility.class);

        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,intent,0);

        Notification.Builder builder=new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.one);//设置图标
        builder.setTicker("hello");//手机状态栏的提示
        builder.setWhen(System.currentTimeMillis());//设置时间
        builder.setContentTitle("通知栏童子");//设置标题
        builder.setContentText("我来自Notification");//设置童子内容
        builder.setContentIntent(pendingIntent);//设置点击后的意图

        /*builder.setDefaults(Notification.DEFAULT_SOUND);//设置提示声音
        builder.setDefaults(Notification.DEFAULT_LIGHTS);//设置指示灯
        builder.setDefaults(Notification.DEFAULT_VIBRATE);//设置震动*/
        builder.setDefaults(Notification.DEFAULT_ALL);//设置以上效果
        ActivityManager activityManager=(ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        String runningActivity=activityManager.getRunningTasks(1).get(0).topActivity.getClassName();
        /*if (runningActivity!="com.hxmic.myapplication.Fragment.intent")
            manager.cancel(notification_ID);*/
        Notification notification=builder.build();//4.1以上
        //builder.getNotification();
        manager.notify(notification_ID,notification);


    }
}
