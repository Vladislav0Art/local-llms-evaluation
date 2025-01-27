package com.sun.tools.xjc.addon.xew;

public class GeneratedGetPrivateFieldTest {

    @Test
    public void getPrivateFieldTest() {
        // Given
        JClass obj = null;

        // When
        Object result = XmlElementWrapperPlugin.getPrivateField(obj, "privateField");

        // Then
        assertNull(result);
    }

}