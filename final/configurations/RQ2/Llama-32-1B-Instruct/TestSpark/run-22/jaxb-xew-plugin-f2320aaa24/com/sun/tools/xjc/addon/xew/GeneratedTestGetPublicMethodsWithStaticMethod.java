package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPublicMethodsWithStaticMethod {

    @Test
    public void testGetPublicMethodsWithStaticMethod() {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a method from the class
        Method method = jclass1.getStaticDeclaredMethod("test");

        // Check if it is not empty
        assertTrue(method != null);
    }

}