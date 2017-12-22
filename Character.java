package com.example.valval.game;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/**
 * Created by student1 on 22.12.17.
 */
public class Character {
    private float x, y;

    Character(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Paint p = new Paint();
    void draw(Canvas canvas) {
        canvas.drawCircle(x, y, 30, p);
    }
    void touch(MotionEvent event){
        this.x = event.getX();
    }
}
