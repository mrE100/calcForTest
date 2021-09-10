package calculator;

import calculator.Exceptions.OutOfRomanRangeException;

public class printResult {
    private final Integer result;
    private final boolean isRoman;
    public printResult(Integer calculate, boolean isRoman) {
        this.result = calculate;
        this.isRoman = isRoman;
    }

    public void print() throws OutOfRomanRangeException {
        if (!isRoman) {
            System.out.println(result);
        } else if (result <= 0) {
            throw new OutOfRomanRangeException();
        } else {
            System.out.println(new ArabicToRoman(result).getResult());
        }
    }
}
