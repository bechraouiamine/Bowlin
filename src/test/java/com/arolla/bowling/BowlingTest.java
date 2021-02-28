package com.arolla.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BowlingTest {

    @Test
    void should_return_zero_when_never_score() {
        // Given
        Bowling bowling = new Bowling();

        // When
        for(int i =1; i<= 10; i++) {
            bowling.score(i, 0);
        }

        // Then
        assertEquals(bowling.getScore(), 0);
    }

    @Test
    void should_return_number_of_pins_when_some_have_fallen() {
        // Given
        Bowling bowling = new Bowling();

        // When
        bowling.score(1, 5);
        for(int i =2; i<= 10; i++) {
            bowling.score(i, 0);
        }

        // Then
        assertEquals(bowling.getScore(), 5);
    }

    @Test
    void should_return_score_24_when_strike_5_and_2_pins() {
        // Given
        Bowling bowling = new Bowling();

        // When
        bowling.score(1, 10);
        bowling.score(2, 5);
        bowling.score(3, 2);
        for(int i =4; i<= 10; i++) {
            bowling.score(i, 0);
        }

        // Then
        assertEquals(bowling.getScore(), 24);
    }
}