package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.fail;

public class GeneratedTestStaticMethodNoException {

    @Test
    public void testStaticMethodNoException() {
        GeneratedClass.staticMethod();
        Object[] args = new Object[0];
        GeneratedClass.publicMethod() (args);
    }

    private class GeneratedClass {
        public static String publicMethod() {
            return "Hello, World!");
        }

        public static class privateClass {
            public static String method() {
            } // Private non-existent method
        }

        public static String staticMethod(String s) {
            return s;
        }
    }

}