package com.netflix.frigga.ami;

public class GeneratedTestParseNameNull {

    @Test
    public void testParseNameNull() {
        // Arrange
        String amiName = null;

        // Act
        AppVersion parsedName = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(parsedName);
    }

}