package com.sun.tools.xjc.addon.xew;

public class GeneratedTestIsValidName {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testIsValidName() {
        // Given
        Element element = new Element();

        // When
        isValidName(element);

        // Then
        assertFalse(getPropertyInfo(element, "attribute").isValidName());
    }

}