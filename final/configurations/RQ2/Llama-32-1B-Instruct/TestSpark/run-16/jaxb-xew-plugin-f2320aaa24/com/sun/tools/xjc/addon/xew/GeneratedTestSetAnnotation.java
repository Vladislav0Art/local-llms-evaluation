package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetAnnotation {

    @Test
    public void testSetAnnotation() {
        // Arrange
        JAnnotatable annotation = mock(JAnnotatable.class);

        // Act
        setAnnotation(annotation, CElementPropertyInfo.class, new CustomizationUtils());

        // Assert
        assertEquals("customization", getAnnotation(annotation).getCustomization());
    }

}