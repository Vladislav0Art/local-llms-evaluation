package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPrivateField {

    @Test
    public void testGetPrivateField() {
        JClass classContainer = getClass();
        privateField(classContainer, "x", "y");
        getPrivateField(classContainer, "x");

        ObjectUtils.assertNotNull(getPrivateField(classContainer, "x"));
    }

}