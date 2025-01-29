package org.traccar.protocol;

public class GeneratedTestHello {

    public static String hello(String name) {
        return "Hello, " + name;
    }
}

public class TestHello {

    @Test
    public void testHello() {
        System.out.println(HelloverHello.hello("World"));  // Should print: Hello, World!
    }

    private static class HelloWorldTest {
        public static String hello(String name) {
            return "Hello, " + name;
        }
    }

}