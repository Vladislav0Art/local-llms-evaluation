package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrintString {

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
    public void testPrintString() {
        testPrintString(printString(publicClass1));
        testPrintString("Hello World");
    }

    private static boolean isPublicMethodPresent(String module, String methodName) {
        try {
            Class<?> clazz = Class.forName(module);
            Method method = clazz.getMethod(methodName);
            return true;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            return false;
        }
    }

}