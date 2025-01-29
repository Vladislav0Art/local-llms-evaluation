package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPropertyInfo {

    @Test
    public void testGetPropertyInfo() {
        // Arrange
        JElement element = mock(JElement.class);

        // Act
        CPropertyInfo propertyInfo = getAnnotation(element, CPropertyInfo.class).get();

        // Assert
        assertEquals("propertyName", propertyInfo.getDisplayName());
    }

}