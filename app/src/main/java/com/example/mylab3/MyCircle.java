package com.example.mylab3;

import android.graphics.Canvas;
import android.graphics.Color;

public class MyCircle extends MyDraw{
    int radius;
    Canvas canvas;


    public MyCircle(Canvas canvas,int radius){
        this.canvas = canvas;
        this.radius = radius;
    }
    public void setPosition(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }
    public void setColor(int r, int g, int b){
        this.paint.setColor(Color.rgb(r,g,b));

    }
    public void draw(){
        this.canvas.drawCircle(this.x,this.y,this.radius,this.paint);
    }
}
