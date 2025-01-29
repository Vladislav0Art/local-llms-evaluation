package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicMethod {

    @Test
    public void testPublicMethod() {
        public class MainTest extends TestBase {
            @Override
            protected String getExpectedResult(String input) throws Exception {
                return "Hello";
            }
        }

        MainTest mainTest = new MainTest();
        String result = mainTest.getExpectedResult("hello");
        assertEquals("Hello", result);
    }

}