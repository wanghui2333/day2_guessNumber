package com.twschool.practice;

import org.junit.Test;

public class GuessNumberTest {

    @Test
    public void should_return_true_given_1234(){

        String input = "1 2 3 4";
        boolean actual = GuessInputCommand.judgeInputFormat(input);

        assert actual == true;
    }

    @Test
    public void should_return_false_given_134(){

        String input = "1 3 4";
        boolean actual = GuessInputCommand.judgeInputFormat(input);

        assert actual == false;
    }

    @Test
    public void should_return_true_given_void(){
        GuessNumber guessNumber = new GuessNumber();
        String number = guessNumber.generateNumber();
        boolean actual = GuessInputCommand.judgeInputFormat(number);

        assert actual == true;

    }


}