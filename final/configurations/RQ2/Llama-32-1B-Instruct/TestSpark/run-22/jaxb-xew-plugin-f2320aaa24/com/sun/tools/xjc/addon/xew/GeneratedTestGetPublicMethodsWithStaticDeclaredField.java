package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPublicMethodsWithStaticDeclaredField {

    @Test
    public void testGetPublicMethodsWithStaticDeclaredField() {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a field from the class
        Field field = jclass1.getStaticDeclaredField("privateField", Boolean.class);

        // Check if it is not empty
        assertTrue(field != null);
    }

}