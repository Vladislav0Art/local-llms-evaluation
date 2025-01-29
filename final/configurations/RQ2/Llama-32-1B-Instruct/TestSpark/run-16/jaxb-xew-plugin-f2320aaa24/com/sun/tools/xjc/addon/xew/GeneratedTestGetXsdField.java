package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetXsdField {

    @Test
    public void testGetXsdField() {
        // Arrange
        JClass class =mock(JClass.class);

        // Act
        ObjectUtils.setField( class,"xsdValue", new CustomizationUtils());

        // Assert
        assertEquals("xsdValue", getXsdField( class).toString());
    }

}