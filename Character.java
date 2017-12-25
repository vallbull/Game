package com.example.valval.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;

import static android.R.attr.right;

/**
 * Created by student1 on 22.12.17.
 */
public class Character {
    private float x, y;
    private int w, h, nFrames;
    private Bitmap sprite;
    long prevTime;
    private long delay=125;
    private float vx;

    Character(int x, int y, Bitmap sprite, int nFrames) {
        this.x = x;
        this.y = y;
        this.sprite = sprite;
        this.nFrames = nFrames;
        this.w = sprite.getWidth()/nFrames;
        this.h = sprite.getHeight();
        this.frame = new Rect (0,0, w, h);
        this.prevTime = System.currentTimeMillis();
        this.vx=0;
    }
    Paint p = new Paint();
    Rect frame ;

    void update(){
        long nowTime = System.currentTimeMillis();
        if((nowTime-prevTime)>=delay) {
            frame.left += w;
            frame.right += w;
            if (frame.right > sprite.getWidth()) {
                frame.left = 0;
                frame.right = w;
            }
            prevTime=nowTime;
        }
        x+=vx;



    }

    void draw(Canvas canvas) {

        Rect frameTo = new Rect ((int) this.x-w/4,(int) this.y-h/4, (int) this.x+w/4, (int) this.y+h/4);

        canvas.drawBitmap(sprite, frame, frameTo, p);

    }
    void touch(MotionEvent event){
        if(event.getX() > this.x)
            vx=1;
        else vx=-3;


    }
}
