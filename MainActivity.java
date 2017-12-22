package com.example.valval.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gameView = (GameView) findViewById(R.id.gameView);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Character character= new Character(500,100 );
        gameView.addCharacter(character);
    }

}
