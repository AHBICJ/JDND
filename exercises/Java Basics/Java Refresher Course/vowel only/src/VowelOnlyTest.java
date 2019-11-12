import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VowelOnlyTest {

    @Test
    public void vowelOnlyTest1() throws Exception {
        String input = "Hello World!";
        String output = VowelOnly.vowelOnly(input);
        String expected = "eoo";
        Assertions.assertEquals(expected, output);
    }

    @Test
    public void vowelOnlyTest2() throws Exception {
        String input = "Udacity Courses";
        String output = VowelOnly.vowelOnly(input);
        String expected = "Uaioue";
        Assertions.assertEquals(expected, output);
    }
}