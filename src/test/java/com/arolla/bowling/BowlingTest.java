package com.arolla.bowling;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BowlingTest {

    @Test
    void should_return_zero_when_never_score() {
        // Given
        Bowling bowling = new Bowling();

        // When
        for(int i =0; i< 10; i++) {
            bowling.score(i, 0);
        }

        // Then
        assertEquals(bowling.getScore(), 0);

    }
}