package com.sun.tools.xjc.addon.xew;

public class GeneratedTestHasPropertyNameCustomization {

    @Test
    public void testHasPropertyNameCustomization() {
        JClass classObj = getPrivateField("test", "ElementWrapperPlugin");
        setPrivateField(classObj, "test", new Object());
        checkHasPropertyNameCustomization(classObj);
    }

}