package com.sun.tools.xjc.addon.xew;

public class GeneratedAddAnnotationTest {

    @Test
    public void addAnnotationTest() {
        // Given
        JClass obj = null;
        String annotationValue = "value";

        // When
        String result = XmlElementWrapperPlugin.addAnnotation(obj, annotationValue);

        // Then
        assertEquals("value", result);
    }

}