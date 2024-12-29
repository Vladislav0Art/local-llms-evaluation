package com.netflix.frigga.ami;

public class GeneratedParseName_InvalidFormat_ThrowsParseException {

    @Test
    public void parseName_InvalidFormat_ThrowsParseException() {
        // Arrange
        String amiName = "invalid-ami-name";

        // Act and Assert
        assertNotNull(AppVersion.parseName(amiName));
    }

}