package com.hxmic.myapplication.Fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hxmic.myapplication.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Paint_Canvas paint_canvas=new Paint_Canvas(this);
        setContentView(paint_canvas);
    }
}
