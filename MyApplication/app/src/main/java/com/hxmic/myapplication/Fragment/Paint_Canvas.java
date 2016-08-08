package com.hxmic.myapplication.Fragment;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import com.hxmic.myapplication.R;

/**
 * Created by hx on 2016/8/5.
 */
public class Paint_Canvas extends View {


    public Paint_Canvas(Context context) {
        super(context);
    }


    //当Android 系统需要绘制一个View对象是，就会调用该对象的onDraw
    //典型的回调函数
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawLine(0, 0, 200, 200, paint);
        ////////////////////////////

        paint.setARGB(150, 0, 100, 200);
        paint.setStyle(Paint.Style.STROKE);//设置实心||空心FILL
        paint.setStrokeWidth(10);//设置边框的宽度
        canvas.drawRect(200, 200, 500, 500, paint);//画矩形
        canvas.drawCircle(500, 500, 150, paint);//画矩形


        ////////////////////////////////////////
        paint.setColor(Color.RED);
        paint.setTextSize(100);
        canvas.drawText("apple", 50, 200, paint);
        canvas.drawLine(0, 200, 500, 200, paint);

        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher)
                , 100, 300, paint);


        super.onDraw(canvas);


    }
}


