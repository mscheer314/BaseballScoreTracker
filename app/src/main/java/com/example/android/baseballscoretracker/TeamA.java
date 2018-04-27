/* trying to break up the MainActivity file into different classes.

package com.example.android.baseballscoretracker;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TeamA implements Team {
    int score;
    int balls;
    int strikes;
    int outs;

    public TeamA(int score, int balls, int strikes, int outs) {
        this.score = score;
        this.balls = balls;
        this.strikes = strikes;
        this.outs = outs;
    }

    public void displayBallsTeamA(int ballsTeamA) {
        TextView ballsView = (TextView) findViewById(R.id.balls);
        ballsView.setText(String.valueOf(ballsTeamA));
    }

    public void ball(View view) {
        balls++;
        displayBallsTeamA(balls);
        if (balls == 4) {

        }
    }

    public void strikeTeamA(View view) {
        strikes++;
        displayStrikesTeamA(strikes);
        if (strikes == 3) {
            outsTeamA++;
            displayOutsTeamA(outsTeamA);
            strikesTeamA = 0;
            displayStrikesTeamA(strikesTeamA);
            ballsTeamA = 0;
            displayBallsTeamA(ballsTeamA);
        }
        if (outsTeamA == 3) {
            // resets the buttons
            Button button = (Button) findViewById(R.id.team_a_ball);
            button.setEnabled(false);
            Button button1 = (Button) findViewById(R.id.team_a_strike);
            button1.setEnabled(false);
            Button button2 = (Button) findViewById(R.id.team_a_out);
            button2.setEnabled(false);
            Button button3 = (Button) findViewById(R.id.team_a_single);
            button3.setEnabled(false);
            Button button4 = (Button) findViewById(R.id.team_a_double);
            button4.setEnabled(false);
            Button button5 = (Button) findViewById(R.id.team_a_triple);
            button5.setEnabled(false);
            Button button6 = (Button) findViewById(R.id.team_a_hr);
            button6.setEnabled(false);
            Button button7 = (Button) findViewById(R.id.team_b_ball);
            button7.setEnabled(true);
            Button button8 = (Button) findViewById(R.id.team_b_strike);
            button8.setEnabled(true);
            Button button9 = (Button) findViewById(R.id.team_b_out);
            button9.setEnabled(true);
            Button button10 = (Button) findViewById(R.id.team_b_single);
            button10.setEnabled(true);
            Button button11 = (Button) findViewById(R.id.team_b_double);
            button11.setEnabled(true);
            Button button12 = (Button) findViewById(R.id.team_b_triple);
            button12.setEnabled(true);
            Button button13 = (Button) findViewById(R.id.team_b_hr);
            button13.setEnabled(true);

            // changes the inning
            if (top_bottom) {
                top_bottom = false;
                displayTopBottom(top_bottom);
            } else {
                top_bottom = true;
                displayTopBottom(top_bottom);
                inning++;
                displayInning(inning);
            }
            outsTeamA = 0;
            displayOutsTeamA(outsTeamA);
        }
    }

}
*/