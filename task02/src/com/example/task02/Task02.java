package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        //
        long number = Long.parseLong(input);
        if (number >= -128 && number < 128)
            return "byte";
        if (number >= -32768 && number < 32768)
            return "short";
        if (number >= -2147483648 && number < 2147483648L)
            return "int";
        return "long";
    }

    public static void main(String[] args) {


        String result = solution("12345");
        System.out.println(result);

    }

}
