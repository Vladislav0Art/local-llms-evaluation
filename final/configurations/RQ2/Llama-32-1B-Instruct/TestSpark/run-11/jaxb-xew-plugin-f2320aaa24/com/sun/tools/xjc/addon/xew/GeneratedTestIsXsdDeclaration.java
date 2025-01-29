package com.sun.tools.xjc.addon.xew;

public class GeneratedTestIsXsdDeclaration {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testIsXsdDeclaration() {
        // Given
        Element element = new Element();
        addXsdDeclaration(element);

        // When
        isXsdDeclaration(element);

        // Then
        assertTrue(getPropertyInfo(element, "attribute").isXsdDeclaration());
    }

}