package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetXsdDeclaration {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testSetXsdDeclaration() {
        // Given
        Element element = new Element();
        addXsdDeclaration(element);

        // When
        setXsdDeclaration(element);

        // Then
        assertEquals("value", getPropertyInfo(element, "attribute").getXsdDeclaration());
    }

}