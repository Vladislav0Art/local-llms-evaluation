package com.netflix.frigga.ami;

public class GeneratedTestParseNameNonString {

    @Test
    public void testParseNameNonString() {
        // Arrange
        String amiName = 123;

        // Act
        AppVersion parsedName = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(parsedName);
    }

}