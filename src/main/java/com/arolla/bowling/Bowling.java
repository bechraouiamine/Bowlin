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
        int index = 0;
        for (int frame=0; frame<10; frame++) {
            if (isStrike(index)) {
                score += 10 + framesScore[index+1] + framesScore[index+2];
                index++;
            } else if (isSpare(index)) {
                score += 10 + framesScore[index+2];
                index = index + 2;
            } else {
                score += framesScore[index] + framesScore[index+1];
                index = index + 2;
            }
        }
        return score;
    }

    private boolean isSpare(int index) {
        return framesScore[index] + framesScore[index + 1] == 10;
    }

    private boolean isStrike(int index) {
        return framesScore[index] == 10;
    }

}
