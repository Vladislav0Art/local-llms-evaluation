package com.sun.tools.xjc.addon.xew;

public class GeneratedCopyAnnotationMemberValueTest {

    @Test
    public void copyAnnotationMemberValueTest() {
        // Given
        JClass obj = null;
        String propertyValue = "propertyValue";

        // When
        String result = XmlElementWrapperPlugin.copyAnnotationMemberValue(obj, propertyValue);

        // Then
        assertEquals("propertyValue", result);
    }

}