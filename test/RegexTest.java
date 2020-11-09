import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
public class RegexTest {
    @Test
    public void pattern_test(){
        Pattern pattern = Pattern.compile("//(.)\n(.*)");
        String input="//?\n1?2?3";
        Matcher matcher = pattern.matcher(input);
        if(matcher.find())
            assertEquals("?",matcher.group(1));
    }
}
