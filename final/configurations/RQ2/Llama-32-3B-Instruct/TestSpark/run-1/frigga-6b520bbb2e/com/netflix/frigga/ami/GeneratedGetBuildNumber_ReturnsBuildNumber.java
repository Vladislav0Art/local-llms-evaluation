package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_ReturnsBuildNumber {

    @Test
    public void getBuildNumber_ReturnsBuildNumber() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        String buildNumber = appVersion.getBuildNumber();

        // Assert
        assertEquals("1234", buildNumber);
    }

}