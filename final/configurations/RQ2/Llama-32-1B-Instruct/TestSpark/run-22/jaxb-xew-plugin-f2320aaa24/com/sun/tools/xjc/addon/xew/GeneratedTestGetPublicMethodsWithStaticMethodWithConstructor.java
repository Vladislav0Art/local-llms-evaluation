package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPublicMethodsWithStaticMethodWithConstructor {

    @Test
    public void testGetPublicMethodsWithStaticMethodWithConstructor() {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a constructor from the class
        Method constructor = jclass1.getMethod("test", String[].class, int[].class);

        // Check if it is not empty
        assertTrue(constructor != null);
    }

}