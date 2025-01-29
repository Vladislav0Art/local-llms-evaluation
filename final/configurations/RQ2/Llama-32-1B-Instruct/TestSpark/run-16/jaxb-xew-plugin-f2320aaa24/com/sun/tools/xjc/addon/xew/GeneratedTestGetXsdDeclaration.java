package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetXsdDeclaration {

    @Test
    public void testGetXsdDeclaration() {
        // Arrange
        JClass class =mock(JClass.class);

        // Act
        ObjectUtils.setField( class,"xsdDeclaration", "xsdDeclarationValue");

        // Assert
        assertEquals("xsdDeclarationValue", getXsdDeclaration( class).toString());
    }

}