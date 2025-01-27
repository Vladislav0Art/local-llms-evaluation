package com.sun.tools.xjc.addon.xew;

public class GeneratedSetPrivateFieldTest {

    @Test
    public void setPrivateFieldTest() {
        // Given
        JClass obj = null;
        Object value = "value";

        // When
        XmlElementWrapperPlugin.setPrivateField(obj, "privateField", value);

        // Then
        assertEquals(value, getPrivateField(obj, "privateField"));
    }

}