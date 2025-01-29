package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPublicMethodsWithConstructor {

    @Test
    public void testGetPublicMethodsWithConstructor() {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a constructor from the class
        Method constructor = jclass1.getConstructors()[0];

        // Check if it is not empty
        assertTrue(constructor != null);
    }

}