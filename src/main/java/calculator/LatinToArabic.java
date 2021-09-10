package calculator;

public class LatinToArabic {
    private final Integer[] digits = new Integer[2];
    private final String firstDigit;
    private final String secondDigit;

    public LatinToArabic(String string, String string1) {
        this.firstDigit = string;
        this.secondDigit = string1;
    }

    public Integer[] getDigits() {
        digits[0] = checkDigit(firstDigit);
        digits[1] = checkDigit(secondDigit);
        return digits;
    }

    private Integer checkDigit(String digit) {
        // поскольку по условиям задания число может быть только до 10, проще рассмотреть все варианты, чем делать полный разбор
        digit = digit.toUpperCase();
        Integer result = 0;
        if (digit.equals("I")) {
            result = 1;
        } else if (digit.equals("II")) {
            result = 2;
        } else if (digit.equals("III")) {
            result = 3;
        } else if (digit.equals("IV")) {
            result = 4;
        } else if (digit.equals("V")) {
            result = 5;
        } else if (digit.equals("VI")) {
            result = 6;
        } else if (digit.equals("VII")) {
            result = 7;
        } else if (digit.equals("VIII")) {
            result = 8;
        } else if (digit.equals("IX")) {
            result = 9;
        } else if (digit.equals("X")) {
                result = 10;
        }
        return result;
    }

}
