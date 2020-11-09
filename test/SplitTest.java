import org.junit.Test;
import static org.junit.Assert.*;
/**
 * main에서 test 하지 말고 따로 코드 만들어서 test
 **/
public class SplitTest {
    @Test
    public void split(){
        assertArrayEquals(new String[] {"1","2"},"1,2".split(","));
        assertArrayEquals(new String[] {"1"},"1".split(","));
    }
}
