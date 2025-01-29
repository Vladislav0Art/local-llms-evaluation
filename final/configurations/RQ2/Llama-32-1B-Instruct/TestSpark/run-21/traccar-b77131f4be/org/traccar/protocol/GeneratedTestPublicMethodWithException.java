package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicMethodWithException {

    @Test
    public void testPublicMethodWithException() {
        public class MainTest extends TestBase {
            @Override
            protected String getExpectedResult(String input) throws Exception {
                throw new RuntimeException();
            }
        }

        MainTest mainTest = new MainTest();
        try {
            mainTest.getExpectedResult("hello");
        } catch (RuntimeException e) {
            assertEquals("Hello", e.getMessage());
        }
    }

}