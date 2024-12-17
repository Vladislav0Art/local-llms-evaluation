package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobNameNotPresent {

    @Test
    public void testGetBuildJobNameNotPresent() {
        // Arrange
        AppVersion appVersion = new AppVersion();

        // Act and Assert
        assertEquals("", appVersion.getBuildJobName());
    }

}