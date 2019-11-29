package com.aar.app.wordsearch.features;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.aar.app.wordsearch.features.gameplay.GamePlayActivity;
//import com.aar.app.wordsearch.features.mainmenu.MainMenuActivity;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Intent intent = new Intent(this, MainMenuActivity.class);
//        startActivity(intent);
        Intent intent = new Intent(SplashScreenActivity.this, GamePlayActivity.class);
        intent.putExtra(GamePlayActivity.EXTRA_ROW_COUNT, 10);
        intent.putExtra(GamePlayActivity.EXTRA_COL_COUNT, 10);
        startActivity(intent);

        finish();
    }
}
