package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetPrivateField {

    @Test
    public void testSetPrivateField() {
        // Arrange
        JAnnotatable annotation = mock(JAnnotatable.class);

        // Act
        setPrivateField(annotation, "privateValue");

        // Assert
        assertEquals("privateValue", getPrivateField(annotation).getValue());

        ObjectUtils.setField(annotation, "anotherField", "anotherValue");
        assertEquals("anotherValue", getPrivateField(annotation).getValue());
    }

}