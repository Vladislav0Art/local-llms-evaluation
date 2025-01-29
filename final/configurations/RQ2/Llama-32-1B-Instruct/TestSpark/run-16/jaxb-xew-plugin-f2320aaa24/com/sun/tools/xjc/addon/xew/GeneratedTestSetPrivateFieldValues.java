package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetPrivateFieldValues {

    @Test
    public void testSetPrivateFieldValues() {
        // Arrange
        JClass class =mock(JClass.class);

        // Act
        setPrivateField( class,"privateValue");

        // Assert
        assertEquals("privateValue", getPrivateField( class).getValue());
    }

}