package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPublicMethodsWithInstanceMethod {

    @Test
    public void testGetPublicMethodsWithInstanceMethod() throws Exception {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get an instance method from the class
        Method method = jclass1.getMethod("test");

        // Check if it is not empty
        assertTrue(method != null);
    }

}