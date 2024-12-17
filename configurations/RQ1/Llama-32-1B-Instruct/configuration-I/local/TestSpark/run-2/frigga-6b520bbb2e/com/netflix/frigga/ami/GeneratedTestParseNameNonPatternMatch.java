package com.netflix.frigga.ami;

public class GeneratedTestParseNameNonPatternMatch {

    @Test
    public void testParseNameNonPatternMatch() {
        // Arrange
        String amiName = "invalid-pattern";

        // Act
        AppVersion parsedName = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(parsedName);
    }

}