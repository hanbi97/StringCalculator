import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    int add(String input) {
        int result = 0;
        if (input==null||input.isEmpty()) {
            return result;
        }
        if (input.contains(",")){
            String[] values = input.split(",");
            for(String val : values){
                result += Integer.parseInt(val);
            }
            return result;
        }
        return Integer.parseInt(input);
    }
}
