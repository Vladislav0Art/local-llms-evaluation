package com.sun.tools.xjc.addon.xew;

public class GeneratedGetAnnotationTest {

    @Test
    public void getAnnotationTest() {
        // Given
        JClass obj = null;
        String annotationValue = "value";

        // When
        String result = XmlElementWrapperPlugin.getAnnotation(obj, annotationValue);

        // Then
        assertEquals(annotationValue, result);
    }

}