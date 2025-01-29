package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPrivateFields {

    @Test
    public void testGetPrivateFields() {
        // Arrange
        JClass class =mock(JClass.class);

        // Act
        setPrivateField( class,"privateField", "privateValue");

        // Assert
        assertEquals("privateField", getPrivateField( class).getValue());

        ObjectUtils.setField( class,"anotherField", "anotherValue");
        assertEquals("anotherValue", getPrivateField( class).getValue());
    }

}