package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPrivateField {

    @Test
    public void testGetPrivateField() {
        Object privateValue = getPrivateField(jclass, "test-attribute");
        assertNotNull(privateValue);
    }

}