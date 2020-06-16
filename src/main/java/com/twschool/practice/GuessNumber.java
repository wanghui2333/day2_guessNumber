package com.twschool.practice;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-06-16 18:11
 */
public class GuessNumber {

    public String game() {

        return generateNumber();
    }

    private String generateNumber(){

        return "4A0B";
    }



    public static String playGame(String input) throws Exception {
        if(!GuessInputCommand.judgeInputFormat(input)) {
            return "error";
        }

        String[] answer = { "1", "2", "3", "4" };
        // 值正确，位置不正确
        int valueCount = 0;
        // 值正确，位置正确
        int positionCount = 0;

        String[] result = input.split(" ");
        for (int j = 0; j < result.length; j++) {
            for (int k = 0; k < answer.length; k++) {
                if (result[j].equals(answer[k])) {
                    // 位置相等
                    if (j == k) {
                        positionCount++;
                    } else {
                        // 只有值相等
                        valueCount++;
                    }
                }
            }
        }
        return positionCount + "A" + valueCount + "B";
    }


}
