package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {

    @Test
    public void should_return_4A0B_given_void(){
        GuessNumber guessNumber = new GuessNumber();

        String actual = guessNumber.game();
        String expect = "4A0B";

        assert expect.equals(actual);
    }
}