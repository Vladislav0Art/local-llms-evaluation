package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicStaticMethod {

    @Test
    public void testPublicStaticMethod() {
        public class MainClass {
            static public String getHelloMessage() {
                return "Hello";
            }
        }

        MainClass mainClass = new MainClass();
        String result = mainClass.getHelloMessage();
        assertEquals("Hello", result);
    }

}