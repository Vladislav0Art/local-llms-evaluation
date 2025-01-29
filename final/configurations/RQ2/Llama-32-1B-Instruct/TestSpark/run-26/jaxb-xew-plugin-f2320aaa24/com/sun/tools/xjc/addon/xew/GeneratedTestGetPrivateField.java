package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPrivateField {

    @Test
    public void testGetPrivateField() {
        JClass classObj = getPrivateField("test", "ElementWrapperPlugin");
        setPrivateField(classObj, "test", new Object());
        checkPrivateField(classObj);
    }

}