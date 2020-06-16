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


    private static boolean judgeInputFormat(String input) {
        // 去除空字符
        input = input.replace(" ", "");
        if(input.length() != 4) {
            return false;
        }

        //相同字符串去重
        StringBuffer sb = new StringBuffer(input);

        String rs = sb.reverse().toString().replaceAll("(.)(?=.*\\1)", "");

        StringBuffer out = new StringBuffer(rs);
        String result = out.reverse().toString();
        if(result.length() != 4) {
            return false;
        }

        return true;
    }

}
