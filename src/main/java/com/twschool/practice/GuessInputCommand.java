package com.twschool.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-06-16 17:11
 */
public class GuessInputCommand {

    private BufferedReader bufferedReader;

    public GuessInputCommand() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String input() throws IOException {
        System.out.println("------请输入答案，格式 x x x x , x < 10 ------");
        return bufferedReader.readLine();
    }
}
