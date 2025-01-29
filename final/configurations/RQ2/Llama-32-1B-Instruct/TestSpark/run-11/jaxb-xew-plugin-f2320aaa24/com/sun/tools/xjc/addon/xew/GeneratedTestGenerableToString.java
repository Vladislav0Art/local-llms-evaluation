package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGenerableToString {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testGenerableToString() {
        // Given
        Element element = new Element();

        // When
        String result = generableToString(element);

        // Then
        assertEquals("value", result);
    }

}