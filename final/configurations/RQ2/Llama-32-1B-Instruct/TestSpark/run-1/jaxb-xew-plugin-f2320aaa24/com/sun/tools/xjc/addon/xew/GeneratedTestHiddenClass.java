package com.sun.tools.xjc.addon.xew;

public class GeneratedTestHiddenClass {

    @Test
    public void testHiddenClass() {
        JClass clazz = getTestClass("com.sun.tools.xjc.addon.xew.TestXmlElementWrapperPlugin");
        setPrivateField(clazz.getDeclaredFields(), "custom", "X");
    }

}