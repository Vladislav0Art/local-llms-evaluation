package com.netflix.frigga.ami;

public class GeneratedTestToStringEmptyString {

    @Test
    public void testToStringEmptyString() {
        // Arrange
        String amiName = "";

        // Act
        String result = AppVersion.toString(amiName);

        // Assert
        assertNotNull(result);
    }

}