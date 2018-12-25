package com.nnk.itsfishy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {

    private Button StartGmaeAgain;
    private TextView DisplayScore;
    private String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        StartGmaeAgain=(Button) findViewById(R.id.play_again_btn);
        DisplayScore=(TextView)findViewById(R.id.displayScore);
        score=getIntent().getExtras().get("score").toString();

        StartGmaeAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GameOver.this,MainActivity.class);
                startActivity(intent);
            }
        });
        DisplayScore.setText("Score = "+score);
    }
}
