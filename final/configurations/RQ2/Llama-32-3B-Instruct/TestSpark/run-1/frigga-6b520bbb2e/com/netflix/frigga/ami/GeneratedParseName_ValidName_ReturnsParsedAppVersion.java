package com.netflix.frigga.ami;

public class GeneratedParseName_ValidName_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidName_ReturnsParsedAppVersion() {
        // Arrange
        String amiName = "1.0-ami-1234";

        // Act
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);

        // Assert
        assertEquals("1", parsedAppVersion.getVersion());
        assertEquals("ami", parsedAppVersion.getPackageName());
        assertEquals("1234", parsedAppVersion.getBuildNumber());
    }

}