package com.pangli.puzzle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pangli.puzzle.widget.PuzzleGameLayout;

public class MainActivity extends AppCompatActivity {
    PuzzleGameLayout mGameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGameView = (PuzzleGameLayout) findViewById(R.id.game_view);
    }
}
