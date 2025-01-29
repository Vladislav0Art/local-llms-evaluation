package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrivateMethod {

    @Test
    public void testPrivateMethod() {
        public class MainClass {
            private static String getHelloMessage() {
                return "Hello";
            }
        }

        MainClass mainClass = new MainClass();
        String result = mainClass.getHelloMessage();
        assertEquals("Hello", result);
    }

}