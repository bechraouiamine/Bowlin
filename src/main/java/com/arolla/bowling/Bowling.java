package com.arolla.bowling;

/**
 * Created by aminebechraoui, on 28/02/2021, in com.arolla.bowling
 */
public class Bowling {
    private int score;

    public void score(int frame, int pins) {
        score += pins;
    }

    public int getScore() {
        return score;
    }
}
