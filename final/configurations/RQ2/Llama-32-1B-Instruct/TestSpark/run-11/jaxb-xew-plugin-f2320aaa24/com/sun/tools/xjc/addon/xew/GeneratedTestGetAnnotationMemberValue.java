package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotationMemberValue {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testGetAnnotationMemberValue() {
        // Given
        Element element = new Element();
        addAnnotation(element, "annotation");

        // When
        getAnnotationMemberValue(element, "attribute");

        // Then
        assertNotNull(getAnnotation(element).getAttribute());
    }

}