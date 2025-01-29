package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetXsdMethod {

    @Test
    public void testGetXsdMethod() {
        // Arrange
        JClass class =mock(JClass.class);

        // Act
        ObjectUtils.setField( class,"xsmValue", new CustomizationUtils());

        // Assert
        assertEquals("xsmValue", getXsdMethod( class).toString());
    }

}