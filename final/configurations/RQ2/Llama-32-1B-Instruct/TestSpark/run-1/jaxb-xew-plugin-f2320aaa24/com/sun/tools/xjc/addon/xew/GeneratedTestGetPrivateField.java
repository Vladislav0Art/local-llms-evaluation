package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPrivateField {

    @Test
    public void testGetPrivateField() {
        JClass clazz = getTestClass("com.sun.tools.xjc.addon.xew.TestXmlElementWrapperPlugin");
        setPrivateField(clazz.getDeclaredFields(), "custom", "X");
    }

}