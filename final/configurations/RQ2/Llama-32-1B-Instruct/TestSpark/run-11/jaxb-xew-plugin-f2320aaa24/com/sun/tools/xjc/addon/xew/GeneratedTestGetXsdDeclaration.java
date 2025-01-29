package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetXsdDeclaration {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testGetXsdDeclaration() {
        // Given
        Element element = new Element();
        addXsdDeclaration(element);

        // When
        String result = getXsdDeclaration(element);

        // Then
        assertEquals("value", result);
    }

}