package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestIsPublicMethodPresent {

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
    public void testIsPublicMethodPresent() {
        System.out.println(isPublicMethodPresent("java.lang.Math", "sin"));
        System.out.println(isPublicMethodPresent("java.lang.Math", "cos"));
    }

    private static int add(int a, int b) {
        return a + b;
    }

}