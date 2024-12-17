package com.netflix.frigga.ami;

public class GeneratedTestParseNameEmptyString {

    @Test
    public void testParseNameEmptyString() {
        // Arrange
        String amiName = "";

        // Act
        AppVersion parsedName = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(parsedName);
    }

}