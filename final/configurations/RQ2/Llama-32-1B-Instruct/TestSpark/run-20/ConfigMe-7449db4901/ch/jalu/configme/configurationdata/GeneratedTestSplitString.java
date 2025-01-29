package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSplitString {

    private static String publicClass1 = "public class MyClass { }";

    private static String publicMethod1() {
        return "This is a method in public class MyClass.";
    }

    private static String publicMethod2() {
        return "This is another method in the same package as publicMethod1, but outside of it.";
    }

    private static String printString(String str) {
        System.out.println(str);
        return str;
    }

    @Test
    public void testSplitString() {
        System.out.println(splitString("hello world"));
    }

    private static String createPublicClass() {
        StringBuilder builder = new StringBuilder();
        builder.append("public class MyTest { }");
        return builder.toString();
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();

        // Test cases
        System.out.println("Testing public class 1:");
        main.publicClass1();
        assertEquals("public class MyClass { }", main.publicClass1);

        System.out.println("\nTesting public method 1:");
        String result = main.publicMethod1();
        System.out.println(result);

        System.out.println("\nTesting public method 2:");
        result = main.publicMethod2();
        System.out.println(result);

        // Testing methods in different packages
        System.out.println("\nTesting printString function:");
        main.testPrintString();

        System.out.println("Testing isPublicMethodPresent function:");
        boolean isPresent = false;
        for (int i = 0; i < 10; i++) {
            if (!main.isPublicMethodPresent("java.lang.Math", "sin")) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent);

        // Testing add method in different packages
        System.out.println("\nTesting add function:");
        assertEquals(2, (int) main.add(1, 2));

        System.out.println("Testing splitString function:");
        String result = main.splitString("hello world");
        System.out.println(result);
    }

}