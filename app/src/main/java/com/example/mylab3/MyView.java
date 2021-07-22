package com.example.mylab3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }
    //method
    @Override
    public void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.GRAY);
        canvas.drawPaint(paint);

        MyCircle c1 = new MyCircle(canvas,200);
        c1.setPosition(500,500);
        c1.setColor(150,200,100);
        c1.draw();

        MyCircle c2 = new MyCircle(canvas,350);
        c2.setPosition(500,900);
        c2.setColor(200,100,150);
        c2.draw();

        MyRect r1 = new MyRect(canvas,100,100);
        r1.setPosition(800,300);
        r1.setColor(100,200,300);
        r1.draw();

        MyLine l1 = new MyLine(canvas,100,500);
        l1.setPosition(400,200);
        l1.setColor(250,100,300);
        l1.draw();
    }
}
