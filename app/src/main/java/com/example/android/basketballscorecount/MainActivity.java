package com.example.android.basketballscorecount;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;



    public void threePointerTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamAScore();
    }

    public void twoPointerTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayTeamAScore();
    }

    public void freeThrowTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamAScore();
    }

    public void threePointerTeamB(View view) {
        scoreTeamB = scoreTeamB+ 3;
        displayTeamBScore();
    }



    public void twoPointerTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayTeamBScore();
    }

    public void freeThrowTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamBScore();
    }

    public void displayTeamAScore(){
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText(""+scoreTeamA);
    }

    private void displayTeamBScore() {
        TextView quantityTextView = (TextView) findViewById(R.id.team_b_score);
        quantityTextView.setText(""+scoreTeamB);
    }


    public void reset(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayTeamBScore();
        displayTeamAScore();
    }
}