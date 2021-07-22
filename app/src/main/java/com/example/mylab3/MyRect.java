package com.example.mylab3;

import android.graphics.Canvas;
import android.graphics.Color;

public class MyRect extends MyDraw{
    int width;
    int height;
    Canvas canvas;

    public MyRect(Canvas canvas,int width,int height){
        this.canvas = canvas;
        this.width = width;
        this.height = height;
    }
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setColor(int r, int g, int b){
        this.paint.setColor(Color.rgb(r,g,b));
    }
    public void draw(){
        int top = this.y;
        int left = this.x;
        int down = this.y+this.height;
        int right = this.x+this.width;
        this.canvas.drawRect(top,left,down,right,this.paint);

    }
}
