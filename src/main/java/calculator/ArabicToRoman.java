package calculator;

public class ArabicToRoman {
    private final Integer result;
    private static int[]    numbers = {100, 50, 10,    9,    5,    4,    1 };
    private static String[] letters = {"C", "L", "X",  "IX", "V",  "IV", "I" };

    public ArabicToRoman(Integer result) {
        this.result = result;
    }

    public String getResult() {
        String roman = "";
        int N = result;
        for (int i = 0; i < numbers.length; i++) {
            while (N >= numbers[i]) {
                roman += letters[i];
                N -= numbers[i];
            }
        }
        return roman;
    }
}
