import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    private StringCalculator c;

    @Before
    public void setUp() {
        c = new StringCalculator();
        System.out.println("set up");
    }

    @Test
    public void add_null_or_empty() {
        /** do not check the calculation result with my eyes **/
        //System.out.println(cal.add(1,2));

        /** assertEquals **/
        assertEquals(0, c.add(""));
        assertEquals(0, c.add(null));
    }

    @Test
    public void add_one_number() {
        /** assertEquals **/
        assertEquals(123, c.add("123"));
    }

    @After
    public void finished() {
        System.out.println("test done");
    }
}
