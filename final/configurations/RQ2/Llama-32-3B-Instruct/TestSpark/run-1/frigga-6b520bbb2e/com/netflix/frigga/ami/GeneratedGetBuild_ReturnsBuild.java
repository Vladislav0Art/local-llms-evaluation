package com.netflix.frigga.ami;

public class GeneratedGetBuild_ReturnsBuild {

    @Test
    public void getBuild_ReturnsBuild() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        String build = appVersion.getBuild();

        // Assert
        assertEquals("1234", build);
    }

}