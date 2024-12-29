package com.netflix.frigga.ami;

public class GeneratedEquals_SameAppVersion_ReturnsTrue {

    @Test
    public void equals_SameAppVersion_ReturnsTrue() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act and Assert
        boolean result = appVersion.equals(appVersion);
        assertTrue(result);
    }

}