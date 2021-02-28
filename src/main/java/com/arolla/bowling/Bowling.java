package com.arolla.bowling;

/**
 * Created by aminebechraoui, on 28/02/2021, in com.arolla.bowling
 */
public class Bowling {
    private int[] framesScore = new int[21];
    private int score;

    public void score(int frame, int pins) {
        framesScore[frame] = pins;
    }

    public int getScore() {
        for (int i=0; i<20; i++) {
            if (framesScore[i] == 10) {
                score += 10 + framesScore[i+1] + framesScore[i+2];
            } else if (framesScore[i] + framesScore[i+1] == 10) {
                score += 10 + framesScore[i+2];
                i++;
            } else {
                score += framesScore[i];
            }
        }
        return score;
    }

}
