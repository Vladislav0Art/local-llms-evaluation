package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumberNotPresent {

    @Test
    public void testGetBuildNumberNotPresent() {
        // Arrange
        AppVersion appVersion = new AppVersion();

        // Act and Assert
        assertEquals("", appVersion.getBuildNumber());
    }

}