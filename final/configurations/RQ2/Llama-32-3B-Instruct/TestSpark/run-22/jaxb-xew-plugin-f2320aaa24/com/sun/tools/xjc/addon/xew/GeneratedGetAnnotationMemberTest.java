package com.sun.tools.xjc.addon.xew;

public class GeneratedGetAnnotationMemberTest {

    @Test
    public void getAnnotationMemberTest() {
        // Given
        JClass obj = null;
        String propertyValue = "propertyValue";

        // When
        String result = XmlElementWrapperPlugin.getAnnotationMember(obj, propertyValue);

        // Then
        assertEquals(propertyValue, result);
    }

}