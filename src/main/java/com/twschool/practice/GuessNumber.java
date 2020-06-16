package com.twschool.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-06-16 18:11
 */
public class GuessNumber {

    private List<String> history = new ArrayList<>(10);

    public String generateNumber() {

        String number = "";
        for (int i = 0; i < 4; ) {
            String newnumber = String.valueOf((int) (Math.random() * 9));
            if (!number.contains(newnumber)) {
                number = number + newnumber;
                i++;
            }
        }
        return number.replace("", " ").trim();
    }


    public String playGame(String input) {

        return this.playGame(input, this.generateNumber());
    }


    public String playGame(String input, String gameAnswer) {
        if (!GuessInputCommand.judgeInputFormat(input)) {
            return "用户输入格式错误";
        }

        String[] answer = gameAnswer.split(" ");
        // 值正确，位置不正确
        Set<String> correctNumber = new HashSet<>(4);
        // 值正确，位置正确
        Set<String> correctNumberAndPosition = new HashSet<>(4);

        String[] result = input.split(" ");

        for (int j = 0; j < result.length; j++) {
            for (int k = 0; k < answer.length; k++) {
                if (result[j].equals(answer[k])) {
                    // 位置相等
                    if (j == k) {
                        correctNumberAndPosition.add(result[j]);
                    } else {
                        // 只有值相等
                        correctNumber.add(result[j]);
                    }
                }
            }
        }

        String ret = correctNumberAndPosition.size() + "A" + correctNumber.size() + "B";
        history.add(ret);

        return ret;
    }

    public List<String> getHistory() {
        return history;
    }

}
