package com.sun.tools.xjc.addon.xew;

public class GeneratedCopyFieldsTest {

    @Test
    public void copyFieldsTest() {
        // Given
        JClass obj = null;
        Map<String, Object> fields = new HashMap<>();

        // When
        Map<String, Object> result = XmlElementWrapperPlugin.copyFields(obj, fields);

        // Then
        assertTrue(result.isEmpty());
    }

}