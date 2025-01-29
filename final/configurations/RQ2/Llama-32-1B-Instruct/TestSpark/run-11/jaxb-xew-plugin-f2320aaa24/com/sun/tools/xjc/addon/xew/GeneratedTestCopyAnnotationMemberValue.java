package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyAnnotationMemberValue {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testCopyAnnotationMemberValue() {
        // Given
        Element element = new Element();

        // When
        copyAnnotationMemberValue(element);

        // Then
        assertEquals("value", getAnnotation(element).getValue());
    }

}