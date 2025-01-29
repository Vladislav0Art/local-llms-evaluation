package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrivateMethodWithException {

    @Test
    public void testPrivateMethodWithException() throws Exception {
        public class MainClass {
            private static String getHelloMessage() throws Exception {
                throw new RuntimeException();
            }
        }

        MainClass mainClass = new MainClass();
        try {
            mainClass.getHelloMessage();
        } catch (RuntimeException e) {
            assertEquals("Hello", e.getMessage());
        }
    }

}