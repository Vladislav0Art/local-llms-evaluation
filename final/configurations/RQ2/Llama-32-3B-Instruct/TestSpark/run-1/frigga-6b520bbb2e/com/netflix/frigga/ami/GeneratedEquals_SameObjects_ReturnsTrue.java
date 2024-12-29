package com.netflix.frigga.ami;

public class GeneratedEquals_SameObjects_ReturnsTrue {

    @Test
    public void equals_SameObjects_ReturnsTrue() {
        // Arrange
        AppVersion appVersion1 = new AppVersion("1.0", "ami-1234");
        AppVersion appVersion2 = new AppVersion("1.0", "ami-1234");

        // Act
        boolean result = appVersion1.equals(appVersion2);

        // Assert
        assertTrue(result);
    }

}