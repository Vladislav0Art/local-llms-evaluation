package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotation {

    @Test
    public void testGetAnnotation() {
        // Arrange
        JAnnotatable annotation = mock(JAnnotatable.class);

        // Act
        ObjectUtils.setField(annotation, "customization", new CustomizationUtils());

        // Assert
        assertEquals("customization", getAnnotation(annotation).getCustomization());
    }

}