package com.netflix.frigga.ami;

public class GeneratedGetVersion_ReturnsVersion {

    @Test
    public void getVersion_ReturnsVersion() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        String version = appVersion.getVersion();

        // Assert
        assertEquals("1.0", version);
    }

}