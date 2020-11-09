import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String input) {
        if (isBlank(input)) return 0;
        return sum(toInteger(input.split(",|:")));
    }

    /**
     * Check if input is Blank or not
     */
    private Boolean isBlank(String input) {
        if (input == null || input.isEmpty()) return true;
        return false;
    }

    /**
     * String to Int
     */
    private int[] toInteger(String[] values) {
        int[] nums = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            nums[i] = Integer.parseInt(values[i]);
        }
        return nums;
    }

    /**
     * 합"만" 구해야 함
     */
    private int sum(int[] values) {
        int result = 0;
        for (int val : values) {
            result += val;
        }
        return result;
    }

}
