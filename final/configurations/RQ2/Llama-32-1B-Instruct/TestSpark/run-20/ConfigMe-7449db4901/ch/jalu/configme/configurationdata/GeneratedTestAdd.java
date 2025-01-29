package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAdd {

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
    public void testAdd() {
        assertEquals(2, (int) Main.add(1, 2));
    }

    private static String splitString(String str) {
        StringBuilder builder = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

}