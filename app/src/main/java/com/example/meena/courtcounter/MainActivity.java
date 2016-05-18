package com.example.meena.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTA = 0;
    int scoreTB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3ForTB(View view)
    {
        scoreTB += 3;
        displayForTeamB(scoreTB);
    }

    public void add2ForTB(View view)
    {
        scoreTB += 2;
        displayForTeamB(scoreTB);
    }

    public void add1ForTB(View view)
    {
        scoreTB += 1;
        displayForTeamB(scoreTB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3ForTA(View view)
    {
        scoreTA += 3;
        displayForTeamA(scoreTA);
    }

    public void add2ForTA(View view)
    {
        scoreTA += 2;
        displayForTeamA(scoreTA);
    }

    public void add1ForTA(View view)
    {
        scoreTA += 1;
        displayForTeamA(scoreTA);
    }

    public void resetScore(View view)
    {
        scoreTA = 0;
        scoreTB = 0;
        displayForTeamA(scoreTA);
        displayForTeamB(scoreTB);
    }

}
