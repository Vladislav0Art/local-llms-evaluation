package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPrivateField {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testGetPrivateField() {
        // Given
        Element element = new Element();

        // When
        getPrivateField(element, "field");

        // Then
        assertNotNull(getPrivateField(element, "field"));
    }

}