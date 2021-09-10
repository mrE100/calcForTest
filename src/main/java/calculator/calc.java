package calculator;

import calculator.Exceptions.UnknownOperandException;

public class calc {
    private Integer[] digits = new Integer[2];
    private String operand;

    public calc(Integer[] digits, String string) {
        this.digits = digits;
        this.operand = string;
    }


    public Integer calculate() throws UnknownOperandException {
        if (operand.equals("+")) {
            return digits[0] + digits[1];
        } else if (operand.equals("-")) {
            return digits[0] - digits[1];
        } else if (operand.equals("*")) {
            return digits[0] * digits[1];
        } else if (operand.equals("/")) {
            return digits[0] / digits[1];
        }
        throw new UnknownOperandException();
    }
}
