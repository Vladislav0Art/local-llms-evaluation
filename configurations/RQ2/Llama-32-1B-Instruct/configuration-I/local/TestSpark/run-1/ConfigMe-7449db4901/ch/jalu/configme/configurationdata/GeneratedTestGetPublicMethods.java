package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPublicMethods {

    @Test
    public void testGetPublicMethods() {
        String[] methodNames = {"myMethod1", "myMethod2"};
        assertEquals(methodNames.length, TestUtils.getPublicMethods().length);
        for (String methodName : methodNames) {
            if (methodName.startsWith("My")) {
                assertEquals(methodName.substring(3), UtilsUtils.getPUBLIC_METHOD_NAMES()[0]);
            } else {
                assertEquals(methodName, UtilsUtils.getPUBLIC_METHOD_NAMES()[0]);
            }
        }
    }

    public static String getPublicClassName() {
        return "MyClass1";
    }

    public static String[] getPublicMethods() {
        return {"myMethod1", "myMethod2"};
    }

    public static String[] getPUBLIC_METHOD_NAMES() {
        return {"myMethod1", "myMethod2"};
    }

}