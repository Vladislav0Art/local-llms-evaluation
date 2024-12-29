package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetPrivateField {

    @Test
    public void testSetPrivateField() {
        JClass clazz = getTestClass("com.sun.tools.xjc.addon.xew.TestXmlElementWrapperPlugin");
        setPrivateField(clazz.getDeclaredFields(), "custom", "X");
    }

    private static JClass getTestClass(String name) {
        // Replace with actual method to get class from package
        return null;
    }

}