package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void teamA3Pointer(View v) {
        displayForTeamA(scoreTeamA+=3);
    }
    public void teamA2Pointer(View v) {
        displayForTeamA(scoreTeamA+=2);
    }
    public void teamAFreeThrow(View v) {
        displayForTeamA(scoreTeamA+=1);
    }

    public void teamB3Pointer(View v) {
        displayForTeamB(scoreTeamB+=3);
    }
    public void teamB2Pointer(View v) {
        displayForTeamB(scoreTeamB+=2);
    }
    public void teamBFreeThrow(View v) {
        displayForTeamB(scoreTeamB+=1);
    }

    public void teamScoreReset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
