package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicStaticMethodWithException {

    @Test
    public void testPublicStaticMethodWithException() {
        public class MainClass {
            static public String getHelloMessage() throws Exception {
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