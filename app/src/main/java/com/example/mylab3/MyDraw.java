package com.example.mylab3;

import android.graphics.Color;
import android.graphics.Paint;

public abstract class MyDraw {
    int x;
    int y;
    Paint paint;

    public MyDraw(){
        x=0;
        y=0;
        paint = new Paint();
        paint.setColor(Color.rgb(100,100,100));
    }
    public void draw(){}
}
