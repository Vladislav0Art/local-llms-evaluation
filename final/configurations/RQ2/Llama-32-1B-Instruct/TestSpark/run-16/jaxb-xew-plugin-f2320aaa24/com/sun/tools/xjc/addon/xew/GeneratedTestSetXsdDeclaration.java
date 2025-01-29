package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetXsdDeclaration {

    @Test
    public void testSetXsdDeclaration() {
        // Arrange
        JClass class =mock(JClass.class);

        // Act
        setXsdDeclaration( class,"xsdDeclarationValue");

        // Assert
        assertEquals("xsdDeclarationValue", getXsdDeclaration( class).toString());
    }

}