package com.netflix.frigga.ami;

public class GeneratedParseNameTest_EmptyAmiName {

    private AppVersion appVersion;
    private String amiName;

    @Test
    public void parseNameTest_EmptyAmiName() {
        // Arrange
        amiName = "";

        // Act
        appVersion = AppVersion.parseName(amiName);

        // Assert
        assertNull(appVersion);
    }
}

}