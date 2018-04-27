package com.example.android.baseballscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.baseballscoretracker.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int ballsTeamA = 0;
    int ballsTeamB = 0;
    int strikesTeamA = 0;
    int strikesTeamB = 0;
    int outsTeamA = 0;
    int outsTeamB = 0;
    boolean top_bottom = true; /* tracks the top or bottom of inning.
                                  true is for top of inning, false for bottom of inning */
    int inning = 1;
    boolean onFirst = false; // tracks if a runner is on first base
    boolean onSecond = false; // tracks if a runner is on second base
    boolean onThird = false; // tracks if a runner is on third base
    boolean gameOver = false; // used to trigger the game over display when the game is over

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Displays the given score for Team A.

    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // Displays score for Team B

    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    // Displays balls for Team A

    public void displayBallsTeamA(int ballsTeamA) {
        TextView ballsView = (TextView) findViewById(R.id.balls);
        ballsView.setText(String.valueOf(ballsTeamA));
    }

    // displays balls for Team B

    public void displayBallsTeamB(int ballsTeamB) {
        TextView ballsView = (TextView) findViewById(R.id.balls);
        ballsView.setText(String.valueOf(ballsTeamB));
    }

    // displays strikes for Team A

    public void displayStrikesTeamA(int strikesTeamA) {
        TextView strikeView = (TextView) findViewById(R.id.strikes);
        strikeView.setText(String.valueOf(strikesTeamA));
    }

    // displays strikes for Team B
    public void displayStrikesTeamB(int strikesTeamB) {
        TextView strikeView = (TextView) findViewById(R.id.strikes);
        strikeView.setText(String.valueOf(strikesTeamB));
    }

    // displays outs for Team A
    public void displayOutsTeamA(int outsTeamA) {
        TextView outView = (TextView) findViewById(R.id.outs);
        outView.setText(String.valueOf(outsTeamA));
    }

    // displays outs for Team B
    public void displayOutsTeamB(int outsTeamB) {
        TextView outView = (TextView) findViewById(R.id.outs);
        outView.setText(String.valueOf(outsTeamB));
    }

    //displays the top or bottom of the inning
    public void displayTopBottom(boolean top_bottom) {
        TextView topBottomView = (TextView) findViewById(R.id.top_bottom);
        if (top_bottom == true) {
            topBottomView.setText("Top ");
        } else {
            topBottomView.setText("Bottom ");
        }
    }

    public void displayGameOver(boolean gameOver) {
        TextView gameOverView = (TextView) findViewById(R.id.game_over);
        if (gameOver == true) {
            gameOverView.setText(String.valueOf("Game Over"));
        } else {
            gameOverView.setText(String.valueOf(""));
        }
    }

    // displays the number of the inning
    public void displayInning(int inning) {
        TextView inningView = (TextView) findViewById(R.id.inning);
        switch (inning) {
            case 1:
                inningView.setText("1st");
                break;
            case 2:
                inningView.setText("2nd");
                break;
            case 3:
                inningView.setText("3rd");
                break;
            case 4:
                inningView.setText("4th");
                break;
            case 5:
                inningView.setText("5th");
                break;
            case 6:
                inningView.setText("6th");
                break;
            case 7:
                inningView.setText("7th");
                break;
            case 8:
                inningView.setText("8th");
                break;
            case 9:
                inningView.setText("9th");
                break;

        }
    }

    public void setBasesImage(boolean onFirst, boolean onSecond, boolean onThird) {
        ImageView imageView = (ImageView) findViewById(R.id.bases);

        if (!onFirst & !onSecond & !onThird) {
            imageView.setImageResource(R.drawable.empty);
        }
        if (onFirst & !onSecond & !onThird) {
            imageView.setImageResource(R.drawable.first);
        }
        if (onFirst & onSecond & !onThird) {
            imageView.setImageResource(R.drawable.first_second);
        }
        if (onFirst & !onSecond & onThird) {
            imageView.setImageResource(R.drawable.first_thrid);
        }
        if (onFirst & onSecond & onThird) {
            imageView.setImageResource(R.drawable.bases_loaded);
        }
        if (!onFirst & onSecond & !onThird) {
            imageView.setImageResource(R.drawable.second);
        }
        if (!onFirst & onSecond & onThird) {
            imageView.setImageResource(R.drawable.second_thrid);
        }
        if (!onFirst & !onSecond & onThird) {
            imageView.setImageResource(R.drawable.third);
        }

    }

    public void reset(View view) {
        // resets the buttons

        Button button = (Button) findViewById(R.id.team_a_ball);
        button.setEnabled(true);
        Button button1 = (Button) findViewById(R.id.team_a_strike);
        button1.setEnabled(true);
        Button button2 = (Button) findViewById(R.id.team_a_out);
        button2.setEnabled(true);
        Button button3 = (Button) findViewById(R.id.team_a_single);
        button3.setEnabled(true);
        Button button4 = (Button) findViewById(R.id.team_a_double);
        button4.setEnabled(true);
        Button button5 = (Button) findViewById(R.id.team_a_triple);
        button5.setEnabled(true);
        Button button6 = (Button) findViewById(R.id.team_a_hr);
        button6.setEnabled(true);
        Button button7 = (Button) findViewById(R.id.team_b_ball);
        button7.setEnabled(false);
        Button button8 = (Button) findViewById(R.id.team_b_strike);
        button8.setEnabled(false);
        Button button9 = (Button) findViewById(R.id.team_b_out);
        button9.setEnabled(false);
        Button button10 = (Button) findViewById(R.id.team_b_single);
        button10.setEnabled(false);
        Button button11 = (Button) findViewById(R.id.team_b_double);
        button11.setEnabled(false);
        Button button12 = (Button) findViewById(R.id.team_b_triple);
        button12.setEnabled(false);
        Button button13 = (Button) findViewById(R.id.team_b_hr);
        button13.setEnabled(false);

        //reset the balls, strikes, outs, and scores

        scoreTeamA = 0;
        displayScoreTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayScoreTeamB(scoreTeamB);
        ballsTeamA = 0;
        displayBallsTeamA(ballsTeamA);
        strikesTeamA = 0;
        displayStrikesTeamA(strikesTeamA);
        outsTeamA = 0;
        displayOutsTeamA(outsTeamA);
        ballsTeamB = 0;
        displayBallsTeamB(ballsTeamB);
        strikesTeamB = 0;
        displayStrikesTeamB(strikesTeamB);
        outsTeamB = 0;
        displayOutsTeamB(outsTeamB);
        top_bottom = true;
        displayTopBottom(top_bottom);
        inning = 1;
        displayInning(inning);
        gameOver = false;
        displayGameOver(gameOver);
        ImageView imageView = (ImageView) findViewById(R.id.bases);
        imageView.setImageResource(R.drawable.empty);
    }


    public void ballTeamA(View view) {
        ballsTeamA++;
        displayBallsTeamA(ballsTeamA);
        if (ballsTeamA == 4) {
            if (onFirst) {
                if (onSecond) {
                    if (onThird) {
                        scoreTeamA++;
                        displayScoreTeamA(scoreTeamA);
                    } else {
                        onThird = true;
                        setBasesImage(onFirst, onSecond, onThird);
                    }

                } else {
                    onSecond = true;
                    setBasesImage(onFirst, onSecond, onThird);
                }
            } else {
                onFirst = true;
                setBasesImage(onFirst, onSecond, onThird);
            }
            ballsTeamA = 0;
            displayBallsTeamA(ballsTeamA);
            strikesTeamA = 0;
            displayStrikesTeamA(strikesTeamA);
        }

    }

    public void ballTeamB(View view) {
        ballsTeamB++;
        displayBallsTeamB(ballsTeamB);
        if (ballsTeamB == 4) {
            if (onFirst) {
                if (onSecond) {
                    if (onThird) {
                        scoreTeamB++;
                        displayScoreTeamB(scoreTeamB);
                    } else {
                        onThird = true;
                        setBasesImage(onFirst, onSecond, onThird);
                    }

                } else {
                    onSecond = true;
                    setBasesImage(onFirst, onSecond, onThird);
                }
            } else {
                onFirst = true;
                setBasesImage(onFirst, onSecond, onThird);
            }
            ballsTeamB = 0;
            displayBallsTeamB(ballsTeamB);
            strikesTeamB = 0;
            displayStrikesTeamB(strikesTeamB);
        }

    }

    public void strikeTeamA(View view) {
        strikesTeamA++;
        displayStrikesTeamA(strikesTeamA);
        if (strikesTeamA == 3) {
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

            // checks if the game is over
            if (scoreTeamB > scoreTeamA & top_bottom & inning == 9) {
                gameOver = true;
                displayGameOver(gameOver);
                button.setEnabled(false);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                button13.setEnabled(false);

            } else if (!top_bottom & inning == 9) {
                gameOver = true;
                displayGameOver(gameOver);
                button.setEnabled(false);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                button13.setEnabled(false);
            }

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

    public void strikeTeamB(View view) {
        strikesTeamB++;
        displayStrikesTeamB(strikesTeamB);
        if (strikesTeamB == 3) {
            outsTeamB++;
            displayOutsTeamB(outsTeamB);
            ballsTeamB = 0;
            displayBallsTeamB(ballsTeamB);
            strikesTeamB = 0;
            displayStrikesTeamB(strikesTeamB);
        }
        if (outsTeamB == 3) {
            Button button = (Button) findViewById(R.id.team_a_ball);
            button.setEnabled(true);
            Button button1 = (Button) findViewById(R.id.team_a_strike);
            button1.setEnabled(true);
            Button button2 = (Button) findViewById(R.id.team_a_out);
            button2.setEnabled(true);
            Button button3 = (Button) findViewById(R.id.team_a_single);
            button3.setEnabled(true);
            Button button4 = (Button) findViewById(R.id.team_a_double);
            button4.setEnabled(true);
            Button button5 = (Button) findViewById(R.id.team_a_triple);
            button5.setEnabled(true);
            Button button6 = (Button) findViewById(R.id.team_a_hr);
            button6.setEnabled(true);
            Button button7 = (Button) findViewById(R.id.team_b_ball);
            button7.setEnabled(false);
            Button button8 = (Button) findViewById(R.id.team_b_strike);
            button8.setEnabled(false);
            Button button9 = (Button) findViewById(R.id.team_b_out);
            button9.setEnabled(false);
            Button button10 = (Button) findViewById(R.id.team_b_single);
            button10.setEnabled(false);
            Button button11 = (Button) findViewById(R.id.team_b_double);
            button11.setEnabled(false);
            Button button12 = (Button) findViewById(R.id.team_b_triple);
            button12.setEnabled(false);
            Button button13 = (Button) findViewById(R.id.team_b_hr);
            button13.setEnabled(false);

            // checks if the game is over
            if (inning == 9) {
                gameOver = true;
                displayGameOver(gameOver);
                button.setEnabled(false);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                button13.setEnabled(false);
            }

            // sets the inning display
            if (top_bottom) {
                top_bottom = false;
                displayTopBottom(top_bottom);
                outsTeamB = 0;
            } else {
                top_bottom = true;
                displayTopBottom(top_bottom);
                inning++;
                displayInning(inning);
                outsTeamB = 0;
            }
            outsTeamB = 0;
            displayOutsTeamB(outsTeamB);
        }
    }

    public void outTeamA(View view) {
        outsTeamA++;
        ballsTeamA = 0;
        displayBallsTeamA(ballsTeamA);
        strikesTeamA = 0;
        displayStrikesTeamA(strikesTeamA);
        if (outsTeamA == 3) {
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

            if (scoreTeamB > scoreTeamA & top_bottom & inning == 9) {
                gameOver = true;
                displayGameOver(gameOver);
                button.setEnabled(false);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                button13.setEnabled(false);

            } else if (!top_bottom & inning == 9) {
                gameOver = true;
                displayGameOver(gameOver);
                button.setEnabled(false);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                button13.setEnabled(false);
            }

            if (top_bottom) {
                top_bottom = false;
                displayTopBottom(top_bottom);
                outsTeamA = 0;
            } else {
                top_bottom = true;
                displayTopBottom(top_bottom);
                inning++;
                displayInning(inning);
                outsTeamA = 0;
            }
        }
        displayOutsTeamA(outsTeamA);
    }

    public void outTeamB(View view) {
        outsTeamB++;
        ballsTeamB = 0;
        displayBallsTeamB(ballsTeamB);
        strikesTeamB = 0;
        displayStrikesTeamB(strikesTeamB);
        if (outsTeamB == 3) {
            Button button = (Button) findViewById(R.id.team_a_ball);
            button.setEnabled(true);
            Button button1 = (Button) findViewById(R.id.team_a_strike);
            button1.setEnabled(true);
            Button button2 = (Button) findViewById(R.id.team_a_out);
            button2.setEnabled(true);
            Button button3 = (Button) findViewById(R.id.team_a_single);
            button3.setEnabled(true);
            Button button4 = (Button) findViewById(R.id.team_a_double);
            button4.setEnabled(true);
            Button button5 = (Button) findViewById(R.id.team_a_triple);
            button5.setEnabled(true);
            Button button6 = (Button) findViewById(R.id.team_a_hr);
            button6.setEnabled(true);
            Button button7 = (Button) findViewById(R.id.team_b_ball);
            button7.setEnabled(false);
            Button button8 = (Button) findViewById(R.id.team_b_strike);
            button8.setEnabled(false);
            Button button9 = (Button) findViewById(R.id.team_b_out);
            button9.setEnabled(false);
            Button button10 = (Button) findViewById(R.id.team_b_single);
            button10.setEnabled(false);
            Button button11 = (Button) findViewById(R.id.team_b_double);
            button11.setEnabled(false);
            Button button12 = (Button) findViewById(R.id.team_b_triple);
            button12.setEnabled(false);
            Button button13 = (Button) findViewById(R.id.team_b_hr);
            button13.setEnabled(false);

            if (inning == 9) {
                gameOver = true;
                displayGameOver(gameOver);
                button.setEnabled(false);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                button13.setEnabled(false);
            }

            if (top_bottom) {
                top_bottom = false;
                displayTopBottom(top_bottom);
                outsTeamB = 0;
            } else {
                top_bottom = true;
                displayTopBottom(top_bottom);
                inning++;
                displayInning(inning);
                outsTeamB = 0;
            }
        }
        displayOutsTeamB(outsTeamB);
    }


    public void singleTeamA(View view) {
        if (onThird) {
            scoreTeamA++;
            displayScoreTeamA(scoreTeamA);
            onThird = false;
        }
        if (onSecond) {
            onThird = true;
            onSecond = false;
        }
        if (onFirst) {
            onSecond = true;
            onFirst = false;
        }
        onFirst = true;
        setBasesImage(onFirst, onSecond, onThird);
    }

    public void doubleTeamA(View view) {
        if (onThird) {
            scoreTeamA++;
            displayScoreTeamA(scoreTeamA);
            onThird = false;
        }
        if (onSecond) {
            scoreTeamA++;
            displayScoreTeamA(scoreTeamA);
            onSecond = false;
        }
        if (onFirst) {
            onThird = true;
            onFirst = false;
        }
        onSecond = true;
        setBasesImage(onFirst, onSecond, onThird);
    }

    public void tripleTeamA(View view) {
        if (onThird) {
            scoreTeamA++;
            displayScoreTeamA(scoreTeamA);
            onThird = false;
        }
        if (onSecond) {
            scoreTeamA++;
            displayScoreTeamA(scoreTeamA);
            onSecond = false;
        }
        if (onFirst) {
            scoreTeamA++;
            displayScoreTeamA(scoreTeamA);
            onFirst = false;
        }
        onThird = true;
        setBasesImage(onFirst, onSecond, onThird);
    }

    public void hrTeamA(View view) {
        if (onThird) {
            scoreTeamA++;
            displayScoreTeamA(scoreTeamA);
            onThird = false;
        }
        if (onSecond) {
            scoreTeamA++;
            displayScoreTeamA(scoreTeamA);
            onSecond = false;
        }
        if (onFirst) {
            scoreTeamA++;
            displayScoreTeamA(scoreTeamA);
            onFirst = false;
        }
        scoreTeamA++;
        displayScoreTeamA(scoreTeamA);
        setBasesImage(onFirst, onSecond, onThird);
    }

    public void singleTeamB(View view) {
        if (onThird) {
            scoreTeamB++;
            displayScoreTeamB(scoreTeamB);
            onThird = false;
        }
        if (onSecond) {
            onThird = true;
            onSecond = false;
        }
        if (onFirst) {
            onSecond = true;
            onFirst = false;
        }
        onFirst = true;
        setBasesImage(onFirst, onSecond, onThird);
    }

    public void doubleTeamB(View view) {
        if (onThird) {
            scoreTeamB++;
            displayScoreTeamB(scoreTeamB);
            onThird = false;
        }
        if (onSecond) {
            scoreTeamB++;
            displayScoreTeamB(scoreTeamB);
            onSecond = false;
        }
        if (onFirst) {
            onThird = true;
            onFirst = false;
        }
        onSecond = true;
        setBasesImage(onFirst, onSecond, onThird);
    }

    public void tripleTeamB(View view) {
        if (onThird) {
            scoreTeamB++;
            displayScoreTeamB(scoreTeamB);
            onThird = false;
        }
        if (onSecond) {
            scoreTeamB++;
            displayScoreTeamB(scoreTeamB);
            onSecond = false;
        }
        if (onFirst) {
            scoreTeamB++;
            displayScoreTeamB(scoreTeamB);
            onFirst = false;
        }
        onThird = true;
        setBasesImage(onFirst, onSecond, onThird);
    }

    public void hrTeamB(View view) {
        if (onThird) {
            scoreTeamB++;
            displayScoreTeamB(scoreTeamB);
            onThird = false;
        }
        if (onSecond) {
            scoreTeamB++;
            displayScoreTeamB(scoreTeamB);
            onSecond = false;
        }
        if (onFirst) {
            scoreTeamB++;
            displayScoreTeamB(scoreTeamB);
            onFirst = false;
        }
        scoreTeamB++;
        displayScoreTeamB(scoreTeamB);
        setBasesImage(onFirst, onSecond, onThird);
    }

}

