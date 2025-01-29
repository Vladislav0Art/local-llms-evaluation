package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPublicMethodsWithStaticMethodWithConstructorAndFields {

    @Test
    public void testGetPublicMethodsWithStaticMethodWithConstructorAndFields() throws Exception {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a constructor from the class
        Method constructor = jclass1.getMethod("test", String[].class, int[].class);

        // Create an instance of the class and call the static method
        Object[] params = {new String[]{""}};
        Object result = jclass1.invoke(constructor, params);
        assertTrue(result instanceof Boolean);
    }

}