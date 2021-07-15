package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllDigitsFromText {
    public static int extractAllDigits(String text) {
        String number = "";
        String digits = "\\d+";
        int numberInt;

        Pattern pattern = Pattern.compile(digits);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find() == true) {
            int startIndex = matcher.start();
            int finishIndex = matcher.end();
            number += text.substring(startIndex, finishIndex);
        }
        numberInt = Integer.parseInt(number);
        return numberInt;
    }

    public static void main(String[] args) {
        String text = "21ada13";
        System.out.println(extractAllDigits(text));
    }
}
