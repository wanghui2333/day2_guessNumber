package com.twschool.practice;

import java.io.IOException;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-06-16 20:49
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int count = 6;
        GuessNumber guessNumber = new GuessNumber();
        GuessInputCommand guessInputCommand = new GuessInputCommand();
        String answer = guessNumber.generateNumber();

        while (count-- > 0){
            String input = guessInputCommand.input();

            String result = guessNumber.playGame(input, answer);

            if ("4A0B".equals(result)){
                System.out.println("win, all correct");
            }else {
                System.out.println(result + ":try again!");
            }
        }
    }
}
