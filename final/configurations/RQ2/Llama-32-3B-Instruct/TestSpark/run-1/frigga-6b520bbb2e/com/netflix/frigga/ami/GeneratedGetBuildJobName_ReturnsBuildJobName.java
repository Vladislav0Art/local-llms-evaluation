package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_ReturnsBuildJobName {

    @Test
    public void getBuildJobName_ReturnsBuildJobName() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        String buildJobName = appVersion.getBuildJobName();

        // Assert
        assertEquals("1234", buildJobName);
    }

}