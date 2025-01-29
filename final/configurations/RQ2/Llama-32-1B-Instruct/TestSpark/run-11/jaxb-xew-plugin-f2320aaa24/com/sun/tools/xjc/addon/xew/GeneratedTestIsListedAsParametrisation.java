package com.sun.tools.xjc.addon.xew;

public class GeneratedTestIsListedAsParametrisation {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testIsListedAsParametrisation() {
        // Given
        Element element = new Element();
        addAnnotation(element, "annotation");

        // When
        isListedAsParametrisation(element);

        // Then
        assertTrue(getPropertyInfo(element, "attribute").isListedAsParametrization());
    }

}