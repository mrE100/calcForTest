package calculator;

import calculator.Exceptions.DifferentTypesException;
import calculator.Exceptions.OutOfDeclaredRangeException;
import calculator.Exceptions.TooManyOperandsException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        boolean isRoman = false;
        String[] strings = input.toString().split(" ");
        if (strings.length > 2) {
            throw new TooManyOperandsException();
        }
        Integer[] digits = new Integer[2];
        try {
            digits[0] = Integer.parseInt(strings[0]);
            digits[1] = Integer.parseInt(strings[2]);
            if (digits[0] < 1 || digits[0] > 10 || digits[1] < 1 || digits[1] > 10) {
                throw new OutOfDeclaredRangeException();
            }
        } catch (NumberFormatException e) {
            digits = new LatinToArabic(strings[0], strings[2]).getDigits();
            if (digits[0] == 0 || digits[1] == 0) {
                throw new DifferentTypesException();
            }
            isRoman = true;
        }

        new printResult(new calc(digits, strings[1]).calculate(), isRoman).print();

    }

}
