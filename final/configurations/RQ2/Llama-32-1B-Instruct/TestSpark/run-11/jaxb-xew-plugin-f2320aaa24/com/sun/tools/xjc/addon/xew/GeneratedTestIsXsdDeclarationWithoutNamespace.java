package com.sun.tools.xjc.addon.xew;

public class GeneratedTestIsXsdDeclarationWithoutNamespace {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testIsXsdDeclarationWithoutNamespace() {
        // Given
        Element element = new Element();
        addXsdDeclaration(element);

        // When
        isXsdDeclarationWithoutNamespace(element);

        // Then
        assertFalse(getPropertyInfo(element, "attribute").isXsdDeclarationWithoutNamespace());
    }

}