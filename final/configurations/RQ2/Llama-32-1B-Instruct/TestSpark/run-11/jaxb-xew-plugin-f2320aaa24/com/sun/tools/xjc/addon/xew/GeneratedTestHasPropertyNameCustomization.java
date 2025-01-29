package com.sun.tools.xjc.addon.xew;

public class GeneratedTestHasPropertyNameCustomization {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testHasPropertyNameCustomization() {
        // Given
        Element element = new Element();

        // When
        hasPropertyNameCustomization(element);

        // Then
        assertTrue(getPropertyInfo(element, "attribute").hasCustomization());
    }

}