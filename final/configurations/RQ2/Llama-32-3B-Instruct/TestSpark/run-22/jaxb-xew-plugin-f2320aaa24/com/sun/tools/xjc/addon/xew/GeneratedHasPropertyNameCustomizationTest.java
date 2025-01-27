package com.sun.tools.xjc.addon.xew;

public class GeneratedHasPropertyNameCustomizationTest {

    @Test
    public void hasPropertyNameCustomizationTest() {
        // Given
        JClass obj = null;

        // When
        boolean result = XmlElementWrapperPlugin.hasPropertyNameCustomization(obj);

        // Then
        assertTrue(result);
    }

}