package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetAnnotationMemberValues {

    @Test
    public void testSetAnnotationMemberValues() {
        // Arrange
        JAnnotatable annotation = mock(JAnnotatable.class);

        // Act
        setAnnotation(annotation, CElementPropertyInfo.class, new CustomizationUtils());

        // Assert
        assertEquals(1, getAnnotation(annotation).getCustomization().getCustomizations().size());
    }

}