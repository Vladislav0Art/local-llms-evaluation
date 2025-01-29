package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPrivateFieldValues {

    @Test
    public void testGetPrivateFieldValues() {
        // Arrange
        JClass class =mock(JClass.class);

        // Act
        ObjectUtils.setField( class,"privateValue", new CustomizationUtils());

        // Assert
        assertEquals("privateValue", getPrivateField( class).getValue());
    }

}