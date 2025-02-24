package com.netflix.frigga.ami;

public class GeneratedParseNameTest_NullAmiName {

    private AppVersion appVersion;
    private String amiName;

    @Test
    public void parseNameTest_NullAmiName() {
        // Arrange
        amiName = null;

        // Act
        appVersion = AppVersion.parseName(amiName);

        // Assert
        assertNull(appVersion);
    }

}