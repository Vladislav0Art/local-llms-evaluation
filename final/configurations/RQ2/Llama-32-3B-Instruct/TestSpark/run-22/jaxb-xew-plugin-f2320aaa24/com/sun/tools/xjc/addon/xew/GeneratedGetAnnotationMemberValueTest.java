package com.sun.tools.xjc.addon.xew;

public class GeneratedGetAnnotationMemberValueTest {

    @Test
    public void getAnnotationMemberValueTest() {
        // Given
        JClass obj = null;
        String propertyValue = "propertyValue";

        // When
        String result = XmlElementWrapperPlugin.getAnnotationMemberValue(obj, propertyValue);

        // Then
        assertEquals(propertyValue, result);
    }

}