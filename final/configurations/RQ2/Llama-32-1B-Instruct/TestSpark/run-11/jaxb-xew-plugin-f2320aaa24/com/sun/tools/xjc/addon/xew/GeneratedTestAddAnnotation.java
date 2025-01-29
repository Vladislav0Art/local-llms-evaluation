package com.sun.tools.xjc.addon.xew;

public class GeneratedTestAddAnnotation {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testAddAnnotation() {
        // Given
        Element element = new Element();
        addAnnotation(element);

        // When
        container.addClass(element);

        // Then
        getAnnotation(element).addAnnotation();
    }

}