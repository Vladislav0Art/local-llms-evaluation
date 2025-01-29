package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPublicMethods {

    @Test
    public void testGetPublicMethods() {
        JClass jclass1 = jclass(XmlElementWrapper.class, List.class);

        // Get a list of methods from the class
        Method[] methods = jclass1.getStaticDeclaredMethodList();

        // Check if the list is not empty
        assertTrue(methods.length > 0);
    }

}