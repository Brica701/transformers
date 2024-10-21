package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Arrays;

public class TestChecker {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        OddChecker oddChecker = new OddChecker();
        CheckerUtils.removeIfFailsCheck(oddChecker, numbers);
        System.out.println("Odd numbers: " + numbers);

        ArrayList<String> words = new ArrayList<>(Arrays.asList("hello", "world", "java", "code"));
        LengthChecker lengthChecker = new LengthChecker(5);
        CheckerUtils.removeIfFailsCheck(lengthChecker, words);
        System.out.println("Short words: " + words);
    }
}
