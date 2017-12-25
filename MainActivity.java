package com.example.valval.game;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private GameView gameView;
    private Bitmap pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gameView = (GameView) findViewById(R.id.gameView);
        pic = BitmapFactory.decodeResource(getResources(), R.drawable.sprite);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Character character= new Character(200,200, pic, 6);
        gameView.addCharacter(character);
    }

}
