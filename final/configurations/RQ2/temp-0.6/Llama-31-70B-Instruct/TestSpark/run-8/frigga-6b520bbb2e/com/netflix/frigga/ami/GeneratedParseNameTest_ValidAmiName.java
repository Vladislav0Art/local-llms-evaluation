package com.netflix.frigga.ami;

public class GeneratedParseNameTest_ValidAmiName {

    private AppVersion appVersion;
    private String amiName;

    @Test
    public void parseNameTest_ValidAmiName() {
        // Arrange
        amiName = "ami-name";

        // Act
        appVersion = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(appVersion);
    }

}