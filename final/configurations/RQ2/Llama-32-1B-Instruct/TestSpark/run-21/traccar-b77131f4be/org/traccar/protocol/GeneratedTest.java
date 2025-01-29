package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

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