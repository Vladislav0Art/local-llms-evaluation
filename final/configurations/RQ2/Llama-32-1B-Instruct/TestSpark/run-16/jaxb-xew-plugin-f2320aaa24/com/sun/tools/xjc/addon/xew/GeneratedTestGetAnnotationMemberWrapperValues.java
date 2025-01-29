package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotationMemberWrapperValues {

    @Test
    public void testGetAnnotationMemberWrapperValues() {
        // Arrange
        JAnnotatable annotation = mock(JAnnotatable.class);

        // Act
        List<Object> values = getAnnotation(annotation, CElementPropertyInfo.class).get();

        // Assert
        assertEquals(1, values.size());
    }

}