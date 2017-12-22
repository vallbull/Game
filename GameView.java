package com.example.valval.game;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by student1 on 22.12.17.
 */

public class GameView extends View {
    private ArrayList<Character> objects = new ArrayList();

    public GameView(Context context) {
        super(context);

    }

    void addCharacter(Character character) {
        objects.add(character);
    }

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Character character : objects) {
            character.draw(canvas);
        }
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent event) {
        for (Character character : objects) {
            character.touch(event);
        }
        return super.onTouchEvent(event);
    }
}

