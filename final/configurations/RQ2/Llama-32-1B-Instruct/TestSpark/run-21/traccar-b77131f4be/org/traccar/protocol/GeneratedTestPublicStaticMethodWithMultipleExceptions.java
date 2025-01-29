package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicStaticMethodWithMultipleExceptions {

    @Test
    public void testPublicStaticMethodWithMultipleExceptions() throws Exception {
        public class MainClass {
            static public String getHelloMessage() {
                throw new RuntimeException();
                return "Hello";
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