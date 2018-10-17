package sonarexample;

import org.junit.Ignore;
import org.junit.Test;

public class HelloWorldUnitTest {

    @Test
    public void test() {
        new HelloWorld().coveredByUnitTest();
    }

    @Test
    public void skipTest() {
        new HelloWorld().coveredByUnitTest();
    }

    @Ignore
    public void skipTest2() {
        new HelloWorld().coveredByUnitTest();
    }

}
